package FinalActivity1;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class BuenafeFinalActivity1 extends javax.swing.JFrame {

    
    int count = 0;
    int xRow = 0;

    String name = "";
    String gender = "";
    String courseGrade = "";
    String studentNumber = "";
    
    int rowCount = 0;
    
    public BuenafeFinalActivity1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabbedPane = new javax.swing.JTabbedPane();
        informationTab = new javax.swing.JPanel();
        lastNameLabel = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        middleInitialLabel = new javax.swing.JLabel();
        yearLevelLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        studentTypeLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMiddleInitial = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        cmbYearLevel = new javax.swing.JComboBox<>();
        femaleRB = new javax.swing.JRadioButton();
        maleRB = new javax.swing.JRadioButton();
        cmbStudentType = new javax.swing.JComboBox<>();
        addStudentButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        informationTable = new javax.swing.JTable();
        cmbCourse = new javax.swing.JComboBox<>();
        genderLabel = new javax.swing.JLabel();
        gradeTab = new javax.swing.JPanel();
        studentNameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gradesTable = new javax.swing.JTable();
        prelimGradeLabel = new javax.swing.JLabel();
        txtPrelimGrade = new javax.swing.JTextField();
        midtermGradeLabel = new javax.swing.JLabel();
        txtMidtermGrade = new javax.swing.JTextField();
        semiFinalGradeLabel = new javax.swing.JLabel();
        finalGradeLabel = new javax.swing.JLabel();
        submitGradeButton = new javax.swing.JButton();
        txtFinalGrade = new javax.swing.JTextField();
        txtSemiFinalGrade = new javax.swing.JTextField();
        studentNamesCB = new javax.swing.JComboBox<>();
        assessmentTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbStudentName = new javax.swing.JComboBox<>();
        txtCourse = new javax.swing.JTextField();
        txtYearLevel = new javax.swing.JTextField();
        txtAmountPerUnit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotalUnits = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CashRB = new javax.swing.JRadioButton();
        InstallmentRB = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        AssessmentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPane.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        lastNameLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lastNameLabel.setText("LAST NAME");

        txtLastName.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        firstNameLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        firstNameLabel.setText("FIRST NAME");

        middleInitialLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        middleInitialLabel.setText("MIDDLE INITIAL");

        yearLevelLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        yearLevelLabel.setText("YEAR LEVEL");

        courseLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        courseLabel.setText("COURSE");

        studentTypeLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        studentTypeLabel.setText("STUDENT TYPE");

        jLabel7.setText("STUDENT TYPE");

        txtMiddleInitial.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        txtFirstName.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        cmbYearLevel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cmbYearLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));
        cmbYearLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYearLevelActionPerformed(evt);
            }
        });

        femaleRB.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        femaleRB.setText("Female");
        femaleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRBActionPerformed(evt);
            }
        });

        maleRB.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        maleRB.setText("Male");
        maleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRBActionPerformed(evt);
            }
        });

        cmbStudentType.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cmbStudentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Old", "New" }));

        addStudentButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        addStudentButton.setText("ADD STUDENT");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        informationTable.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        informationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student No.", "Name", "Year Level", "Course", "Gender", "Student Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(informationTable);

        cmbCourse.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSCS", "BSIT", "BSEMC", " ", " " }));
        cmbCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseActionPerformed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        genderLabel.setText("GENDER");

        javax.swing.GroupLayout informationTabLayout = new javax.swing.GroupLayout(informationTab);
        informationTab.setLayout(informationTabLayout);
        informationTabLayout.setHorizontalGroup(
            informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informationTabLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(1235, Short.MAX_VALUE))
                    .addGroup(informationTabLayout.createSequentialGroup()
                        .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(informationTabLayout.createSequentialGroup()
                                .addComponent(studentTypeLabel)
                                .addGap(24, 24, 24)
                                .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(cmbStudentType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(informationTabLayout.createSequentialGroup()
                                .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameLabel)
                                    .addComponent(firstNameLabel)
                                    .addComponent(middleInitialLabel)
                                    .addComponent(yearLevelLabel)
                                    .addComponent(genderLabel)
                                    .addComponent(courseLabel))
                                .addGap(24, 24, 24)
                                .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(informationTabLayout.createSequentialGroup()
                                        .addComponent(maleRB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(femaleRB))
                                    .addComponent(cmbCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMiddleInitial, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(txtLastName)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(cmbYearLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))))
        );
        informationTabLayout.setVerticalGroup(
            informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informationTabLayout.createSequentialGroup()
                        .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(middleInitialLabel)
                            .addComponent(txtMiddleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearLevelLabel)
                            .addComponent(cmbYearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseLabel)
                            .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderLabel)
                            .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(femaleRB)
                                .addComponent(maleRB)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(informationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentTypeLabel)
                            .addComponent(cmbStudentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addStudentButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("INFORMATION", informationTab);

        studentNameLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        studentNameLabel.setText("STUDENT NAME");

        gradesTable.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        gradesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student No.", "Name", "Course", "Prelim Grade", "Midterm Grade", "SemiFinal Grade", "Final Grade", "Semestral Grade", "Remarks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(gradesTable);

        prelimGradeLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        prelimGradeLabel.setText("PRELIM GRADE");

        midtermGradeLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        midtermGradeLabel.setText("MIDTERM GRADE");

        semiFinalGradeLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        semiFinalGradeLabel.setText("SEMI-FINAL GRADE");

        finalGradeLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        finalGradeLabel.setText("FINAL GRADE");

        submitGradeButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        submitGradeButton.setText("SUBMIT GRADE");
        submitGradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitGradeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradeTabLayout = new javax.swing.GroupLayout(gradeTab);
        gradeTab.setLayout(gradeTabLayout);
        gradeTabLayout.setHorizontalGroup(
            gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradeTabLayout.createSequentialGroup()
                        .addGroup(gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semiFinalGradeLabel)
                            .addComponent(finalGradeLabel))
                        .addGap(24, 24, 24)
                        .addGroup(gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitGradeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFinalGrade)
                            .addComponent(txtSemiFinalGrade)))
                    .addGroup(gradeTabLayout.createSequentialGroup()
                        .addGroup(gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNameLabel)
                            .addComponent(prelimGradeLabel)
                            .addComponent(midtermGradeLabel))
                        .addGap(35, 35, 35)
                        .addGroup(gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMidtermGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(txtPrelimGrade)
                            .addComponent(studentNamesCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gradeTabLayout.setVerticalGroup(
            gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradeTabLayout.createSequentialGroup()
                .addGroup(gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gradeTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, gradeTabLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentNameLabel)
                            .addComponent(studentNamesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prelimGradeLabel)
                            .addComponent(txtPrelimGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(midtermGradeLabel)
                            .addComponent(txtMidtermGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(semiFinalGradeLabel)
                            .addComponent(txtSemiFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(gradeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finalGradeLabel)
                            .addComponent(txtFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitGradeButton)))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        tabbedPane.addTab("GRADE", gradeTab);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setText("STUDENT NAME:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("COURSE:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("YEAR LEVEL:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setText("AMOUNT PER UNIT:");

        cmbStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStudentNameActionPerformed(evt);
            }
        });

        txtCourse.setEditable(false);
        txtCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseActionPerformed(evt);
            }
        });

        txtYearLevel.setEditable(false);
        txtYearLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearLevelActionPerformed(evt);
            }
        });

        txtAmountPerUnit.setEditable(false);
        txtAmountPerUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountPerUnitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setText("TOTAL UNITS:");

        txtTotalUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalUnitsActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setText("MODE OF PAYMENT:");

        buttonGroup1.add(CashRB);
        CashRB.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        CashRB.setText("Cash (10% Discount)");
        CashRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(InstallmentRB);
        InstallmentRB.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        InstallmentRB.setText("Installment (10% Interest)");
        InstallmentRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstallmentRBActionPerformed(evt);
            }
        });

        AssessmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Student Name", "Course", "Year Level", "Amount Per Unit", "Total Units", "Amount", "Mode of Payment", "Discount/Interest", "Down Payment", "Prelim", "Midterm", "Final", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(AssessmentTable);

        javax.swing.GroupLayout assessmentTabLayout = new javax.swing.GroupLayout(assessmentTab);
        assessmentTab.setLayout(assessmentTabLayout);
        assessmentTabLayout.setHorizontalGroup(
            assessmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assessmentTabLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(assessmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(assessmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbStudentName, 0, 184, Short.MAX_VALUE)
                    .addComponent(txtCourse)
                    .addComponent(txtYearLevel)
                    .addComponent(txtAmountPerUnit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(assessmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(assessmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotalUnits)
                    .addComponent(CashRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InstallmentRB, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                .addContainerGap(660, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        assessmentTabLayout.setVerticalGroup(
            assessmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assessmentTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assessmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(assessmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CashRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(assessmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtYearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InstallmentRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(assessmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAmountPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("ASSESSMENT", assessmentTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void maleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRBActionPerformed
        this.gender = "M";
        femaleRB.setSelected(false);
    }//GEN-LAST:event_maleRBActionPerformed

    private void femaleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRBActionPerformed
        this.gender = "F";
        maleRB.setSelected(false);
    }//GEN-LAST:event_femaleRBActionPerformed

    
    
    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        DefaultTableModel studentList = (DefaultTableModel) informationTable.getModel();
        
        this.name = txtLastName.getText() + ", " + txtFirstName.getText() +" " + txtMiddleInitial.getText();
        this.count++;
        
        String studentName = name.toUpperCase();
        String studentCourse = cmbCourse.getSelectedItem().toString();
        String studentYear = cmbYearLevel.getSelectedItem().toString();
        String studentGender = gender;
        String studentType = cmbStudentType.getSelectedItem().toString();
        
        //identify the values to be stored in the table
        Object[] row = {count, studentName, studentYear, studentCourse, studentGender, studentType};
        //add values to the table row
        studentList.addRow(row);
        
        //insert studentName in the combo box located in GRADE tab
        studentNamesCB.insertItemAt(studentList.getValueAt(this.xRow,1).toString(),this.xRow);
        cmbStudentName.insertItemAt(studentList.getValueAt(this.xRow,1).toString(),this.xRow);
        this.xRow++;
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void submitGradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitGradeButtonActionPerformed
        DefaultTableModel studentGradeList = (DefaultTableModel) gradesTable.getModel();
        DefaultTableModel studentList = (DefaultTableModel) informationTable.getModel();
        
        
        double prelim;
        double midterm; 
        double semifinal; 
        double finals; 
        double grade;
        
        
        String remarks = "";
        String equivalent= "";
        String studentName;
        
        
        studentName = studentNamesCB.getSelectedItem().toString();
        prelim = Double.parseDouble(txtPrelimGrade.getText());
        midterm = Double.parseDouble(txtMidtermGrade.getText());
        semifinal = Double.parseDouble(txtSemiFinalGrade.getText());
        finals = Double.parseDouble(txtFinalGrade.getText());
        
        grade = prelim * .20 + midterm *.20+ semifinal * .20 + finals *.40;
        
        
        if (grade >= 75) remarks = "PASSED";
        else remarks = "FAILED";
        
        
        //searching students from student table
        for(int rowsearch = 0; rowsearch < studentList.getRowCount(); rowsearch++) {
            
            if(studentName == studentList.getValueAt(rowsearch,1)) {
                //matching the selected student name from the combo box
                this.courseGrade = studentList.getValueAt(rowsearch,3).toString();
                this.studentNumber = studentList.getValueAt(rowsearch,0).toString();
            }
        }
        
        
        Object[] row = {
            this.studentNumber, 
            studentName, 
            this.courseGrade, 
            prelim, 
            midterm, 
            semifinal, 
            finals, 
            grade, 
            remarks
        };
        
        
        studentGradeList.addRow(row);        
    }//GEN-LAST:event_submitGradeButtonActionPerformed

    private void txtCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseActionPerformed
        // TODO add your handling code here:
        if (cmbCourse.getSelectedItem() != null) {
        String studentCourse = cmbCourse.getSelectedItem().toString();
        txtCourse.setText(studentCourse);
        updateFeeCalculations();
        } // TODO add your handling code here:
        String studentCourse = cmbCourse.getSelectedItem().toString();
    }//GEN-LAST:event_txtCourseActionPerformed

    private void txtYearLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearLevelActionPerformed

    private void cmbStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStudentNameActionPerformed
        // TODO add your handling code here:
        if (cmbStudentName.getSelectedItem() != null) {
            try {
                String selectedStudent = cmbStudentName.getSelectedItem().toString();
                updateStudentDetailsFromTable(selectedStudent);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, 
                "Error loading student details: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            }
    }
    }//GEN-LAST:event_cmbStudentNameActionPerformed

    private void updateStudentDetailsFromTable(String selectedStudent) {
    DefaultTableModel studentList = (DefaultTableModel) informationTable.getModel();
        boolean found = false;
    
        for(int i = 0; i < studentList.getRowCount(); i++) {
            if(selectedStudent.equals(studentList.getValueAt(i, 1))) {
                found = true;
                // Update text fields with student information
                txtCourse.setText(String.valueOf(studentList.getValueAt(i, 3)));
                txtYearLevel.setText(String.valueOf(studentList.getValueAt(i, 2)));
            
                // Calculate and display initial fees
                updateFeeCalculations();
                break;
            }
        }
    
        if (!found) {
            clearFields();
            JOptionPane.showMessageDialog(this, 
                "Student information not found.",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void updateFeeCalculations() {
        try {
            String course = txtCourse.getText();
            int yearLevel = Integer.parseInt(txtYearLevel.getText());
        
            Payment assessment = new Payment(
                "", // Empty student name as it's not needed for fee calculation
                course, 
                yearLevel, 
                0, // Temporary amount per unit 
                0, // Temporary total units
                "" // Empty mode of payment
            );
        
            assessment.calculateFees(course, yearLevel);
            txtAmountPerUnit.setText(String.format("%.2f", assessment.getAmountPerUnit()));
        
            // Enable/disable relevant fields based on data
            txtTotalUnits.setEnabled(true);
            CashRB.setEnabled(true);
            InstallmentRB.setEnabled(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Invalid year level format.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Error calculating fees: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
}
    
    private void txtAmountPerUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountPerUnitActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtAmountPerUnitActionPerformed

    private void txtTotalUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalUnitsActionPerformed
        // TODO add your handling code here:
        updateFeeCalculations();
    }//GEN-LAST:event_txtTotalUnitsActionPerformed

    private void CashRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashRBActionPerformed
        // TODO add your handling code here:
        calculateAndDisplayAssessment("Cash");
    }//GEN-LAST:event_CashRBActionPerformed

    private void InstallmentRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstallmentRBActionPerformed
        // TODO add your handling code here:
        calculateAndDisplayAssessment("Installment");
    }//GEN-LAST:event_InstallmentRBActionPerformed

    private void clearFields() {
    txtCourse.setText("");
    txtYearLevel.setText("");
    txtAmountPerUnit.setText("");
    txtTotalUnits.setText("");
    CashRB.setSelected(false);
    InstallmentRB.setSelected(false);
}

private void calculateAndDisplayAssessment(String modeOfPayment) {
    try {
            String studentName = cmbStudentName.getSelectedItem().toString();
            String course = txtCourse.getText();
            
            int yearLevel = Integer.parseInt(txtYearLevel.getText());
            double amountPerUnit = Double.parseDouble(txtAmountPerUnit.getText());
            int totalUnits = Integer.parseInt(txtTotalUnits.getText());
        
            Payment assessment = new Payment(studentName, course, yearLevel, amountPerUnit, totalUnits, modeOfPayment);
            assessment.calculateSpecificFees();
        
            // Calculate and display payment details
            double prelimPayment = assessment.getPrelimPayment();
            double midtermPayment = assessment.getMidtermPayment();
            double finalPayment = assessment.getFinalPayment();
            double amount = amountPerUnit * totalUnits;
            double totalAmount = assessment.getTotalAmount();
            double discountOrInterest = modeOfPayment.equals("Cash") ? assessment.getDiscount() : assessment.getInterest();
            double downPayment = assessment.getDownPayment();
            
            this.rowCount ++;
        
            DefaultTableModel model = (DefaultTableModel) AssessmentTable.getModel();
            Object[] rowData = {
                rowCount,
                studentName,
                course,
                yearLevel,
                amountPerUnit,
                totalUnits,
                amount,
                modeOfPayment,
                discountOrInterest,
                downPayment,
                prelimPayment,
                midtermPayment,
                finalPayment,
                totalAmount
            };
            model.addRow(rowData);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}
    
    private void cmbCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCourseActionPerformed

    private void cmbYearLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYearLevelActionPerformed
        // TODO add your handling code here:
        if (cmbYearLevel.getSelectedItem() != null) {
        txtYearLevel.setText(cmbYearLevel.getSelectedItem().toString());
        updateFeeCalculations();
    }
    }//GEN-LAST:event_cmbYearLevelActionPerformed

    
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            BuenafeFinalActivity1 tabs = new BuenafeFinalActivity1();
            tabs.setTitle("Student Information");
            tabs.setLocationRelativeTo(null);
            tabs.setVisible(true);
        }
    });
}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AssessmentTable;
    private javax.swing.JRadioButton CashRB;
    private javax.swing.JRadioButton InstallmentRB;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JPanel assessmentTab;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCourse;
    private javax.swing.JComboBox<String> cmbStudentName;
    private javax.swing.JComboBox<String> cmbStudentType;
    private javax.swing.JComboBox<String> cmbYearLevel;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.JLabel finalGradeLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel gradeTab;
    private javax.swing.JTable gradesTable;
    private javax.swing.JPanel informationTab;
    private javax.swing.JTable informationTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JRadioButton maleRB;
    private javax.swing.JLabel middleInitialLabel;
    private javax.swing.JLabel midtermGradeLabel;
    private javax.swing.JLabel prelimGradeLabel;
    private javax.swing.JLabel semiFinalGradeLabel;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JComboBox<String> studentNamesCB;
    private javax.swing.JLabel studentTypeLabel;
    private javax.swing.JButton submitGradeButton;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtAmountPerUnit;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtFinalGrade;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleInitial;
    private javax.swing.JTextField txtMidtermGrade;
    private javax.swing.JTextField txtPrelimGrade;
    private javax.swing.JTextField txtSemiFinalGrade;
    private javax.swing.JTextField txtTotalUnits;
    private javax.swing.JTextField txtYearLevel;
    private javax.swing.JLabel yearLevelLabel;
    // End of variables declaration//GEN-END:variables
}
