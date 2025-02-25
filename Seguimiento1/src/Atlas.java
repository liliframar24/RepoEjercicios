/**
 * mi Clase Atlas
 * Resuelve ejercicio de Atlas - seguimiento 1
 * @author Lili Franco
 * @version 1.0
 * 
 */
import java.util.Scanner;
public class Atlas
{
    /**
     * calculateAccommodation
     * Esta subrutina calcula costo x hospedaje (descontando 10% si noches>=3)
     * @param num ingresa la cantidad de noches num>=1 y num<=4
     * @return total numero real con valor a pagar por hospedaje
     * 
     */
	public static double calculateAccommodation(int num){
	    int valNights=150000;
	    double total=valNights*num;
	    if (num>=3){
	        double disc=total*0.1;
	        total=total-disc;
	    }
	    return total;
	}
	
	/**
     * calculateTransport
     * Esta subrutina calcula costo x transporte (bus o avion) por dos trayectos
     * @param trip1 ingresa transporte trayecto de ida (bus o plane)
     * @param trip2 ingresa transporte trayecto de regreso (bus o plane)
     * @return cost numero real con valor a pagar por transporte
     * 
     */
	public static double calculateTransport(String trip1, String trip2){
        int bus=80000;
        int airplane=250000;
        double cost=0;
        if (trip1.equals("BUS"))
             cost+=bus;
        else
             cost+=airplane;
             
        if (trip2.equals("BUS"))
             cost+=bus;
        else
             cost+=airplane;   
        
        return cost;
        
	}
	
	
    /**
     * main
     * Esta subrutina es la ejecutable de java
     * @param args arreglo de String args!=null
     */ 
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
		System.out.println("Eventos Atlas Welcome");
		System.out.println("Lodging");
		System.out.println("Remember can stay (1 to 4) nights");
		System.out.println("Nights:");
	    int numNights=reader.nextInt();
	    double costNights= calculateAccommodation(numNights);
	    reader.nextLine();
	    System.out.println("Transport");
	    System.out.println("One-way trip by plane or bus");
	    String transport1=reader.nextLine();
	    transport1=transport1.toUpperCase();
	    System.out.println("Return trip by [plane or bus]");
	    String transport2=reader.nextLine();
	    transport2=transport2.toUpperCase();
	    double costTransp=calculateTransport(transport1, transport2);
	    
	    double total=costNights+costTransp;
	    double service= total*0.2;
	    total=total+service;
	    System.out.println("Total to be paid:"+total);
	    
	}
}