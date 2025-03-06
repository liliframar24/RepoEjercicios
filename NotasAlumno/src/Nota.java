import java.util.Scanner;
    /**
     * Clase Nota
     * ingresa las notas del estudiante y se calcula promedio
     * @author Lili Franco
     * @version 1.0
     */
public class Nota {

    /**
     * calcularPromedio
     * calcula el promedio de las notas ingresadas
     * @param n[] es un arreglo de notas n!=null
     * @return double promedio de las ntoas
     */

    public static double calcularPromedio(double[] n){
        double resultado=0;

        for(int i=0; i<n.length; i++){
            resultado+=n[i];
        }

        resultado=resultado/5.0;
        return resultado;
    }

    /**
     * main
     * metodo ejecutable de java
     * @param args[] es un arreglo de String
     */
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int cantNotas=5;
        double[] notas= new double[cantNotas];

        System.out.println("Ingrese las notas de Pepito");

        for(int i=0;i<cantNotas; i++){

           System.out.println("Ingrese la nota #"+ (i+1));
           notas[i]= reader.nextDouble();

        }

        double promedio= calcularPromedio(notas);

        System.out.println("El promedio obtenido por Pepito fue:"+ promedio);

    
        reader.close();

    }

}