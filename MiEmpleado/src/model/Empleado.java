package model;
public class Empleado{
  //Atributes
  private String cedula;
  private String nombre;
  private String apellido;

  //relations
  private Fecha fechaIngreso;
  private Fecha fechaNacimiento;

  //Methods
  public Empleado(String ced, String nom, String apellido,int diaN, int mesN, int aNac){
    this.cedula=ced;
    nombre=nom;
    this.apellido=apellido;
    fechaNacimiento=new Fecha(diaN,mesN,aNac);

  }



}