import java.util.Scanner;
/**
 * mi Clase Supermercado
 * Resuelve ejercicio del supermercado
 * @author Liliana Franco M
 * @version 1.0
 * 
 */
public class Market { 
	/**
     * comprarProductos
     * Esta subrutina calcular la cantidad a pagar por compra de productos
	 * <br>post </br> se despliega el subtotal por producto y el total a pagar
     * @param reader lector de la clase Scanner reader!=null
	 * @param cantProductos entero que indica total productos a llevar 
     */
	public static void comprarProductos (Scanner reader, int cantProductos){   
        int cantidad = 0;
        double precio = 0;
        double total = 0;


        for (int i = 0; i < cantProductos; i++) {
            System.out.println("\nProducto " + (i + 1) + ":");

            System.out.print("Ingrese el nombre del producto: ");
            String nombre = reader.nextLine();
            System.out.print("Ingrese la cantidad de items que desea comprar: ");
            cantidad = reader.nextInt();
			reader.nextLine();
            System.out.print("Ingrese el precio por item: ");
            precio = reader.nextFloat();
            reader.nextLine(); 
           
            double subtotal = cantidad * precio;
            total += subtotal; 
            System.out.println("Subtotal a pagar por " + nombre + ": $" + subtotal);
        }
        System.out.println("\nTotal a pagar: $" + total);
    }


	/**
     * main
     * Esta subrutina es la ejecutable de java
     * @param args arreglo de String args!=null
     */    
    public static void main(String[] args) {
        System.out.println("SuperMercado");
        Scanner lector=new Scanner(System.in);

		int productos = 0;
        System.out.print("¿Cuántos productos desea comprar? ");
        productos = lector.nextInt();
        lector.nextLine(); 
        comprarProductos(lector,productos);
    }
    
}