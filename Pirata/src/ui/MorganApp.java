package ui;
import model.Naviera;
import java.util.Scanner;
public class MorganApp{
    //Variables globales
    public static Scanner reader;
    public static Naviera miNaviera;
    /**
     * Descripcion: Este metodo se encarga de desplegar el menu al usuario y mostrar los mensajes de resultado para cada funcionalidad
     * pre: El Scanner reader debe estar inicializado
    */
    public static int menu() {

            System.out.println("\nMenu Principal:");
            System.out.println("1. Cargar");
            System.out.println("2. Descargar");
            System.out.println("3. Calcular peso");
            System.out.println("4. Zarpar");
            System.out.println("5. Crear Cliente");
            System.out.println("6. Desplegar Cliente");
            System.out.println("9. Salir");
            System.out.println("\nDigite la opcion a ejecutar");
            int opcion = reader.nextInt();
            reader.nextLine();
            return opcion;
    }



    public static void main(String[] args){
        reader=new Scanner(System.in);
        miNaviera=new Naviera("Morgan","Naviera ElPirata","ElPirata",28000);
        int opcion=0;
        System.out.println("Bienvenido a Morgan App!");
        do{
            opcion=menu();
            switch (opcion){
                case 1: //cargar
                        break;
                case 2: //descargar
                        break;
                case 3: //calcularPeso
                        break;
                case 4: //zarpar
                        break;
                case 5: addCliente();
                        break;
                case 6: displayClientes();
                        break;
                case 9: System.out.println("\nGracias por usar nuestros servicios!");
                        break;
                default: System.out.println("\nOpcion invalida, intenta nuevamente.");
            }

        }while(opcion!=9);
    }

    /**
     * Descripcion: Este metodo se encarga de solicitar la info del cliente para 
     * agregarlo a la naviera
     * pre: El Scanner reader debe estar inicializado
     * pre: La Naviera está creada
     * pos: La naviera queda con un nuevo cliente siempre y cuando,el nit no existe y 
     * si existen posiciones disponibles
    */
    public static void addCliente(){
        String nombreCliente="", nitCliente="";
        System.out.println("Ingrese el nombre del cliente");
        nombreCliente=reader.nextLine();
        System.out.println("Ingrese el nit del cliente");
        nitCliente=reader.nextLine();  
        String mensaje=miNaviera.addCliente(nombreCliente, nitCliente);
        System.out.println(mensaje);
    }

    /**
     * Descripcion: Este metodo se encarga desplegar los nombres de los clientes
     * pre: La Naviera está creada
     * pos: Nombres de clientes mostrados en pantalla
    */
    public static void displayClientes(){
        String message=miNaviera.displayClientes();
        System.out.println(message);
    }
}