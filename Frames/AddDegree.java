package Frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddDegree extends javax.swing.JFrame {

    public AddDegree() {
        initComponents();

    }
    JLabel subjectArr[] = new JLabel[6];
    JTextField subjectDegree[] = new JTextField[6];

    public void implementSubjectAndDegree() {
        for (int i = 0; i < 6; i++) {
            subjectArr[i] = new JLabel();
            subjectDegree[i] = new JTextField();
        }
        subjectArr[0] = subj1;
        subjectArr[1] = subj2;
        subjectArr[2] = subj3;
        subjectArr[3] = subj4;
        subjectArr[4] = subj5;
        subjectArr[5] = subj6;
        subjectDegree[0] = deg1;
        subjectDegree[1] = deg2;
        subjectDegree[2] = deg3;
        subjectDegree[3] = deg4;
        subjectDegree[4] = deg5;
        subjectDegree[5] = deg6;
    }

    public void disEableTextField() {
        for (int i = 0; i < 6; i++) {
            subjectDegree[i].setEnabled(false);
        }
    }

    public void makeEmptySubjectLabel() {
        for (int i = 0; i < 6; i++) {
            subjectArr[i].setText("");
            subjectDegree[i].setText("");
        }
    }

    public boolean isStudentTakeSemestersBefore(String anySubject, String studentID) {
        try {
            String url = "jdbc:ucanaccess://Data Base/ComputerECTS.accdb";
            Connection conn = DriverManager.getConnection(url);
            String sql = "SELECT SubjectName FROM SubjectAndDegree WHERE StudentID = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, studentID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equals(anySubject)) {
                    rs.close(); pst.close(); conn.close();
                    return true;
                }
            }
            rs.close();
            pst.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        logout2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        studentName = new javax.swing.JTextField();
        Semesters = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        deg1 = new javax.swing.JTextField();
        subj1 = new javax.swing.JLabel();
        deg2 = new javax.swing.JTextField();
        subj2 = new javax.swing.JLabel();
        deg3 = new javax.swing.JTextField();
        subj3 = new javax.swing.JLabel();
        deg4 = new javax.swing.JTextField();
        subj4 = new javax.swing.JLabel();
        deg5 = new javax.swing.JTextField();
        subj5 = new javax.swing.JLabel();
        deg6 = new javax.swing.JTextField();
        subj6 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        editStudent = new javax.swing.JButton();
        studentDetails = new javax.swing.JButton();
        addDegree = new javax.swing.JButton();
        EditStudentDegree = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Degree");

        jPanel3.setBackground(new java.awt.Color(175, 193, 208));
        jPanel3.setPreferredSize(new java.awt.Dimension(804, 395));

        jPanel7.setBackground(new java.awt.Color(11, 19, 32));

        logout2.setBackground(new java.awt.Color(175, 193, 208));
        logout2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logout2.setForeground(new java.awt.Color(11, 19, 32));
        logout2.setText("Logout");
        logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(logout2)
                .addGap(18, 18, 18))
        );

        jPanel1.setBackground(new java.awt.Color(11, 19, 32));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Name:");

        studentName.setBackground(new java.awt.Color(175, 193, 208));
        studentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameActionPerformed(evt);
            }
        });

        Semesters.setBackground(new java.awt.Color(28, 63, 96));
        Semesters.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Semesters.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8" }));
        Semesters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemestersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentName)
                .addGap(18, 18, 18)
                .addComponent(Semesters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Semesters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(11, 19, 32));
        jPanel2.setForeground(new java.awt.Color(11, 19, 32));

        deg1.setBackground(new java.awt.Color(175, 193, 208));
        deg1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        deg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deg1ActionPerformed(evt);
            }
        });

        subj1.setBackground(new java.awt.Color(255, 255, 255));
        subj1.setForeground(new java.awt.Color(255, 255, 255));
        subj1.setText("subject 1");
        subj1.setPreferredSize(new java.awt.Dimension(120, 20));

        deg2.setBackground(new java.awt.Color(175, 193, 208));
        deg2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        subj2.setBackground(new java.awt.Color(255, 255, 255));
        subj2.setForeground(new java.awt.Color(255, 255, 255));
        subj2.setText("subject 2");
        subj2.setPreferredSize(new java.awt.Dimension(120, 20));

        deg3.setBackground(new java.awt.Color(175, 193, 208));
        deg3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        subj3.setBackground(new java.awt.Color(255, 255, 255));
        subj3.setForeground(new java.awt.Color(255, 255, 255));
        subj3.setText("subject 3");
        subj3.setPreferredSize(new java.awt.Dimension(120, 20));

        deg4.setBackground(new java.awt.Color(175, 193, 208));
        deg4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        deg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deg4ActionPerformed(evt);
            }
        });

        subj4.setBackground(new java.awt.Color(255, 255, 255));
        subj4.setForeground(new java.awt.Color(255, 255, 255));
        subj4.setText("subject 4");
        subj4.setPreferredSize(new java.awt.Dimension(120, 20));

        deg5.setBackground(new java.awt.Color(175, 193, 208));
        deg5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        subj5.setBackground(new java.awt.Color(255, 255, 255));
        subj5.setForeground(new java.awt.Color(255, 255, 255));
        subj5.setText("subject 5");
        subj5.setPreferredSize(new java.awt.Dimension(120, 20));

        deg6.setBackground(new java.awt.Color(175, 193, 208));
        deg6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        subj6.setBackground(new java.awt.Color(255, 255, 255));
        subj6.setForeground(new java.awt.Color(255, 255, 255));
        subj6.setText("subject 6");
        subj6.setPreferredSize(new java.awt.Dimension(120, 20));

        add.setBackground(new java.awt.Color(175, 193, 208));
        add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add.setText("ADD");
        add.setEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(deg3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subj3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deg4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subj4, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(deg1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subj1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deg2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subj2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deg5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subj5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deg6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subj6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subj1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subj2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subj3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subj4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subj5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deg6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subj6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(add)
                .addGap(18, 18, 18))
        );

        jPanel6.setBackground(new java.awt.Color(11, 19, 32));
        jPanel6.setToolTipText("");

        editStudent.setBackground(new java.awt.Color(175, 193, 208));
        editStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editStudent.setForeground(new java.awt.Color(11, 19, 32));
        editStudent.setText("Edit Student");
        editStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentActionPerformed(evt);
            }
        });

        studentDetails.setBackground(new java.awt.Color(175, 193, 208));
        studentDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studentDetails.setForeground(new java.awt.Color(11, 19, 32));
        studentDetails.setText("Student Details");
        studentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDetailsActionPerformed(evt);
            }
        });

        addDegree.setBackground(new java.awt.Color(175, 193, 208));
        addDegree.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addDegree.setForeground(new java.awt.Color(11, 19, 32));
        addDegree.setText("Add Degree");
        addDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDegreeActionPerformed(evt);
            }
        });

        EditStudentDegree.setBackground(new java.awt.Color(175, 193, 208));
        EditStudentDegree.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EditStudentDegree.setForeground(new java.awt.Color(11, 19, 32));
        EditStudentDegree.setText("Edit Degree");
        EditStudentDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStudentDegreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditStudentDegree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDegree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(editStudent)
                .addGap(18, 18, 18)
                .addComponent(studentDetails)
                .addGap(18, 18, 18)
                .addComponent(EditStudentDegree)
                .addGap(18, 18, 18)
                .addComponent(addDegree)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SemestersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemestersActionPerformed
        implementSubjectAndDegree(); makeEmptySubjectLabel(); disEableTextField();
        String semester = "" + (Semesters.getSelectedIndex() + 1); add.setEnabled(true);
        try {
            String url = "jdbc:ucanaccess://Data Base/ComputerECTS.accdb";
            Connection conn = DriverManager.getConnection(url); Statement st = conn.createStatement(); 
            String sql = "Select Semester, SubjectName from Subjects"; ResultSet rs = st.executeQuery(sql); int i = 0;
            while (rs.next()) {
                if (rs.getString(1).equals(semester)) {
                    subjectArr[i].setText(rs.getString(2)); i++;
                } else if (rs.getString(1).equals(semester)) {
                    subjectArr[i].setText(rs.getString(2)); i++;
                } else if (rs.getString(1).equals(semester)) {
                    subjectArr[i].setText(rs.getString(2)); i++;
                } else if (rs.getString(1).equals(semester)) {
                    subjectArr[i].setText(rs.getString(2)); i++;
                } else if (rs.getString(1).equals(semester)) {
                    subjectArr[i].setText(rs.getString(2)); i++;
                } else if (rs.getString(1).equals(semester)) {
                    subjectArr[i].setText(rs.getString(2)); i++;
                } else if (rs.getString(1).equals(semester)) {
                    subjectArr[i].setText(rs.getString(2)); i++;
                } else if (rs.getString(1).equals(semester)) {
                    subjectArr[i].setText(rs.getString(2)); i++;
                }
            }
            for (int j = 0; j < 6; j++) 
                if (!subjectArr[j].getText().equals("")) subjectDegree[j].setEnabled(true);
            st.close();conn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_SemestersActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {
            if (studentName.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Name Field must not be left blank",
                        "", HEIGHT); return;
            }
            String url = "jdbc:ucanaccess://Data Base/ComputerECTS.accdb";
            Connection conn = DriverManager.getConnection(url);
            String sql = "SELECT StudentID FROM Students WHERE FullName = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, studentName.getText().trim());
            String studentID = "0"; ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                studentID = rs.getString("StudentID");
                boolean flag = isStudentTakeSemestersBefore(subjectArr[0].getText(),studentID);
                if(flag){
                    JOptionPane.showMessageDialog(rootPane, """
                                                        The grades related to this semester have already been recorded, so you 
                                                        can't post them again, but you can modify them in Edit Degree section""",
                            "",HEIGHT); return;
                }
                String sql1 = "INSERT INTO SubjectAndDegree (SubjectName, Degree, StudentID) VALUES (?, ?, ?)";
                PreparedStatement pst1 = conn.prepareStatement(sql1);
                for (int i = 0; i < 6; i++) {
                    if (subjectDegree[i].isEnabled()) {
                        if (subjectDegree[i].getText().equals("")) {
                            JOptionPane.showMessageDialog(rootPane, "Degree Fields must not be left blank",
                                    "",JOptionPane.ERROR_MESSAGE); return;
                        }
                        double degree = Double.parseDouble(subjectDegree[i].getText());
                        if (degree < 0 || degree > 100) {
                            JOptionPane.showMessageDialog(rootPane, "One of degree is above 100 or under 0",
                                    "",JOptionPane.ERROR_MESSAGE); return;
                        }
                    }
                }
                for (int i = 0; i < 6; i++) {
                    if (subjectDegree[i].isEnabled()) {
                        pst1.setString(1, subjectArr[i].getText());
                        pst1.setString(2, subjectDegree[i].getText());
                        pst1.setString(3, studentID); pst1.executeUpdate();
                    }
                }
                JOptionPane.showMessageDialog(rootPane, "Grades have been added successfully");
                add.setEnabled(false);  pst1.close();
            } else {
                System.out.println(studentName);
                JOptionPane.showMessageDialog(null, """
                It is not possible to add grades for a student who is not added to the system,
                So Add the student's name to the system in the Edit Student section,
                then come here and add Student's grades""","",HEIGHT);
            }
            rs.close(); pst.close(); conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addActionPerformed

    private void deg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deg4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deg4ActionPerformed

    private void deg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deg1ActionPerformed

    private void editStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new EditStudent().setVisible(true);
    }//GEN-LAST:event_editStudentActionPerformed

    private void studentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDetailsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new StudentDetials().setVisible(true);
    }//GEN-LAST:event_studentDetailsActionPerformed

    private void addDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDegreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDegreeActionPerformed

    private void EditStudentDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStudentDegreeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new EditDegree().setVisible(true);
    }//GEN-LAST:event_EditStudentDegreeActionPerformed

    private void studentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNameActionPerformed

    private void logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_logout2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDegree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditStudentDegree;
    private javax.swing.JComboBox<String> Semesters;
    private javax.swing.JButton add;
    private javax.swing.JButton addDegree;
    private javax.swing.JTextField deg1;
    private javax.swing.JTextField deg2;
    private javax.swing.JTextField deg3;
    private javax.swing.JTextField deg4;
    private javax.swing.JTextField deg5;
    private javax.swing.JTextField deg6;
    private javax.swing.JButton editStudent;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton logout2;
    private javax.swing.JButton studentDetails;
    private javax.swing.JTextField studentName;
    private javax.swing.JLabel subj1;
    private javax.swing.JLabel subj2;
    private javax.swing.JLabel subj3;
    private javax.swing.JLabel subj4;
    private javax.swing.JLabel subj5;
    private javax.swing.JLabel subj6;
    // End of variables declaration//GEN-END:variables
}
