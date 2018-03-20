
package Domain;

public class Organo {
    
    private String nombre;
    private String funcion;
    
    //constructores

    public Organo() {
        this.nombre = "";
    }

    public Organo(String nombre, String funcion) {
        this.nombre = nombre;
        this.funcion = funcion;
    }
    
    //get ande setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    
    @Override
    public String toString() {
        return "organo" + "nombre=" + nombre + ", funcion=" + funcion ;
    }
    
    
    
}
