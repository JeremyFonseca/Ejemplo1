
package Domain;

import java.util.ArrayList;


public class Sistema {
    
    private String nombre;
    private ArrayList<Organo> organo;

    //constructor
    public Sistema() {
        
    }

    public Sistema(String nombre, ArrayList<Organo> organo) {
        this.nombre = nombre;
        this.organo = organo;
    }
    
    //get and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Organo> getOrgano() {
        return organo;
    }

    public void setOrgano(ArrayList<Organo> organo) {
        this.organo = organo;
    }

    public void imprimir(){
        System.out.println("Sistema"+this.nombre);
        
        for (int i = 0; i <  this.getOrgano().size(); i++) {
            System.out.println(this.getOrgano().get(i));
        }
        
    }
    
    
}
