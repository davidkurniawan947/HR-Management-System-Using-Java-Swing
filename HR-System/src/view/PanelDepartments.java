/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import control.DepartmentsDao;
import control.RegionsDao;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Countries;
import model.Departments;
import model.Locations;
import model.Regions;

/**
 *
 * @author MSI
 */
public class PanelDepartments extends javax.swing.JPanel implements ListSelectionListener{
    RegionsDao daoRegions;
    DepartmentsDao daoDepart;
    Locations locat;
    DefaultTableModel dataDep;
    List<Regions> dataReg;
    List<Countries> dataCou;
    List<Locations> dataLoc;
    private Departments depart;
    
    public PanelDepartments() {
        initComponents();
        daoRegions = new RegionsDao();
        daoDepart = new DepartmentsDao();
        dataDep = (DefaultTableModel)tabelDep.getModel();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        postal = new javax.swing.JTextField();
        city = new javax.swing.JComboBox<>();
        cou = new javax.swing.JComboBox<>();
        reg = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        del = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        street = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDep = new javax.swing.JTable();

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kelola Data Department", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setText("ID");

        jLabel3.setText("Name");

        jLabel4.setText("Region");

        jLabel5.setText("Country");

        jLabel6.setText("City");

        jLabel7.setText("Postal Code");

        jLabel8.setText("State Province");

        jLabel9.setText("Street Address");

        state.setEditable(false);

        postal.setEditable(false);

        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        city.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cityPropertyChange(evt);
            }
        });

        cou.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couActionPerformed(evt);
            }
        });
        cou.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                couPropertyChange(evt);
            }
        });

        reg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        reg.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                regPropertyChange(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

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

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        street.setEditable(false);
        street.setColumns(20);
        street.setRows(5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(city, javax.swing.GroupLayout.Alignment.LEADING, 0, 188, Short.MAX_VALUE)
                            .addComponent(cou, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reg, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(postal)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                            .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(state)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
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
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(del)
                    .addComponent(save))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 333;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 1, 0, 0);
        add(jPanel1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Kelola Master Data Department");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 105, 0, 0);
        add(jLabel1, gridBagConstraints);

        tabelDep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department ID", "Department Name", "Street Address", "Postal Code", "City", "State Province", "Country Name", "Region Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelDep);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 478;
        gridBagConstraints.ipady = 694;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 0, 12);
        add(jScrollPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void cityPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cityPropertyChange
        try {
            locat = dataLoc.get(city.getSelectedIndex());
            postal.setText(locat.getPostalCode());
            state.setText(locat.getStateProvince());
            street.setText(locat.getStreetAddress());
        } catch (Exception e) {
            locat = new Locations();
            postal.setText("");
            state.setText("");
            street.setText("");
        }
    }//GEN-LAST:event_cityPropertyChange

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        try {
            locat = dataLoc.get(city.getSelectedIndex());
            postal.setText(locat.getPostalCode());
            state.setText(locat.getStateProvince());
            street.setText(locat.getStreetAddress());
        } catch (Exception e) {
            locat = new Locations();
            postal.setText("");
            state.setText("");
            street.setText("");
        } 
    }//GEN-LAST:event_cityActionPerformed

    private void couActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couActionPerformed
        try {
            dataLoc = daoRegions.getAllDataLocations(((Countries)dataCou.get(cou.getSelectedIndex())).getCountryId().intValue());
            listLocation();
            if (depart.getDepartmentId() == null) {
                city.setSelectedIndex(0);
            } else {
                city.setSelectedItem(depart.getLocationId().getCity());
            } 
        } catch (Exception e) {
            locat = new Locations();
            postal.setText("");
            state.setText("");
            street.setText("");
        }
    }//GEN-LAST:event_couActionPerformed

    private void couPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_couPropertyChange
        try {
            dataLoc = daoRegions.getAllDataLocations(((Countries)dataCou.get(cou.getSelectedIndex())).getCountryId().intValue());
            listLocation();
            if (depart.getDepartmentId() == null) {
                city.setSelectedIndex(0);
            } else {
                city.setSelectedItem(depart.getLocationId().getCity());
            } 
        } catch (Exception e) {
            locat = new Locations();
            postal.setText("");
            state.setText("");
            street.setText("");
        }
    }//GEN-LAST:event_couPropertyChange

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        try {
            dataCou = daoRegions.getAllDataCountries(((Regions)dataReg.get(reg.getSelectedIndex())).getRegionId().intValue());
            listCountry();
            if (depart.getDepartmentId() == null) {
                cou.setSelectedIndex(0);
            } else {
                cou.setSelectedItem(depart.getLocationId().getCountryId().getCountryName());
            } 
        } catch (Exception e) {
            locat= new Locations();
            postal.setText("");
            state.setText("");
            street.setText("");
        } 
    }//GEN-LAST:event_regActionPerformed

    private void regPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_regPropertyChange
        try {
            dataCou = daoRegions.getAllDataCountries(((Regions)dataReg.get(reg.getSelectedIndex())).getRegionId().intValue());
            listCountry();
            if (depart.getDepartmentId() == null) {
                cou.setSelectedIndex(0);
            } else {
                cou.setSelectedItem(depart.getLocationId().getCountryId().getCountryName());
            } 
        } catch (Exception e) {
            locat= new Locations();
            postal.setText("");
            state.setText("");
            street.setText("");
        }
    }//GEN-LAST:event_regPropertyChange

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        boolean no = false;
        try {
            depart.setLocationId(locat);
            no = true;
        } catch (Exception exception) {}
        if (name.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Department Name is required!", "Warning Message", 2);
        } else if (!no) {
            JOptionPane.showMessageDialog(this, "City is required!", "Warning Message", 2);
        } else {
            save();
        }
    }//GEN-LAST:event_saveActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        delete();
    }//GEN-LAST:event_delActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
    }//GEN-LAST:event_resetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> city;
    private javax.swing.JComboBox<String> cou;
    private javax.swing.JButton del;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField postal;
    private javax.swing.JComboBox<String> reg;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTextField state;
    private javax.swing.JTextArea street;
    private javax.swing.JTable tabelDep;
    // End of variables declaration//GEN-END:variables
    public void reset() {
        depart = new Departments();
        id.setText("");
        name.setText("");
        listRegion();
        reg.setSelectedIndex(0);
        postal.setText("");
        state.setText("");
        street.setText("");
        ShowDepartList();
    }
  
    private void save() {
        if (depart.getDepartmentId() == null) {
            depart.setDepartmentName(name.getText().trim());
            if (daoDepart.insertData(depart)) {
                JOptionPane.showMessageDialog(this, "Data Department berhasil ditambah!", "Information Message", 1);
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "Data Department gagal ditambah!", "Warning Message", 2);
            } 
        } else {
            depart.setDepartmentName(name.getText().trim());
            if (daoDepart.updateData(depart)) {
                JOptionPane.showMessageDialog(this, "Data Department berhasil diubah!", "Information Message", 1);
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "Data Department gagal diubah!", "Warning Message", 2);
            } 
        } 
    }
  
    private void delete() {
        if (depart.getDepartmentId() == null) {
            JOptionPane.showMessageDialog(this, "Data Department tidak ada!", "Warning Message", 2);
        } else if (depart.getEmployeesList().isEmpty()) {
            if (JOptionPane.showConfirmDialog(this, "Apakah Anda akan menghapus Data Department?", "Confirmation Delete", 2, 3) == 0) {
                if (daoDepart.deleteData(depart)) {
                    JOptionPane.showMessageDialog(this, "Data Department berhasil dihapus!", "Information Message", 1);
                    reset();
                } else {
                    JOptionPane.showMessageDialog(this, "Data Department gagal dihapus!", "Warning Message", 2);
                } 
            } else {
                JOptionPane.showMessageDialog(this, "Data Department batal dihapus!", "Information Message", 1);
            } 
        } else {
            JOptionPane.showMessageDialog(this, "Data Department tidak dapat dihapus!", "Warning Message", 2);
        } 
    }
  
    private void ShowDepartList() {
        tabelDep.getSelectionModel().removeListSelectionListener(this);
        dataDep.getDataVector().removeAllElements();
        for (Departments d : daoDepart.getAllData()) {
            dataDep.addRow(new Object[] { 
            d.getDepartmentId(), 
            d.getDepartmentName(), 
            (d.getLocationId() == null) ? "-" : (d.getLocationId().getStreetAddress().isEmpty() ? "-" : d.getLocationId().getStreetAddress()), 
            (d.getLocationId() == null) ? "-" : ((d.getLocationId().getPostalCode() == null || d.getLocationId().getPostalCode().isEmpty()) ? "-" : d.getLocationId().getPostalCode()), 
            (d.getLocationId() == null) ? "-" : d.getLocationId().getCity(), 
            (d.getLocationId() == null) ? "-" : ((d.getLocationId().getStateProvince() == null || d.getLocationId().getStateProvince().isEmpty()) ? "-" : d.getLocationId().getStateProvince()), 
            (d.getLocationId() == null) ? "-" : ((d.getLocationId().getCountryId() == null) ? "-" : d.getLocationId().getCountryId().getCountryName()), 
            (d.getLocationId() == null) ? "-" : ((d.getLocationId().getCountryId() == null) ? "-" : ((d.getLocationId().getCountryId().getRegionId() == null) ? "-" : d.getLocationId().getCountryId().getRegionId().getRegionName())) });
        } 
        tabelDep.getSelectionModel().addListSelectionListener(this);
    }
    
        public void valueChanged(ListSelectionEvent e) {
        if (e.getSource() == tabelDep.getSelectionModel())
            try {
                depart = daoDepart.getData(Integer.parseInt(tabelDep.getValueAt(tabelDep.getSelectedRow(), 0).toString()));
                id.setText(depart.getDepartmentId().toString());
                name.setText(depart.getDepartmentName());
                reg.setSelectedItem(depart.getLocationId().getCountryId().getRegionId().getRegionName());
                cou.setSelectedItem(depart.getLocationId().getCountryId().getCountryName());
                city.setSelectedItem(depart.getLocationId().getCity());
                street.setText(depart.getLocationId().getStreetAddress());
                postal.setText(depart.getLocationId().getPostalCode());
                state.setText(depart.getLocationId().getStateProvince());
            } catch (Exception exception) {} 
    }
  
    public void listRegion() {
        dataReg = daoRegions.getAllData();
        String[] data = new String[dataReg.size()];
        for (int i = 0; i < data.length; i++)
            data[i] = ((Regions)dataReg.get(i)).getRegionName(); 
            reg.setModel(new DefaultComboBoxModel<>(data));
    }
  
    public void listCountry() {
        String[] data = new String[dataCou.size()];
        for (int i = 0; i < data.length; i++)
            data[i] = ((Countries)dataCou.get(i)).getCountryName(); 
            cou.setModel(new DefaultComboBoxModel<>(data));
    }
  
    public void listLocation() {
        String[] data = new String[dataLoc.size()];
        for (int i = 0; i < data.length; i++)
            data[i] = ((Locations)dataLoc.get(i)).getCity(); 
            city.setModel(new DefaultComboBoxModel<>(data));
    }
}

