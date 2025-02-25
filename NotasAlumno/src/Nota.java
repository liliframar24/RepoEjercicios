import java.util.Scanner;
public class Nota {

    public static double calcularPromedio(double[] n){
        double resultado=0;

        for(int i=0; i<n.length; i++){
            resultado+=n[i];
        }

        resultado=resultado/5.0;
        return resultado;
    }

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