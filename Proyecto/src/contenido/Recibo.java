
package contenido;

import informacion.MySqlConn;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Recibo extends javax.swing.JFrame {
    
    MySqlConn conn= new MySqlConn();
    private int habi;
    public Recibo() {
        initComponents();
        this.setLocationRelativeTo(this);   
        
        this.jCheckBoxuno.setEnabled(false);
        this.jCheckBoxdos.setEnabled(false);
       // this.jCheckBoxdos.setSelected(true);
        
    }
    
    public Recibo(int habi){
        this.habi=habi;
        initComponents();
        this.setLocationRelativeTo(this);   
        
        this.jCheckBoxuno.setEnabled(false);
        this.jCheckBoxdos.setEnabled(false);
        Comprobante(habi);
    }
        
    public void Comprobante(int habi){
       
       int personas=0;
         String query = "select * from registro where Num_Habitacion = "+"'"+habi+"'";
         
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
                    this.jLabelHabitacion.setText(String.valueOf(this.conn.rs.getInt(1)));
                    //habi=this.conn.rs.getInt(1);
                    this.jLabelTiHabi.setText(this.conn.rs.getString(2));
                    
                    this.jLabelPiso.setText(String.valueOf(this.conn.rs.getInt(3)));
                    
                    this.jLabelHuesped.setText(this.conn.rs.getString(4));
                    
                    this.jLabelCiudad.setText(this.conn.rs.getString(5));
                    
                    this.jLabelTHues.setText(String.valueOf(this.conn.rs.getInt(6)+this.conn.rs.getInt(7)));
                    personas=this.conn.rs.getInt(7);
                    if(personas==1){
                        this.jCheckBoxuno.setSelected(true);
                    }else{
                        this.jCheckBoxdos.setSelected(true);
                    }
                    this.jLabelIn.setText(this.conn.rs.getString(8));
                   
                    this.jLabelOut.setText(this.conn.rs.getString(10));
                    
                    
            if(habi>=1&&habi<=10||habi>=16&&habi<=20){
                        this.jLabelLHues.setText("1");
            }else if(habi>=11&&habi<=13||habi>=21&&habi<=26){
                this.jLabelLHues.setText("2");
            }else{
               this.jLabelLHues.setText("3");
            }
                    
                    
                    
                    this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("No hay datos...");
                }
                
            }

        }else{
            JOptionPane.showMessageDialog(this, "No hay datos...");
        }
     
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBoxuno = new javax.swing.JCheckBox();
        jCheckBoxdos = new javax.swing.JCheckBox();
        jLabelHuesped = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelIn = new javax.swing.JLabel();
        jLabelOut = new javax.swing.JLabel();
        jLabelHabitacion = new javax.swing.JLabel();
        jLabelPiso = new javax.swing.JLabel();
        jLabelTiHabi = new javax.swing.JLabel();
        jLabelLHues = new javax.swing.JLabel();
        jLabelTHues = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("Huesped: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("Ciudad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("Fecha de ingreso");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("Fecha de salida");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("Num. Habitacion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("Piso");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setText("Tipo de Habitacion");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel10.setText("Limite de huespedes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel11.setText("Total huespedes");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jCheckBoxuno.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jCheckBoxuno.setText("1 Persona extra");
        jPanel1.add(jCheckBoxuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        jCheckBoxdos.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jCheckBoxdos.setText("2 Personas extra");
        jPanel1.add(jCheckBoxdos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabelHuesped.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabelHuesped.setText("En espera...");
        jPanel1.add(jLabelHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabelCiudad.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabelCiudad.setText("En espera...");
        jPanel1.add(jLabelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabelIn.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabelIn.setText("En espera...");
        jPanel1.add(jLabelIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabelOut.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabelOut.setText("En espera...");
        jPanel1.add(jLabelOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabelHabitacion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabelHabitacion.setText("En espera...");
        jPanel1.add(jLabelHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabelPiso.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabelPiso.setText("En espera...");
        jPanel1.add(jLabelPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jLabelTiHabi.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabelTiHabi.setText("En espera...");
        jPanel1.add(jLabelTiHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jLabelLHues.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabelLHues.setText("En espera...");
        jPanel1.add(jLabelLHues, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        jLabelTHues.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabelTHues.setText("En espera...");
        jPanel1.add(jLabelTHues, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxdos;
    private javax.swing.JCheckBox jCheckBoxuno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelHabitacion;
    private javax.swing.JLabel jLabelHuesped;
    private javax.swing.JLabel jLabelIn;
    private javax.swing.JLabel jLabelLHues;
    private javax.swing.JLabel jLabelOut;
    private javax.swing.JLabel jLabelPiso;
    private javax.swing.JLabel jLabelTHues;
    private javax.swing.JLabel jLabelTiHabi;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
