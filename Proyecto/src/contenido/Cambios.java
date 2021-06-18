/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenido;

import informacion.MySqlConn;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kapu
 */
public class Cambios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cambios
     */
    MySqlConn conn = new MySqlConn();
    public Cambios() {
        initComponents();
        Icon img = new ImageIcon(getClass().getResource("/imagenes/Logo.png"));
        
        JOptionPane.showMessageDialog(rootPane,"Por el momento solo esta disponible\n"
                + "el cambio de servicio","Mensaje",JOptionPane.PLAIN_MESSAGE,img);
       // this.jButtonVer.setEnabled(false);
            this.jCheckBoxLimpieza.setEnabled(false);
            this.jCheckBoxCafeteria.setEnabled(false);
            this.jCheckBoxSpa.setEnabled(false);
            this.jCheckBoxGimnasio.setEnabled(false);
            this.jCheckBoxNin.setEnabled(false);
            this.jButtonGuardar.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelHues = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldHabi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jCheckBoxNin = new javax.swing.JCheckBox();
        jCheckBoxGimnasio = new javax.swing.JCheckBox();
        jCheckBoxSpa = new javax.swing.JCheckBox();
        jCheckBoxCafeteria = new javax.swing.JCheckBox();
        jCheckBoxLimpieza = new javax.swing.JCheckBox();
        jComboBoxCambio = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaServicios = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        jLabelHues.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabelHues.setText("En espera...");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("Huesped");

        jTextFieldHabi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldHabiKeyReleased(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel4.setText("Cambios");

        jButtonGuardar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jCheckBoxNin.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jCheckBoxNin.setText("Niñera");

        jCheckBoxGimnasio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jCheckBoxGimnasio.setText("Gimnasio");

        jCheckBoxSpa.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jCheckBoxSpa.setText("Spa");

        jCheckBoxCafeteria.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jCheckBoxCafeteria.setText("Cafeteria");

        jCheckBoxLimpieza.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jCheckBoxLimpieza.setText("Limpieza");

        jComboBoxCambio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jComboBoxCambio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agregar", "Quitar" }));
        jComboBoxCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCambioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("Desea cancelar o agregar mas servicios?");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Servicios actuales");

        jTextAreaServicios.setColumns(20);
        jTextAreaServicios.setRows(5);
        jScrollPane1.setViewportView(jTextAreaServicios);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("Numero de habitacion ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jCheckBoxLimpieza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBoxCafeteria)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxSpa)
                                .addGap(24, 24, 24)
                                .addComponent(jCheckBoxGimnasio)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxNin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonGuardar)
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelHues, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(228, 228, 228))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jTextFieldHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(332, 509, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(227, 227, 227)
                            .addComponent(jLabel5)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelHues)
                        .addGap(45, 45, 45)
                        .addComponent(jComboBoxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxLimpieza)
                    .addComponent(jCheckBoxCafeteria)
                    .addComponent(jCheckBoxSpa)
                    .addComponent(jCheckBoxNin)
                    .addComponent(jCheckBoxGimnasio))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonGuardar)
                        .addGap(34, 34, 34)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTextFieldHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)
                    .addComponent(jLabel3)
                    .addGap(212, 212, 212)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldHabiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHabiKeyReleased
        // TODO add your handling code here:
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           String query = "select * from servicios where Num_Habitacion = "+"'"+
                    Integer.valueOf(this.jTextFieldHabi.getText())+"'";
       
        this.conn.Consult(query);
        int n=0;
        try{
            this.conn.rs.last();
            n=this.conn.rs.getRow();
            this.conn.rs.first();
        }catch(Exception e){
            System.out.println("Error 1...");
        }
        if(n!=0){
            
            
            
           this.jCheckBoxLimpieza.setEnabled(true);
            this.jCheckBoxCafeteria.setEnabled(true);
            this.jCheckBoxSpa.setEnabled(true);
            this.jCheckBoxGimnasio.setEnabled(true);
            this.jButtonGuardar.setEnabled(true);
            this.jCheckBoxNin.setEnabled(true);
            

            for (int i = 0; i < n; i++) {
                try{
                   this.jLabelHues.setText(this.conn.rs.getNString(2));

                    if(this.conn.rs.getInt(3)==1){
                    // this.jCheckBoxLimpieza.setEnabled(false);
                     this.jTextAreaServicios.append("Limpieza\n");
                    }
                    if(this.conn.rs.getInt(4)==1){
                    //    this.jCheckBoxCafeteria.setEnabled(false);
                     this.jTextAreaServicios.append("Cafeteria\n");
                    }
                    if(this.conn.rs.getInt(5)==1){
                    // this.jCheckBoxSpa.setEnabled(false);
                     this.jTextAreaServicios.append("Spa\n");
                    }
                    if(this.conn.rs.getInt(6)==1){
                   //    this.jCheckBoxGimnasio.setEnabled(false);
                      this.jTextAreaServicios.append("Gimnasio\n");
                    }
                    if(this.conn.rs.getInt(7)==1){
                  //      this.jCheckBoxNin.setEnabled(false);
                        this.jTextAreaServicios.append("Niñera\n");
                      
                    }
               
                    
                    this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error 2...");
                }
                
            }
            
        }else{
            this.jLabelHues.setText("En espera...");
            JOptionPane.showMessageDialog(this, "No hay datos...");
            //this.jButtonVer.setEnabled(false);
            this.jCheckBoxLimpieza.setEnabled(false);
            this.jCheckBoxCafeteria.setEnabled(false);
            this.jCheckBoxSpa.setEnabled(false);
            this.jCheckBoxGimnasio.setEnabled(false);
            this.jCheckBoxNin.setEnabled(false);
            this.jButtonGuardar.setEnabled(false);
        }
        
        }
            
        
        
    }//GEN-LAST:event_jTextFieldHabiKeyReleased

    private void jComboBoxCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCambioActionPerformed
        // TODO add your handling code here:
        int sel=this.jComboBoxCambio.getSelectedIndex();
         String query = "select * from servicios where Num_Habitacion = "+"'"+
                    Integer.valueOf(this.jTextFieldHabi.getText())+"'";
       
        this.conn.Consult(query);
        int n=0;
        try{
            this.conn.rs.last();
            n=this.conn.rs.getRow();
            this.conn.rs.first();
        }catch(Exception e){
            System.out.println("Error 1...");
        }
        if(n!=0){
            
            
         for (int i = 0; i < n; i++) {
                try{
 
                    if(sel==0){
                          if(this.conn.rs.getInt(3)==1){
                     this.jCheckBoxLimpieza.setEnabled(false);
                   
                    }else{
                              this.jCheckBoxLimpieza.setEnabled(true);
                          }
                    if(this.conn.rs.getInt(4)==1){
                        this.jCheckBoxCafeteria.setEnabled(false);
                    
                    }else{
                        this.jCheckBoxCafeteria.setEnabled(true);
                    }
                    
                    if(this.conn.rs.getInt(5)==1){
                     this.jCheckBoxSpa.setEnabled(false);
                  
                    }else{
                        this.jCheckBoxSpa.setEnabled(true);
                    }
                    if(this.conn.rs.getInt(6)==1){
                       this.jCheckBoxGimnasio.setEnabled(false);
                
                    }else{
                        this.jCheckBoxGimnasio.setEnabled(true);
                    }
                    if(this.conn.rs.getInt(7)==1){
                        this.jCheckBoxNin.setEnabled(false);
                    }else{
                        this.jCheckBoxNin.setEnabled(true);
                    }
                    }else if (sel==1){
                        System.out.println(sel);
                           if(this.conn.rs.getInt(3)==1){
                     this.jCheckBoxLimpieza.setEnabled(true);
                    }else{
                               this.jCheckBoxLimpieza.setEnabled(false);
                           }
                    if(this.conn.rs.getInt(4)==1){
                        this.jCheckBoxCafeteria.setEnabled(true);
                    }else{
                        this.jCheckBoxCafeteria.setEnabled(false);
                    }
                    if(this.conn.rs.getInt(5)==1){
                     this.jCheckBoxSpa.setEnabled(true);
                  
                    }else{
                        this.jCheckBoxSpa.setEnabled(false);
                    }
                    if(this.conn.rs.getInt(6)==1){
                       this.jCheckBoxGimnasio.setEnabled(true);
                
                    }else{
                        this.jCheckBoxGimnasio.setEnabled(false);
                    }
                    if(this.conn.rs.getInt(7)==1){
                        this.jCheckBoxNin.setEnabled(true);
                    }else{
                        this.jCheckBoxNin.setEnabled(false);
                    }  
                        
                      
                    }
                    
                   this.jLabelHues.setText(this.conn.rs.getNString(2));

                  
               
                    
                    //this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error 2...");
                }
                
            }
        }else{
            
        }
        
    }//GEN-LAST:event_jComboBoxCambioActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        String query = "select * from servicios where Num_Habitacion = "+"'"+
                    Integer.valueOf(this.jTextFieldHabi.getText())+"'";
       int habi=0;
       String name="";
        this.conn.Consult(query);
        int n=0;
        int lim=0,caf=0,spa=0,gim=0,nin=0;
        
        try{
            this.conn.rs.last();
            n=this.conn.rs.getRow();
            this.conn.rs.first();
        }catch(Exception e){
            System.out.println("Error 1...");
        }
        if(n!=0){
            
                try{
            habi=this.conn.rs.getInt(1);
            name=this.conn.rs.getString(2);
            lim=this.conn.rs.getInt(3);
            caf=this.conn.rs.getInt(4);
            spa=this.conn.rs.getInt(5);
            gim=this.conn.rs.getInt(6);
            nin=this.conn.rs.getInt(7);
                    //this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error 2...");
                }
                
            
        }

       // int lim,caf,spa,gim,nin;
       
        if(this.jComboBoxCambio.getSelectedIndex()==0){
            if(this.jCheckBoxLimpieza.isSelected())
            lim=1;
          
        if(this.jCheckBoxCafeteria.isSelected())
            caf=1;
            
        if(this.jCheckBoxSpa.isSelected())
            spa=1;
            
        if(this.jCheckBoxGimnasio.isSelected())
            gim=1;
            
        if(this.jCheckBoxNin.isSelected())
            nin=1;
            
        
        }else if(this.jComboBoxCambio.getSelectedIndex()==1){
          
        if(this.jCheckBoxLimpieza.isSelected())
            lim=0;
            
        if(this.jCheckBoxCafeteria.isSelected())
            caf=0;
           
        if(this.jCheckBoxSpa.isSelected())
            spa=0;
            
            if(this.jCheckBoxGimnasio.isSelected())
            gim=0;
           
        
        if(this.jCheckBoxNin.isSelected())
            nin=0;
           
        }
        System.out.println("limpieza"+lim);
        System.out.println("Cafe"+caf);
        System.out.println("Spa"+spa);
        System.out.println("Gimnasio"+gim);
        System.out.println("Ninera"+nin);
               
        
        query ="UPDATE servicios SET Num_Habitacion='"+habi+"',Nombre='" +name+ "',Servicio_cuarto='" +lim+"',Servicio_bar='" +caf+"',Servicio_spa='" +spa+"',Servicio_gym='"+gim+"',Servicio_nin='" +nin+ "' WHERE Num_Habitacion='" + habi + "'"; 
        this.conn.Update(query); 
        
        if(this.jComboBoxCambio.getSelectedIndex()==0){
 JOptionPane.showMessageDialog(this, "Servicios agregados");
            this.jTextArea2.append("Servicios agregados");
             
        }else{
            
            JOptionPane.showMessageDialog(this, "Servicios removidos");
            
         String query2 = "select * from servicios where Num_Habitacion = "+"'"+habi+"'";
       int habi2=0;
       String name2="";
        this.conn.Consult(query2);
        int n2=0;

        try{
            this.conn.rs.last();
            n2=this.conn.rs.getRow();
            this.conn.rs.first();
        }catch(Exception e){
            System.out.println("Error 1...");
        }

        if(n!=0){
            
                try{
            habi=this.conn.rs.getInt(1);
            name=this.conn.rs.getString(2);
            lim=this.conn.rs.getInt(3);
            caf=this.conn.rs.getInt(4);
            spa=this.conn.rs.getInt(5);
            gim=this.conn.rs.getInt(6);
            nin=this.conn.rs.getInt(7);
            
            if(lim==0&&caf==0&&spa==0&&gim==0&&nin==0){
            String query3= "delete from servicios where Num_Habitacion= "+"'"+habi+"'";
            this.conn.Update(query3);
            JOptionPane.showMessageDialog(this, "Se a removido del sistema de servicios");
                
            }
            
 
                    //this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error 2...");
                }
                
            
        }   
            
            
            //this.jTextArea2.append("Servicios removidos");
        }
        
        dispose();
        
        
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JCheckBox jCheckBoxCafeteria;
    private javax.swing.JCheckBox jCheckBoxGimnasio;
    private javax.swing.JCheckBox jCheckBoxLimpieza;
    private javax.swing.JCheckBox jCheckBoxNin;
    private javax.swing.JCheckBox jCheckBoxSpa;
    private javax.swing.JComboBox jComboBoxCambio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelHues;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextAreaServicios;
    private javax.swing.JTextField jTextFieldHabi;
    // End of variables declaration//GEN-END:variables
}
