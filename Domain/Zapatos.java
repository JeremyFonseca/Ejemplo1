
package Domain;

public class Zapatos {
    
    private int numCalzado;
    
    //constructor

    public Zapatos() {
    }

    public Zapatos(int numCalzado) {
        this.numCalzado = numCalzado;
    }
    
    //gete and setter

    public int getNumCalzado() {
        return numCalzado;
    }

    public void setNumCalzado(int numCalzado) {
        this.numCalzado = numCalzado;
    }

    @Override
    public String toString() {
        return "Zapatos" + "numCalzado=" + numCalzado;
    }
    
    
    
}//fin zapatos
