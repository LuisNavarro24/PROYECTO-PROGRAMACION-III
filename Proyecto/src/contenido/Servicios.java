
package contenido;

import informacion.MySqlConn;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Servicios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Servicios
     */
     MySqlConn conn= new MySqlConn();
    public Servicios() {
        initComponents();
        this.jCheckBoxLimpieza.setEnabled(false);
            this.jCheckBoxCafeteria.setEnabled(false);
            this.jCheckBoxSpa.setEnabled(false);
            this.jCheckBoxGimnasio.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldHabi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInfo = new javax.swing.JTable();
        jCheckBoxLimpieza = new javax.swing.JCheckBox();
        jCheckBoxCafeteria = new javax.swing.JCheckBox();
        jCheckBoxSpa = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaInfo = new javax.swing.JTextArea();
        jCheckBoxGimnasio = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Servicios extra");
        setPreferredSize(new java.awt.Dimension(747, 402));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setText("Num.Habitacion");

        jTextFieldHabi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldHabiKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Servicios extra disponibles");

        jButtonGuardar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jTableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(jTableInfo);

        jCheckBoxLimpieza.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jCheckBoxLimpieza.setText("Limpieza");

        jCheckBoxCafeteria.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jCheckBoxCafeteria.setText("Cafeteria");

        jCheckBoxSpa.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jCheckBoxSpa.setText("Spa");

        jTextAreaInfo.setColumns(20);
        jTextAreaInfo.setRows(5);
        jScrollPane3.setViewportView(jTextAreaInfo);

        jCheckBoxGimnasio.setText("Gimnasio");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGuardar)
                            .addComponent(jCheckBoxLimpieza)
                            .addComponent(jCheckBoxCafeteria)
                            .addComponent(jCheckBoxSpa)
                            .addComponent(jCheckBoxGimnasio)
                            .addComponent(jButton1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldHabi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxLimpieza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxCafeteria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxSpa)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxGimnasio)
                        .addGap(25, 25, 25)
                        .addComponent(jButtonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldHabiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHabiKeyReleased
        // TODO add your handling code here:
      
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           String query = "select * from registro where Num_Habitacion = "+"'"+
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
            
            Object datos [][]= new Object[n][10];
            for (int i = 0; i < n; i++) {
                try{
                    datos[i][1]= this.conn.rs.getInt(1);
                    datos[i][2]= this.conn.rs.getInt(3);
                    datos[i][0]= this.conn.rs.getString(4);
                    
                    this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error 2...");
                }
                
            }
            String columnas[]={"Nombre","Habitacion","Piso"};
            jTableInfo.setModel(new DefaultTableModel(datos,columnas));
            System.out.println("Tabla lista");
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos...");
            this.jCheckBoxLimpieza.setEnabled(false);
            this.jCheckBoxCafeteria.setEnabled(false);
            this.jCheckBoxSpa.setEnabled(false);
            this.jCheckBoxGimnasio.setEnabled(false);
            this.jButtonGuardar.setEnabled(false);
        }
        
        }
        
        
        
        
        
    }//GEN-LAST:event_jTextFieldHabiKeyReleased

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
       
    
        int habi=Integer.valueOf(this.jTextFieldHabi.getText());
        String query = "select * from registro where Num_Habitacion = "+"'"+
                    Integer.valueOf(this.jTextFieldHabi.getText())+"'";
        this.conn.Consult(query);
        String name="";
        int n=0;
        try{
            this.conn.rs.last();
            n=this.conn.rs.getRow();
            this.conn.rs.first();
        }catch(Exception e){
            System.out.println("Error 1...");
        }
        if(n!=0){
                try{
                
                    name= this.conn.rs.getString(4);
                    
                    //this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error 2...");
                }
 
        }
        
        int lim,caf,spa,gim;
        if(this.jCheckBoxLimpieza.isSelected()){
            lim=1;
        }else{
            lim=0;
        }
        if(this.jCheckBoxCafeteria.isSelected()){
            caf=1;
        }else{
            caf=0;
        }
        if(this.jCheckBoxSpa.isSelected()){
            spa=1;
        }else{
            spa=0;
        }
        if(this.jCheckBoxGimnasio.isSelected()){
            gim=1;
        }else{
            gim=0;
        }
        
         String parte1 = "Insert into servicios (Num_Habitacion, Nombre, Servicio_cuarto, Servicio_bar, Servicio_spa, Servicio_gym) VALUES (";
                     String parte2 = "'"+habi+"','"+name+"','"+lim+"','"+caf+"','"+spa+"','"+gim+"')";
                    String query2 = parte1 + parte2;
         this.conn.Update(query2);  
         JOptionPane.showMessageDialog(this, "Guardado con exito");
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.jTextAreaInfo.setText("");
        this.jTextFieldHabi.setText("");
        this.jCheckBoxLimpieza.setSelected(false);
        this.jCheckBoxCafeteria.setSelected(false);
        this.jCheckBoxSpa.setSelected(false);
        this.jCheckBoxGimnasio.setSelected(false);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JCheckBox jCheckBoxCafeteria;
    private javax.swing.JCheckBox jCheckBoxGimnasio;
    private javax.swing.JCheckBox jCheckBoxLimpieza;
    private javax.swing.JCheckBox jCheckBoxSpa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableInfo;
    private javax.swing.JTextArea jTextAreaInfo;
    private javax.swing.JTextField jTextFieldHabi;
    // End of variables declaration//GEN-END:variables
}
