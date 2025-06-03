/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalActivity1;

/**
 *
 * @author Civic
 */
public class Payment extends Assessment {
    
    // Constructor that calls the superclass constructor
    public Payment(String studentName, String course, int yearLevel, 
                   double amountPerUnit, int totalUnits, String modeOfPayment) {
        super(studentName, course, yearLevel, amountPerUnit, totalUnits, modeOfPayment);
    }

    @Override
    public void calculateSpecificFees() {
        // Calculate the total amount based on course and mode of payment
        calculateFees(); // Calls the method in the parent class
        
        // Additional logic specific to `Payment` can be added here if needed
        System.out.println("Calculating specific fees for " + getClass().getSimpleName());
        System.out.println("Student: " + super.getAmountPerUnit() + " Total Amount: " + super.getTotalAmount());
        
        // Example of how additional calculations might be added:
        if (super.getTotalAmount() > 50000) {
            System.out.println("Note: Large payment amount. Additional checks might be required.");
        }
    }
    
    public void displayPaymentBreakdown() {
        System.out.println("Payment Breakdown for " + getClass().getSimpleName());
        System.out.println("Down Payment: " + super.getDownPayment());
        System.out.println("Prelim Payment: " + super.getPrelimPayment());
        System.out.println("Midterm Payment: " + super.getMidtermPayment());
        System.out.println("Final Payment: " + super.getFinalPayment());
    }
}
