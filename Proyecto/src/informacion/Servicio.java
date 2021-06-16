
package informacion;


public class Servicio {
    
    private String servicio;
    private int costo;

    public Servicio(String servicio, int costo) {
        this.servicio=servicio;
        this.costo=costo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Servicio=" + servicio + ", costo=" + costo;
    }

   
    
    
}
