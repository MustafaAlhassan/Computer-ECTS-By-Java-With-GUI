package Frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditStudent extends javax.swing.JFrame {

    public EditStudent() {
        initComponents();
        fillTable();
    }

    public void fillTable() {
        try {
            String url = "jdbc:ucanaccess://Data Base/ComputerECTS.accdb";
            Connection conn = DriverManager.getConnection(url);
            Statement st = conn.createStatement();

            String sql = "Select * from Students";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) NameAndID.getModel();
            while (rs.next()) {
                String name = rs.getString(1);
                String id = rs.getString(2);
                model.addRow(new Object[]{id, name});
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public boolean IsStudentPresent(String StudentName) {
        try {
            String url = "jdbc:ucanaccess://Data Base/ComputerECTS.accdb";
            Connection conn = DriverManager.getConnection(url);

            String sql = "SELECT FullName FROM Students";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase(StudentName)) {
                    rs.close();
                    pst.close();
                    conn.close();
                    return true;
                }
            }
            rs.close(); pst.close(); conn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        editStudent = new javax.swing.JButton();
        studentDetails2 = new javax.swing.JButton();
        addDegree = new javax.swing.JButton();
        EditStudentDegree = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        studentName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        restore = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        NameAndID = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Student");

        jPanel1.setBackground(new java.awt.Color(175, 193, 208));
        jPanel1.setPreferredSize(new java.awt.Dimension(804, 395));

        jPanel7.setBackground(new java.awt.Color(11, 19, 32));
        jPanel7.setToolTipText("");

        editStudent.setBackground(new java.awt.Color(175, 193, 208));
        editStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editStudent.setForeground(new java.awt.Color(11, 19, 32));
        editStudent.setText("Edit Student");
        editStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentActionPerformed(evt);
            }
        });

        studentDetails2.setBackground(new java.awt.Color(175, 193, 208));
        studentDetails2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studentDetails2.setForeground(new java.awt.Color(11, 19, 32));
        studentDetails2.setText("Student Details");
        studentDetails2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDetails2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditStudentDegree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDegree, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(studentDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(editStudent)
                .addGap(18, 18, 18)
                .addComponent(studentDetails2)
                .addGap(18, 18, 18)
                .addComponent(EditStudentDegree)
                .addGap(18, 18, 18)
                .addComponent(addDegree)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(11, 19, 32));

        logout.setBackground(new java.awt.Color(175, 193, 208));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(11, 19, 32));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(11, 19, 32));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(175, 193, 208));
        jLabel4.setText("Student Name");

        studentName.setBackground(new java.awt.Color(175, 193, 208));
        studentName.setForeground(new java.awt.Color(11, 19, 32));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentName)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel4)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(studentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel3.setBackground(new java.awt.Color(11, 19, 32));

        add.setBackground(new java.awt.Color(175, 193, 208));
        add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(11, 19, 32));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        remove.setBackground(new java.awt.Color(175, 193, 208));
        remove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        remove.setForeground(new java.awt.Color(11, 19, 32));
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        restore.setBackground(new java.awt.Color(175, 193, 208));
        restore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        restore.setForeground(new java.awt.Color(11, 19, 32));
        restore.setText("Restore");
        restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(175, 193, 208));
        update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(11, 19, 32));
        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remove, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(add)
                .addGap(18, 18, 18)
                .addComponent(restore)
                .addGap(18, 18, 18)
                .addComponent(remove)
                .addGap(18, 18, 18)
                .addComponent(update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(11, 19, 32));

        NameAndID.setBackground(new java.awt.Color(175, 193, 208));
        NameAndID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        NameAndID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameAndIDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(NameAndID);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editStudentActionPerformed

    private void studentDetails2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDetails2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new StudentDetials().setVisible(true);
    }//GEN-LAST:event_studentDetails2ActionPerformed

    private void addDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDegreeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddDegree().setVisible(true);
    }//GEN-LAST:event_addDegreeActionPerformed

    private void EditStudentDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStudentDegreeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new EditDegree().setVisible(true);
    }//GEN-LAST:event_EditStudentDegreeActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_logout1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {
            String studentFullName = studentName.getText().trim();
            if(IsStudentPresent(studentFullName)){
                JOptionPane.showMessageDialog(this, "This Student Name " + studentFullName + " is exists in Data Base",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (studentFullName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Student name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String url = "jdbc:ucanaccess://Data Base/ComputerECTS.accdb";
            Connection conn = DriverManager.getConnection(url);
            // Insert the student's full name into the Students table
            String insertSql = "INSERT INTO Students (FullName) VALUES (?)";
            PreparedStatement pstInsert = conn.prepareStatement(insertSql);
            pstInsert.setString(1, studentFullName); pstInsert.executeUpdate();
            // Retrieve the student's ID based on the full name
            String selectSql = "SELECT StudentID FROM Students WHERE FullName = ?";
            PreparedStatement pstSelect = conn.prepareStatement(selectSql); pstSelect.setString(1, studentFullName);
            ResultSet rs = pstSelect.executeQuery();
            if (rs.next()) {
                String studentID = rs.getString("StudentID");
                DefaultTableModel model = (DefaultTableModel) NameAndID.getModel();
                model.addRow(new Object[]{studentID, studentFullName});
            }
            rs.close(); pstInsert.close(); pstSelect.close(); conn.close();
            studentName.setText(""); // Clear the text field after successful insertion
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        try {
            int selectedRow = NameAndID.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select a student to remove.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            DefaultTableModel model = (DefaultTableModel) NameAndID.getModel();
            String studentFullName = model.getValueAt(selectedRow, 1).toString();
            String url = "jdbc:ucanaccess://Data Base/ComputerECTS.accdb";
            Connection conn = DriverManager.getConnection(url);
            // Delete the student from the database based on the full name
            String deleteSql = "DELETE FROM Students WHERE FullName = ?";
            PreparedStatement pstDelete = conn.prepareStatement(deleteSql);
            pstDelete.setString(1, studentFullName);
            int rowsAffected = pstDelete.executeUpdate();

            if (rowsAffected > 0) {
                // Remove the student from the JTable
                model.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(this, "Student not found in the database.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            pstDelete.close(); conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_removeActionPerformed

    private void restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreActionPerformed
        try {
            int selectedRow = NameAndID.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select a student to restore.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            DefaultTableModel model = (DefaultTableModel) NameAndID.getModel();
            String studentFullName = model.getValueAt(selectedRow, 1).toString();
            // Assuming studentName is the JTextField where you want to restore the student's name
            studentName.setText(studentFullName);
            update.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_restoreActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            int selectedRow = NameAndID.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) NameAndID.getModel();
            String originalStudentName = model.getValueAt(selectedRow, 1).toString();
            String newStudentName = studentName.getText().trim();
            if (newStudentName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Student name cannot be empty.", 
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String url = "jdbc:ucanaccess://Data Base/ComputerECTS.accdb";
            Connection conn = DriverManager.getConnection(url);
            // Update the student name in the database
            String updateSql = "UPDATE Students SET FullName = ? WHERE FullName = ?";
            PreparedStatement pstUpdate = conn.prepareStatement(updateSql);
            pstUpdate.setString(1, newStudentName);
            pstUpdate.setString(2, originalStudentName);
            int rowsAffected = pstUpdate.executeUpdate();

            if (rowsAffected > 0) {
                // Update the student name in the JTable
                model.setValueAt(newStudentName, selectedRow, 1);
            }
            pstUpdate.close(); conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void NameAndIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameAndIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NameAndIDMouseClicked

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
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditStudentDegree;
    private javax.swing.JTable NameAndID;
    private javax.swing.JButton add;
    private javax.swing.JButton addDegree;
    private javax.swing.JButton editStudent;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JButton remove;
    private javax.swing.JButton restore;
    private javax.swing.JButton studentDetails2;
    private javax.swing.JTextField studentName;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
