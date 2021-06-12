
package informacion;

public class Registro {
   
    private String nombre;
    private String ciudad;
    private String tipo_habitacion;
    private int piso;
    private int habi;
    private int totpersonas;
    private int extra;
    private int dias;
    private int tarifa;

    public Registro(String nombre, String ciudad, String tipo_habitacion, int piso, int habi, int totpersonas, int extra, int dias,int tarifa) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.tipo_habitacion = tipo_habitacion;
        this.piso = piso;
        this.habi = habi;
        this.totpersonas = totpersonas;
        this.extra = extra;
        //this.ingreso=ingreso;
        this.dias = dias;
        this.tarifa=tarifa;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getHabi() {
        return habi;
    }

    public void setHabi(int habi) {
        this.habi = habi;
    }

    public int getTotpersonas() {
        return totpersonas;
    }

    public void setTotpersonas(int totpersonas) {
        this.totpersonas = totpersonas;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Registro{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", tipo_habitacion=" + tipo_habitacion + ", piso=" + piso + ", habi=" + habi + ", totpersonas=" + totpersonas + ", extra=" + extra + ", dias=" + dias + ", tarifa=" + tarifa + '}';
    }

    
    
}
