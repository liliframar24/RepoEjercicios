package model;
public class Cliente{
    //atributes
    private String nombre;
    private String nit;

    //relations

    //methods
    public Cliente(String n, String nit){
        nombre=n;
        this.nit=nit;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String newNombre){
        nombre=newNombre;
    }
    public String getNit(){
        return nit;
    }
    public void setNit(String newNit){
        nit=newNit;
    }

}