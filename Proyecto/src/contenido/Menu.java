
package contenido;

import clasesinternas.*;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
    AudioClip Sonido;
    public Menu() {
        initComponents();
        musicaInicializar();
        this.setLocationRelativeTo(this);                 
    }
    
    public void musicaInicializar(){
        Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/musica/Torero.wav"));
        Sonido.play();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/bocina1.png"));
        Image conversion = imagen.getImage();
        Image tam = conversion.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        ImageIcon imagenRe = new ImageIcon(tam);
        this.jLabelReproducirMusica.setIcon(imagenRe);
        imagen = new ImageIcon(getClass().getResource("/imagenes/bocina2.png"));
        conversion = imagen.getImage();
        tam = conversion.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        ImageIcon imagenDe = new ImageIcon(tam);
        this.jLabelDetenerMusica.setIcon(imagenDe);
        this.jLabelReproducirMusica.setVisible(false);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneEscritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(new ImageIcon(getClass().getResource("/imagenes/FondoPantalla.jpg")).getImage(),0,0,getWidth(),getHeight(),this);
            }
        };
        jPanel2 = new javax.swing.JPanel();
        jLabelReproducirMusica = new javax.swing.JLabel();
        jLabelDetenerMusica = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemEntradas = new javax.swing.JMenuItem();
        jMenuItemSalidas = new javax.swing.JMenuItem();
        jMenuItemHuespedes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemGaleria = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(252, 210, 234));
        jPanel2.setForeground(new java.awt.Color(0, 51, 153));

        jLabelReproducirMusica.setBackground(new java.awt.Color(255, 255, 255));
        jLabelReproducirMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReproducirMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReproducirMusicaMouseClicked(evt);
            }
        });

        jLabelDetenerMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDetenerMusicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDetenerMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelReproducirMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelDetenerMusica, jLabelReproducirMusica});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelReproducirMusica)
                    .addComponent(jLabelDetenerMusica)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelDetenerMusica, jLabelReproducirMusica});

        javax.swing.GroupLayout jDesktopPaneEscritorioLayout = new javax.swing.GroupLayout(jDesktopPaneEscritorio);
        jDesktopPaneEscritorio.setLayout(jDesktopPaneEscritorioLayout);
        jDesktopPaneEscritorioLayout.setHorizontalGroup(
            jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneEscritorioLayout.createSequentialGroup()
                .addGap(0, 669, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPaneEscritorioLayout.setVerticalGroup(
            jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneEscritorioLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 373, Short.MAX_VALUE))
        );
        jDesktopPaneEscritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Menu");

        jMenuItemEntradas.setText("Entradas");
        jMenuItemEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEntradasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEntradas);

        jMenuItemSalidas.setText("Salidas");
        jMenuItemSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalidasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalidas);

        jMenuItemHuespedes.setText("Huespedes");
        jMenuItemHuespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHuespedesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemHuespedes);

        jMenu2.setText("Consultas");

        jMenuItemGaleria.setText("Galeria");
        jMenuItemGaleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGaleriaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemGaleria);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        jMenuSalir.setText("Salir");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelDetenerMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDetenerMusicaMouseClicked
        // TODO add your handling code here:
        Sonido.stop();
        this.jLabelDetenerMusica.setVisible(false);
        this.jLabelReproducirMusica.setVisible(true);
    }//GEN-LAST:event_jLabelDetenerMusicaMouseClicked

    private void jLabelReproducirMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReproducirMusicaMouseClicked
        // TODO add your handling code here:
        Sonido.play();
        this.jLabelDetenerMusica.setVisible(true);
        this.jLabelReproducirMusica.setVisible(false);
    }//GEN-LAST:event_jLabelReproducirMusicaMouseClicked

    private void jMenuItemEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEntradasActionPerformed
         Sonido.stop();
        CheckIn entrada = new CheckIn();
        this.jDesktopPaneEscritorio.add(entrada);
        entrada.show();
    }//GEN-LAST:event_jMenuItemEntradasActionPerformed

    private void jMenuItemSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalidasActionPerformed
        Sonido.stop();
        CheckOut out = new CheckOut();
        this.jDesktopPaneEscritorio.add(out);
        out.show();
        
    }//GEN-LAST:event_jMenuItemSalidasActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        Sonido.stop();
        new PortadaHotel().setVisible(true); //Opcional
        this.dispose();
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jMenuItemGaleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGaleriaActionPerformed
        Galeria gal = new Galeria();
        this.jDesktopPaneEscritorio.add(gal);
        gal.show();
    }//GEN-LAST:event_jMenuItemGaleriaActionPerformed

    private void jMenuItemHuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHuespedesActionPerformed
        // TODO add your handling code here:
        Huespedes hue= new Huespedes();
        this.jDesktopPaneEscritorio.add(hue);
        hue.show();
        
    }//GEN-LAST:event_jMenuItemHuespedesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPaneEscritorio;
    private javax.swing.JLabel jLabelDetenerMusica;
    private javax.swing.JLabel jLabelReproducirMusica;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemEntradas;
    private javax.swing.JMenuItem jMenuItemGaleria;
    private javax.swing.JMenuItem jMenuItemHuespedes;
    private javax.swing.JMenuItem jMenuItemSalidas;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
