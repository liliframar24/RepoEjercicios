package model;
public class Naviera{
    //atributes
    private String duenio;
    private String nombre;

    //relations
    private Barco miBarco;
    private Cliente[] misClientes;

    //methods
    public Naviera (String d, String nombre, String n,double c){
        duenio=d;
        this.nombre=nombre;
        miBarco=new Barco(n,c);
        misClientes=new Cliente[5];
    }
    public String getDuenio(){
        return duenio;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDuenio(String newDuenio){
        duenio=newDuenio;
    }
    public void setNombre(String newNombre){
        nombre=newNombre;
    }
    public String addCliente(String nombreCliente, String nitCliente){
        String mensaje="Cliente ingresado exitosamente";
        /*
        ojo completar el metodo para crear un objeto cliente en el arreglo de cliente
        Nota1: no puede crear cuando el nit del cliente ya se encuentre registrado
        Nota2: no puede crear cuando el arreglo se encuentre lleno
        */
        return mensaje;
    }
}