/*DISEÑO DE UN ALGORITMO PARA OBTENER INFORMACION DE 
 *"PRONOSTICO DEL AREA DE CONTACTO DE LOS NEUMATICOS DE UN VEHICULO VIA REDES NEURONALES RECURRENTES"
 * REQUERIMIENTOS FUNCIONALES
 * REQUERIMIENTOS NO FUNCIONALES
 * DISEÑO ORIENTADO A OBJETOS
 * ABSTRACCION
 */
package poo_areaneumatico;
import java.util.Scanner;
/**
 *
 * @carlos Arias
 */
public class POO_AreaNeumatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objeto=new Scanner(System.in);//new reserva espacio de memoria
        System.out.println("Requerimientos Funcionales");
        /*a)Red Neuronal b)Algoritmo c)Entrenamiento de red d)Neumatico e)Dimensiones del neumatico
        f)sensores g)Tipo de amortiguadores h)Tipo de Vehiculo i)Peso del vehiculo
        */
        String RequerimientosFuncionales=objeto.nextLine();
        
        System.out.println("**************************************************");
       
        System.out.println("Requerimientos no Funcionales");
        /* 1)Marca del neumatico 2)Marca del automovil
         */ 
        String RequerimientosNoFuncionales=objeto.nextLine();        
        System.out.println ("-------------------------------------------------");
        System.out.println ("Diseño Orientado a Objetos");
        /* a)Determinar_algoritmo() b)Determinar_red_neuronal() c)Identificar_entrenamiento()d)Comprobar_neumatico() e)Determinar_dimensiones_del_neumatico() e)Utilizar sensores() f)Determinar_tipo_de_amortiguadores)() g)Determinar_tipo_de_vehiculo() h)Determinar_peso_del_vehiculo
        */
        
        String DiseñoObjetos=objeto.nextLine();
        
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        
        System.out.println ("Abstraccion");
        /* a)Objeto b)Clase de objeto         
        */
        String Abstraccion=objeto.nextLine();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("");
        System.out.println("PRONOSTICO DEL AREA DE CONTACTO DE LOS NEUMATICOS DE UN VEHICULO ");
        System.out.println("VIA REDES NEURONALES RECURRENTES");
        System.out.println("Requerimientos Funcionales:");
        System.out.println(""+RequerimientosFuncionales);
        System.out.println("Requerimientos no Funcionales:");
        System.out.println(""+RequerimientosNoFuncionales);
        System.out.println("Diseño Orientado a Objetos:");
        System.out.println(""+DiseñoObjetos);
        System.out.println("Abstraccion:");
        System.out.println(""+Abstraccion);
        
        System.out.println("____________________________________________________________________________________");
        
        // TODO code application logic here
    }
    
}
