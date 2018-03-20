
package Domain;


public class Deportivo extends Zapatos{

    private String deporte;
    
    public Deportivo(int numCalzado){//se ponen parametros lo cual es de la super clase 
        
        super ();
        this.deporte = "deporte";
        
    }
    //constructor

    public Deportivo() {
        super();
    }
    
    

    public Deportivo(String deporte) {
        this.deporte = deporte;
    }

    public Deportivo(String deporte, int numCalzado) {
        super(numCalzado);
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return super.toString()+ "Deportivo" + "deporte=" + deporte ;//hay que llamar a la clase padre 
    }
    
    
}
