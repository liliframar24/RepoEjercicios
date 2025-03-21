package model;
public class Carga{
   //atributes
   private String tipo;
    //relations
    private Cliente miCliente;

    //methods
    public Carga(String t,Cliente objC){
        tipo=t;
        miCliente=objC;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String newTipo){
        tipo=newTipo;
    }

}