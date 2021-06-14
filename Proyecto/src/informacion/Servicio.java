
package informacion;


public class Servicio {
    
    private int limp;
    private int cafe;
    private int spa;
    private int gym;

    public Servicio(int limp, int cafe, int spa, int gym) {
        this.limp = limp;
        this.cafe = cafe;
        this.spa = spa;
        this.gym = gym;
    }

    public int getLimp() {
        return limp;
    }

    public void setLimp(int limp) {
        this.limp = limp;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getSpa() {
        return spa;
    }

    public void setSpa(int spa) {
        this.spa = spa;
    }

    public int getGym() {
        return gym;
    }

    public void setGym(int gym) {
        this.gym = gym;
    }
    
    
    
}
