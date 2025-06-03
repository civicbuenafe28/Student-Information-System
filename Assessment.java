/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalActivity1;

/**
 *
 * @author Civic
 */
public abstract class Assessment {
    private String studentName;
    private String course;
    private int yearLevel;
    private double amountPerUnit;
    private int totalUnits;
    private String modeOfPayment;
    private double totalAmount;
    private double discount;
    private double interest;
    private double downPayment;
    private double prelimPayment;
    private double midtermPayment;
    private double finalPayment;

    // Constructor for initial fee calculation
    public Assessment() {}

    // Constructor for full assessment
    public Assessment(String studentName, String course, int yearLevel, 
                             double amountPerUnit, int totalUnits, String modeOfPayment) {
        this.studentName = studentName;
        this.course = course;
        this.yearLevel = yearLevel;
        this.amountPerUnit = amountPerUnit;
        this.totalUnits = totalUnits;
        this.modeOfPayment = modeOfPayment;
    }

    // Abstract method to be implemented by subclasses
    public abstract void calculateSpecificFees();

    public void calculateFees(String course, int yearLevel) {
        switch(course) {
            case "BSCS":
                if (yearLevel == 1) {
                    amountPerUnit = 1700.00;
                } else if (yearLevel == 2) {
                    amountPerUnit = 1800.00;
                } else if (yearLevel == 3) {
                    amountPerUnit = 1900.00;
                } else if (yearLevel == 4) {
                    amountPerUnit = 2000.00;
                } else {
                    amountPerUnit = 1700.00; // Default for BSCS
                }
                break;
            case "BSIT":
                if (yearLevel == 1) {
                    amountPerUnit = 1500.00;
                } else if (yearLevel == 2) {
                    amountPerUnit = 1600.00;
                } else if (yearLevel == 3) {
                    amountPerUnit = 1700.00;
                } else if (yearLevel == 4) {
                    amountPerUnit = 1800.00;
                } else {
                    amountPerUnit = 1500.00; // Default for BSIT
                }
                break;
            case "BSEMC":
                if (yearLevel == 1) {
                    amountPerUnit = 1400.00;
                } else if (yearLevel == 2) {
                    amountPerUnit = 1500.00;
                } else if (yearLevel == 3) {
                    amountPerUnit = 1600.00;
                } else if (yearLevel == 4) {
                    amountPerUnit = 1700.00;
                } else {
                    amountPerUnit = 1400.00; // Default for BSBA
                }
                break;
            default:
                amountPerUnit = 1300.00;
        }
    }

    public void calculateFees() {
        totalAmount = amountPerUnit * totalUnits;

        if (modeOfPayment.equals("Cash")) {
            discount = totalAmount * 0.10;
            interest = 0;
            totalAmount -= discount;
            downPayment = 0;
            prelimPayment = totalAmount / 3;
            midtermPayment = totalAmount / 3;
            finalPayment = totalAmount / 3;
        } else {
            interest = totalAmount * 0.10;
            discount = 0;
            totalAmount += interest;
            downPayment = totalAmount * 0.30;
            double remainingBalance = totalAmount - downPayment;
            prelimPayment = remainingBalance / 3;
            midtermPayment = remainingBalance / 3;
            finalPayment = remainingBalance / 3;
        }
    }

    // Getters
    public double getAmountPerUnit() { return amountPerUnit; }
    public double getTotalAmount() { return totalAmount; }
    public double getDiscount() { return discount; }
    public double getInterest() { return interest; }
    public double getDownPayment() { return downPayment; }
    public double getPrelimPayment() { return prelimPayment; }
    public double getMidtermPayment() { return midtermPayment; }
    public double getFinalPayment() { return finalPayment; }
}