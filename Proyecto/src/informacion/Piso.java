/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion;

public class Piso {
    private int habi;
    private String tipo;

    public Piso(int habi, String tipo) {
        this.habi = habi;
        this.tipo = tipo;
    }

    public int getHabi() {
        return habi;
    }

    public void setHabi(int habi) {
        this.habi = habi;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "N.hab=" + habi + ", de tipo "+tipo+"\n";
    }

    
    
    
    
}
