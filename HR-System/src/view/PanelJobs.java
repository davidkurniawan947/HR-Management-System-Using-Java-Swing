/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import control.JobsDao;
import control.RegionsDao;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Jobs;

/**
 *
 * @author MSI
 */
public class PanelJobs extends javax.swing.JPanel implements ListSelectionListener{
    JobsDao daoJobs;
    DefaultTableModel dataJobs;
    private Jobs job;
    
    public PanelJobs() {
        initComponents();
        daoJobs = new JobsDao();
        dataJobs = (DefaultTableModel) tabelJobs.getModel();
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        del = new javax.swing.JButton();
        rest = new javax.swing.JButton();
        min = new javax.swing.JFormattedTextField();
        max = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelJobs = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kelola Data Job", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setText("ID");

        jLabel3.setText("Title");

        jLabel4.setText("Min Salary");

        jLabel5.setText("Max Salary");

        id.setEditable(false);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        rest.setText("Reset");
        rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(del))
                    .addComponent(id)
                    .addComponent(title)
                    .addComponent(min)
                    .addComponent(max))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(del))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rest)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 325;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 13, 0);
        add(jPanel1, gridBagConstraints);

        tabelJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Job Title", "Min Salary", "Max Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelJobs);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 510;
        gridBagConstraints.ipady = 521;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 13, 12);
        add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Kelola Master Data Jobs");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 132, 0, 0);
        add(jLabel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (title.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Job Title is required!", "Warning Message", 2);
        } else if (Double.parseDouble(min.getValue().toString().trim()) <= 0.0D) {
            JOptionPane.showMessageDialog(this, "Min Salary is required!", "Warning Message", 2);
        } else if (Double.parseDouble(max.getValue().toString().trim()) <= 0.0D) {
            JOptionPane.showMessageDialog(this, "Max Salary is required!", "Warning Message", 2);
        } else if (Double.parseDouble(min.getValue().toString().trim()) > Double.parseDouble(max.getValue().toString().trim())) {
            JOptionPane.showMessageDialog(this, "Min Salay must lower than Max Salary!", "Warning Message", 2);
        } else {
        save();
        } 
    }//GEN-LAST:event_saveActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        delete();
    }//GEN-LAST:event_delActionPerformed

    private void restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restActionPerformed
        reset();
    }//GEN-LAST:event_restActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton del;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField max;
    private javax.swing.JFormattedTextField min;
    private javax.swing.JButton rest;
    private javax.swing.JButton save;
    private javax.swing.JTable tabelJobs;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
    private void save() {
        if (job.getJobId() == null) {
            job.setJobTitle(title.getText().trim());
            job.setMinSalary(Double.valueOf(Double.parseDouble(min.getValue().toString().trim())));
            job.setMaxSalary(Double.valueOf(Double.parseDouble(max.getValue().toString().trim())));
            if (daoJobs.insertData(job)) {
                JOptionPane.showMessageDialog(this, "Data Job berhasil ditambah!", "Information Message", 1);
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "Data Job gagal ditambah!", "Warning Message", 2);
            } 
        } else {
            job.setJobTitle(title.getText().trim());
            job.setMinSalary(Double.valueOf(Double.parseDouble(min.getValue().toString().trim())));
            job.setMaxSalary(Double.valueOf(Double.parseDouble(max.getValue().toString().trim())));
            if (daoJobs.updateData(job)) {
                JOptionPane.showMessageDialog(this, "Data Job berhasil diubah!", "Information Message", 1);
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "Data Job gagal diubah!", "Warning Message", 2);
            } 
        } 
    }
  
    private void delete() {
        if (job.getJobId() == null) {
            JOptionPane.showMessageDialog(this, "Data Job tidak ada!", "Warning Message", 2);
        } else if (job.getEmployeesList().isEmpty()) {
            if (JOptionPane.showConfirmDialog(this, "Apakah Anda akan menghapus Data Job?", "Confirmation Delete", 2, 3) == 0) {
                if (daoJobs.deleteData(job)) {
                    JOptionPane.showMessageDialog(this, "Data Job berhasil dihapus!", "Information Message", 1);
                    reset();
                } else {
                    JOptionPane.showMessageDialog(this, "Data Job gagal dihapus!", "Warning Message", 2);
                } 
            } else {
                JOptionPane.showMessageDialog(this, "Data Job batal dihapus!", "Information Message", 1);
            } 
        } else {
            JOptionPane.showMessageDialog(this, "Data Job tidak dapat dihapus!", "Warning Message", 2);
        } 
    }

    public void reset() {
        job = new Jobs();
        id.setText("");
        title.setText("");
        min.setValue(Double.valueOf(0.0D));
        max.setValue(Double.valueOf(0.0D));
        ShowJobsList();
    } 

    public void valueChanged(ListSelectionEvent e) {
        if (e.getSource() == this.tabelJobs.getSelectionModel())
            try {
                job = daoJobs.getData(Integer.parseInt(this.tabelJobs.getValueAt(this.tabelJobs.getSelectedRow(), 0).toString()));
                id.setText(job.getJobId().toString());
                title.setText(job.getJobTitle());
                min.setValue(job.getMinSalary());
                max.setValue(job.getMaxSalary());
            } catch (Exception exception) {} 
    }
  
    private void ShowJobsList() {
        tabelJobs.getSelectionModel().removeListSelectionListener(this);
        dataJobs.getDataVector().removeAllElements();
        for (Jobs h : daoJobs.getAllData()) {
            dataJobs.addRow(new Object[] { 
            h.getJobId(), 
            h.getJobTitle(), 
            h.getMinSalary(), 
            h.getMaxSalary() });
        } 
        this.tabelJobs.getSelectionModel().addListSelectionListener(this);
    }
}