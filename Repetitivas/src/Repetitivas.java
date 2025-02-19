import java.util.Scanner;
/**
 * mi Clase Repetitivas
 * Resuelve ejercicios varios de repetitivas
 * @author Lili Franco
 * @version 1.0
 * 
 */
public class Repetitivas {
    /**
     * contarMultiplosVeinteWhile
     * Esta subrutina calcular la cantidad de calorias a quemar
     * @param valIni ingresa el valor inicial valIni!=0
	 * @param valFin ingresa el valor final valFin!=0
     * @return conteo entero con la cantidad de multiplos de 20
     * 
     */
    public static int contarMultiplosVeinteWhile(int valIni, int valFin){
         int conteo=0;
         int x=valIni;
         while (x<= valFin){
             if(x%20==0){
                conteo++;
             }
            x++; 
         }
         return conteo;
    }
	
    /**
     * contarMultiplosVeinteFor
     * Esta subrutina calcular la cantidad de calorias a quemar
     * @param valIni ingresa el valor inicial valIni!=0
	 * @param valFin ingresa el valor final valFin!=0
     * @return conteo entero con la cantidad de multiplos de 20
     * 
     */
    public static int contarMultiplosVeinteFor(int valIni, int valFin){
         int conteo=0;
         
         for(int x=valIni;x<= valFin;x++ ){
             if(x%20==0){
                conteo++;
             }
         }
         return conteo;
    }
 
    /**
     * hayMultiplosSiete
     * Esta subrutina indica si existen multiplos de siete
     * @param valIni ingresa el valor inicial valIni!=0
	 * @param valFin ingresa el valor final valFin!=0
     * @return existe boolean indicando true o false 
     * 
     */ 
   public static boolean hayMultiplosSiete(int valIni, int valFin){
         boolean existe=false;
         
         for(int x=valIni;x<= valFin && !existe ;x++ ){
             if(x%7==0){
                existe=true;
             }
         }
         return existe;
    }
	
	/**
     * factorial
     * Esta subrutina calcula el numero factorial de un numero
	 * ejemplo Ocho factorial es igual a 8*7*6*5*4*3*2*1 = 40320.
     * @param val ingresa el valor inicial valIni>0 y valIni<=12
     * @return resultado int con calculo del numero factorial
     * 
     */
    public static int factorial(int val){
         int resultado=0;
         
       //TAREA COMPLETAR
        return resultado;
    }	
	
	

	/**
     * main
     * Esta subrutina es la ejecutable de java
     * @param args arreglo de String args!=null
     */     
    public static void main(String[] args) {
       int resultado=contarMultiplosVeinteWhile(0,10000);
       System.out.println("La cantidad de multiplos de 20 entre 0 y 10000 (utilizando while)son:"+resultado);

       resultado=contarMultiplosVeinteFor(0,10000);
       System.out.println("La cantidad de multiplos de 20 entre 0 y 10000 (utilizando for)son:"+resultado);

       boolean siete= hayMultiplosSiete(15,25);
       if(siete)
         System.out.println("Entre 15 y 25 existen multiplos de siete");
       else
         System.out.println("Entre 15 y 25 NO existen multiplos de siete");

    }
    
}