
package ejemplocomposicion;

import Domain.Deportivo;
import Domain.Organo;
import Domain.Sistema;
import Domain.Zapatos;
import java.util.ArrayList;


public class EjemploComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sistema digestivo = new Sistema();
        //crea los objetos
        Organo estomago = new Organo("Estomago", "Digerir");
        Organo boca = new Organo("Boca", "masticar");
        
        ArrayList<Organo> organos = new ArrayList<>();
        organos.add(boca);//llena el array list con los organos creados
        organos.add(estomago);
        
        digestivo.setOrgano(organos);//le añade lo que esta en el array list
        digestivo.setNombre("Digestivo");
       
        //llama al metodo que imprime lo que tienen el array list
        digestivo.imprimir();
        
        //probar el ejemplo de herencia 
        Zapatos nike = new Deportivo("futbol",38);//el objeto zapato se convierte en deportivo 
        System.out.println(nike.toString());
        
        
       
    }

    
}
