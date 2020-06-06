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
        
        
        /* a)Objeto b)Clase de objeto         
        */
        String Abstraccion=objeto.nextLine();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        
        System.out.println ("Encapsulamiento");
        System.out.println ("Ingresar Sistema");
        /*Automovil
        */
        String IngresarSistema=objeto.nextLine();
        System.out.println ("Ingresar Modulo");
        /*Neumaticos
        */
        String IngresarModulo=objeto.nextLine();
        System.out.println ("Ingresar Objeto ");
        /*Neumatico*/
        String IngresarObjeto=objeto.nextLine();
        System.out.println ("Ingresar Clases de Objetos");
        /* a)Tipo de neumatico b)Caracteristicas*/
        String IngresarClasesDeObjetos=objeto.nextLine();
        System.out.println ("Ingresar Atributos");
        /*a)Transporte_pesado  b)Transporte_liviano
        c)Ancho d)Alto; e)Rin; f)Fecha_de_fabricacion;

        */        
        String IngresarAtributos=objeto.nextLine();
        System.out.println ("Ingresar Servicios");
        /*a)Identificar_transporte_pesado() b)Identificar_transporte_liviano() c)Identificar_ancho() d)Identificar_alto() e) Identificar_rin() f)Identificar_fecha_de_fabricacion()
        
        */                                                                                                  

;
        String IngresarServicios=objeto.nextLine();
        
        System.out.println ("-------------------------------------------------");
        System.out.println (" Modularidad");
        System.out.println ("Ingresar Sistema Modulo");
        /*Automovil*/
        String IngresarSistemaModulo=objeto.nextLine();
        System.out.println ("Ingresar Modulo Principal");
        /*Neumatico*/
        String IngresarModuloPrincipal=objeto.nextLine();
        System.out.println ("ingresar subModulos");
        /*a)Tipo b)Medidas c)Clasificacion */
        String IngresarSubModulos=objeto.nextLine();        
        System.out.println("______________________________________________________");
        System.out.println("");
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
        System.out.println("Encapsulamiento:");
        System.out.println(""+IngresarSistema);
        System.out.println(""+IngresarModulo);
        System.out.println(""+IngresarObjeto);
        System.out.println(""+IngresarClasesDeObjetos);
        System.out.println(""+IngresarAtributos);
        System.out.println(""+IngresarServicios);
        System.out.println("Modularidad:");
        System.out.println(""+IngresarSistema);
        System.out.println(""+IngresarModuloPrincipal);
        System.out.println(""+IngresarSubModulos);
        
        
        
        System.out.println("____________________________________________________________________________________");
        
        // TODO code application logic here
    }
    
}
