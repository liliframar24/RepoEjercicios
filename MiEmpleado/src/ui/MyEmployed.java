package ui;
import model.Empleado;
import java.util.Scanner;

public class MyEmployed{

   public static void main(String[] args){
        Scanner  reader=new Scanner(System.in);
        Empleado objUno= new Empleado ("668","Lili", "Franco", 18, 1,1990);

        //ahora solicito las variables al usuario para crear mi objeto dos

        String cedula, nombre,apellido;
        int dia,mes,anio;

        System.out.println("Digite cedula:");
        cedula=reader.nextLine();
        System.out.println("Digite nombre:");
        nombre=reader.nextLine();
        System.out.println("Digite apelido:");
        apellido=reader.nextLine();

        System.out.println("Digite dia de nacimiento:");
        dia=reader.nextInt();
        System.out.println("Digite mes de nacimiento:");
        mes=reader.nextInt();
        System.out.println("Digite año de nacimiento:");
        anio=reader.nextInt();

        Empleado objDos=new Empleado(cedula,nombre,apellido, dia, mes,anio);

   }


}