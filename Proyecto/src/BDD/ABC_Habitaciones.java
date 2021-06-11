/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import informacion.Habitaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Navarro
 */
public class ABC_Habitaciones {

    private Conectar_MySQL mysql = new Conectar_MySQL();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Numero", "piso", "Nombre", "Caracteristicas", "Precio", "Estado", "Tipo habitacion"};
   
       String[] registro = new String[8];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
      
        sSQL = "select * from habitacion where piso like '%" + buscar + "%' order by idhabitacion";
       
                try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sSQL);
                if(rs!=null){
                    System.out.println(" ");
                    while (rs.next()) {
                    
                        registro[0] = rs.getString("idhabitacion");
                        registro[1] = rs.getString("numero");
                        registro[2] = rs.getString("piso");
                        registro[3] = rs.getString("descripcion");
                        registro[4] = rs.getString("caracteristicas");
                        registro[5] = rs.getString("precio_diario");
                        registro[6] = rs.getString("estado");
                        registro[7] = rs.getString("tipo_habitacion");
                       
                        totalregistros = totalregistros + 1;
                        modelo.addRow(registro);
                        
                      
                    }

                }else{
                    System.out.println("Error al realizar consulta a la BD");
                }
                //return modelo;
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                System.out.println("Error al cargar modelo");

                //return null;

            }
        
        
        
        return modelo;

    }

    /**
     *
     * @param dts
     * @return
     */
    public boolean insertar(Habitaciones dts) {
        sSQL = "insert  into habitacion(numero,piso,descripcion,caracteristicas,precio_diario,estado,tipo_habitacion)"
                + "values(?,?,?,?,?,?,?)";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_diario());
            pst.setString(6, dts.getEstado());
            //pst.setString(7, dts.getTipo_habitacion());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;

        }

    }

    public boolean editar(Habitaciones dts) {
        sSQL = "update habitacion set numero=?,piso=?,descripcion=?,caracteristicas=?,precio_diario=?,estado=?,tipo_habitacion=?"
                + "where idhabitacion=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_diario());
            pst.setString(6, dts.getEstado());
            //pst.setString(7, dts.getTipo_habitacion());
            //pst.setInt(8, dts.getIdhabitacion());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;

        }
  

    }

    public boolean eliminar(Habitaciones dts) {
        sSQL = "delete from habitacion where idhabitacion =?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            //pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();

            if (n != 0){
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

}





















    