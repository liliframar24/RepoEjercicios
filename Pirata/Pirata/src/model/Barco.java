package model;
public class Barco{
    //atributes
    private String nombre;
    private double capacidad;
    //relations
    private Carga[] misCargas;

    //methods
    public Barco(String n,double c){
        this.nombre=n;
        this.capacidad=c;
        misCargas=new Carga[200];
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String newNombre){
        nombre=newNombre;
    }
    public double getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(double newCap){
        capacidad=newCap;
    } 
}