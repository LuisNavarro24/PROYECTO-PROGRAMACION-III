
package contenido;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import informacion.MySqlConn;
import informacion.Servicio;
import java.io.FileOutputStream;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CheckOut extends javax.swing.JInternalFrame {

  
    private int precio1=900;
     private int precio2=1200;
     private int precio3=1800;
     private int extrap=200;
     
     private int tipo1 =1;
     private int tipo2 =2;
     private int tipo3 =3;
     
     private int limp=400;
     private int caf=500;
     private int spa=600;
     private int gym=700;
     private int nin=800;
    
    
    
    MySqlConn conn= new MySqlConn();
    
    ArrayList <Servicio> lista = new ArrayList();
    public CheckOut() {
        initComponents();
        fecha();
    }
    
     public void fecha(){
        Calendar fecha = new GregorianCalendar();  
        String fechaout="";
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);  
       mes+=1;
        String dia2=String.valueOf(anio);
        String mes2=String.valueOf(mes);
        String anio2=String.valueOf(dia);
        
        Calendar fechanueva=Calendar.getInstance();
        fechanueva.set(anio,mes,dia);
        
        SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-YYYY");
        String date = dateformat.format(fechanueva.getTime());
        this.jLabelFechafin.setText(date);
    }

     public void busqueda(){
         String query="";
         
         int hab=0;
         
         try{
             hab=Integer.valueOf(this.jTextFieldHabi.getText());
         }catch(Exception e){
             JOptionPane.showMessageDialog(this, "Ingresa numero");
             this.jButtonCheckOut.setEnabled(false);
         }
         
         query = "select * from registro where Num_Habitacion = "+"'"+hab+"'";
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
            System.out.println("n  "+n);
            Object datos [][]= new Object[n][10];
            for (int i = 0; i < n; i++) {
                try{
                    datos[i][0]= this.conn.rs.getInt(1);
                    datos[i][1]= this.conn.rs.getString(2);
                    datos[i][2]= this.conn.rs.getInt(3);
                    datos[i][3]= this.conn.rs.getString(4);
                    datos[i][4]= this.conn.rs.getString(5);
                    datos[i][5]= this.conn.rs.getInt(6);
                    datos[i][6]= this.conn.rs.getInt(7);
                    datos[i][7]= this.conn.rs.getString(8);
                    datos[i][8]= this.conn.rs.getInt(9);
                    datos[i][9]=this.conn.rs.getString(10);
                    
                    this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error 2...");
                }
                
            }
            String columnas[]={"Habitacion","Tipo","Piso","Nombre","Ciudad","Num_Huespedes","Huesped ex","Entrada","Dias"};
            jTableCheckOut.setModel(new DefaultTableModel(datos,columnas));
            //System.out.println("Tabla lista");
            
            
            
         
        String query2 = "select * from servicios where Num_Habitacion = "+"'"+hab+"'";
        this.conn.Consult(query2);
        int n2=0;
        try{
            this.conn.rs.last();
            n2=this.conn.rs.getRow();
            this.conn.rs.first();
        }catch(Exception e){
            System.out.println("Error 1...");
        }
        if(n2!=0){
            //System.out.println("n  "+n);
            Object datos2 [][]= new Object[n][7];
            for (int i = 0; i < n; i++) {
                try{
                    
                    datos2[i][0]= this.conn.rs.getInt(3);
                    datos2[i][1]= this.conn.rs.getInt(4);
                    datos2[i][2]= this.conn.rs.getInt(5);
                    datos2[i][3]= this.conn.rs.getInt(6);
                    datos2[i][4]=this.conn.rs.getInt(7);
                  
                    
                    this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error 2...");
                }
                
            }
            String columnas2[]={"Limpieza","Cafeteria","Spa","Gimnasio","Ninera"};
            jTableServicios.setModel(new DefaultTableModel(datos2,columnas2));
            //System.out.println("Tabla lista");
        }else{
            JOptionPane.showMessageDialog(this, "No tiene servicios extra...");
        }
        
            
            
            
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos...");
        }
        
        
        
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCheckOut = new javax.swing.JTable();
        jButtonCheckOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFechafin = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableServicios = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CheckOut");
        setPreferredSize(new java.awt.Dimension(747, 402));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("Num. Habitacion");

        jScrollPane1.setViewportView(jTableCheckOut);

        jButtonCheckOut.setText("CHECK OUT");
        jButtonCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckOutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Fecha");

        jLabelFechafin.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabelFechafin.setText("En espera...");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTableServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableServicios);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jTextFieldHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelFechafin)
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCheckOut)
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldHabi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelFechafin)
                    .addComponent(jButtonBuscar))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCheckOut)
                        .addGap(226, 226, 226))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        busqueda();
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckOutActionPerformed
//System.out.println("Entre");
        
       
        String hab= this.jTextFieldHabi.getText().trim();
        String fechaout="",fechain="";
       String query= "select * from registro where Num_Habitacion= "+"'"+hab+"'";
       String query2;
        int pisod=0,tipopiso,dias=0,extra=0,habi=0;
        String tipohab="";
        String nombre="";
        int pagotot=0;
        int cuentatot=0;
        int k=0;
        String sen="Individual";
        String dob="Doble";
        String fam="Familiar";
        String ciudad="";
        int hues=0;
        int costo=0;
        int pago=0;
        int cosex=0;
        
        this.conn.Consult(query);
        int n =0;
        try{
            this.conn.rs.last();
            n= this.conn.rs.getRow();
            this.conn.rs.first();
            
        }catch(Exception e){
            System.out.println("No hay datos");
        }
        if(n!=0){
            //Object datos [][]= new Object[n][10];
            for (int i = 0; i < n; i++) {
                try{
                    habi=this.conn.rs.getInt(1);
                    tipohab=this.conn.rs.getString(2);
                    pisod=this.conn.rs.getInt(3);
                    nombre=this.conn.rs.getString(4);
                    ciudad=this.conn.rs.getString(5);
                    hues= this.conn.rs.getInt(6);
                    extra=this.conn.rs.getInt(7);
                    fechain=this.conn.rs.getString(8);
                    dias=this.conn.rs.getInt(9);
                    fechaout=this.conn.rs.getString(10);
                    
                    if(extra==1){
                cosex=(extrap*extra*dias);
                Servicio ser= new Servicio("1 Persona extra",cosex);
                lista.add(ser);
                    }else if (extra==2){
                cosex= (extrap*extra*dias);       
                Servicio ser= new Servicio("2 Personas extra",cosex);
                lista.add(ser);        
                    }else
                        cosex=0;
                    
                    
                if(tipohab.equalsIgnoreCase(sen)){
                    costo=precio1;
                cuentatot=(precio1*dias);
                System.out.println("Sencilla "+cuentatot);
                
            }else if(tipohab.equalsIgnoreCase(dob)){
                costo=precio2;
                cuentatot=(precio2*dias);
                 System.out.println("Doble "+cuentatot);
                 
            }else if (tipohab.equalsIgnoreCase(fam)){
                costo=precio3;
                cuentatot=(precio3*dias);
              System.out.println("Triple "+cuentatot);
            }    
                
                   
                    this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error...");
                }
                
            }
  
        }
        pago=cosex;
        System.out.println(pago);
        System.out.println(cuentatot);
            
     
        
      //  System.out.println("Pago por la habitacion: "+cuentatot);
        
        
        String query3= "select * from servicios where Num_Habitacion= "+"'"+hab+"'";
        this.conn.Consult(query3);
        int lim=0,caf=0,sp=0,gy=0,nin=0;
        try{
            this.conn.rs.last();
            n= this.conn.rs.getRow();
            this.conn.rs.first();
            
        }catch(Exception e){
            System.out.println("Error 1...");
        }
        if(n!=0){
 
            for (int i = 0; i < n; i++) {
                try{
                    if(this.conn.rs.getInt(3)==1){
                        lim=this.limp;
                        //System.out.println(lim);
                        cosex=cosex+lim;
                        Servicio ser= new Servicio("Limpieza",limp);
                        lista.add(ser);
                    }else{
                        lim=0;
                    }
                    if(this.conn.rs.getInt(4)==1){
                        caf=this.caf;
                        cosex=cosex+caf;
                        Servicio ser= new Servicio("Cafeteria",caf);
                        lista.add(ser);
                    }else{
                        caf=0;
                    }
                    if(this.conn.rs.getInt(5)==1){
                        sp=this.spa;
                        cosex=cosex+sp;
                        Servicio ser= new Servicio("Spa",spa);
                        lista.add(ser);
                    }else{
                        sp=0;
                    }
                    if(this.conn.rs.getInt(6)==1){
                        gy=this.gym;
                        cosex=cosex+gy;
                        Servicio ser= new Servicio("Gimansio",gym);
                        lista.add(ser);
                    }else{
                        gy=0;
                    }
                    if(this.conn.rs.getInt(7)==1){
                        nin=this.nin;
                        cosex=cosex+nin;
                        Servicio ser= new Servicio("Niñera",nin);
                        lista.add(ser);
                    }else{
                        gy=0;
                    }
                    
                    this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error 2...");
                }
                
            }
             
        }else{
           cosex=cosex;
        }
        pago=cuentatot+cosex;
        String list="";
        for (int i = 0; i < lista.size(); i++) {
            lista.toString();
        }
        
        Date d = new Date();
        String fecha="                                              "+d;
        
            String tit=nombre+".pdf";
            System.out.println("titulo");
            //String nom="Nombre del huesped: "+nombre;
            try{
            //Phrase texto = new Phrase();
            Document pdf = new Document();
            PdfWriter.getInstance(pdf, new FileOutputStream(tit));
            Paragraph titulo = new Paragraph("Hotel Chayanne",FontFactory.getFont("timesnewroman",12,Font.ITALIC,BaseColor.PINK));
            titulo.setAlignment(800);
            pdf.open();
           
            Paragraph ubi=new Paragraph("                     Paseo de los Cocoteros s/n, Flamingos, 63732 Nuevo Vallarta, Nay.");
            Paragraph salto = new Paragraph ("\n"); 
            
            Image img =Image.getInstance("Logo.png");
            Image img2 = Image.getInstance("Lema.png");
            Image img3 =Image.getInstance("Firma.png");
            
            img.setAlignment(5);//posiciona una imagen o texto creo...
            img2.setAlignment(5);
            img3.setAlignment(5);
           // img.getAlignment();
            pdf.add(titulo);
            pdf.add(salto);
            pdf.add(img);
            //pdf.add(salto);
            pdf.add(img2);
            pdf.add(ubi);
            pdf.add(salto);
            Paragraph fech = new Paragraph (fecha);
            pdf.add(fech);
            pdf.add(salto);
            Paragraph nom = new Paragraph("Nombre del huesped: "+nombre);
            Paragraph ciu = new Paragraph("Ciudad de origen: "+ciudad);
            Paragraph ent = new Paragraph("Fecha de ingreso: "+fechain);
            Paragraph sal = new Paragraph("Fecha de salida: "+fechaout);
            Paragraph tha = new Paragraph("Tipo de habitacion: "+tipohab);
            Paragraph cos = new Paragraph("Costo de habitacion: "+costo);
            Paragraph dia = new Paragraph("Dias de hospedaje: "+dias);
            Paragraph tar = new Paragraph("Total a pagar sin cargos extra: "+cuentatot);
            Paragraph tot = new Paragraph("Total a pagar con cargos extra: "+pago);
            Paragraph lis = new Paragraph("Lista de cargos: "+lista.toString());
            
            Paragraph lin = new Paragraph("                                    -----------------------------------------------------------------------");
            Paragraph bos = new Paragraph("                                             Angela Maria Gallegos Martinez(Gerente Ejecutivo");
            Paragraph men = new Paragraph("                                           ¡Gracias por elegirnos, Chayanne agradece su visita!");
            Paragraph fin = new Paragraph("                                                          Salida compeltada");
            
            pdf.add(nom);//nombre huesped
            //pdf.add(salto);
             pdf.add(ciu);//ciudad huesped
            //pdf.add(salto);
             pdf.add(ent);//fecha ingreso
            //pdf.add(salto);
             pdf.add(sal);//fecha salida
            //pdf.add(salto);
             pdf.add(tha);//tipo de habitacion
            //pdf.add(salto);
             pdf.add(cos);//costo habitacion
            //pdf.add(salto);
             pdf.add(dia);//dias
            //pdf.add(salto);
             pdf.add(tar);//tarida sin cargos extra
           // pdf.add(salto);
             pdf.add(tot);//cargos extra
            //pdf.add(salto);
            if(lista.size()!=0){
            pdf.add(lis);//servicios    
           // pdf.add(salto);
            }
            pdf.add(salto);
            pdf.add(img3);
            pdf.add(lin);
            pdf.add(bos);
            pdf.add(men);
            
       
            pdf.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
            
        
        
        
        
        
                    
        if(hab.isEmpty()){
            JOptionPane.showMessageDialog(this, "Numero de habitacion vacio");
        }else{
            //En esta consulta guardo en el historial el check out para la cuenta del hotel
            String parte1 = "Insert into historial (nombre, habitacion, ingreso, salida, pago_tot) VALUES (";
                     String parte2 = "'"+nombre+"','"+habi+"','"+fechain+"','"+fechaout+"','"+cuentatot+"')";
                    query2 = parte1 + parte2;
            this.conn.Update(query2);           
            System.out.println(nombre);
            
            //Eliminacion dl huesped en la lista de disponibles y ocupados
            query= "delete from registro where Num_Habitacion= "+"'"+hab+"'";
            int j= this.conn.Update(query);
            if(j>0){
                 JOptionPane.showMessageDialog(this, "Baja confirmada");
            JOptionPane.showMessageDialog(this, "A pagar"+pago);
                 
            }else{
                 JOptionPane.showMessageDialog(this, "No hay seleccion de huesped");

            }
                   // TODO add your handling code here:
        
        } 
        dispose();
        
    }//GEN-LAST:event_jButtonCheckOutActionPerformed

    
//public void generapdf() throws URISyntaxException {
    
//}    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCheckOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFechafin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCheckOut;
    private javax.swing.JTable jTableServicios;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldHabi;
    // End of variables declaration//GEN-END:variables
}
