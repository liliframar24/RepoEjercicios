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

    /**
     * Descripcion: Este metodo se encarga de buscar un cliente por el nit
     * pre: La Naviera está creada y el arreglo de clientes está inicializado
     * @param nitCliente nit del cliente a buscar != null
     * @return Cliente objeto null si no existe y !=null cuando existe
     */ 

    public Cliente buscarCliente(String nitC){
        Cliente objBuscado=null;
        boolean existe=false;

        for(int i=0; i<misClientes.length && !existe;i++){
            Cliente temporal=misClientes[i];
            if(temporal!=null && temporal.getNit().equals(nitC)){
                objBuscado=temporal;
                existe=true;
            }
        }

        return objBuscado;
    }

    /**
     * Descripcion: Este metodo se encarga de buscar una posicion null en el arreglo de clientes
     * pre: La Naviera está creada y el arreglo de clientes está inicializado
     * @return int primera posicion vacia que encuentra en arreglo de clientes
     */ 

    public int calcularPosVaciaClientes(){
        int pos=-1;
        boolean existe=false;

        for(int i=0; i<misClientes.length && !existe;i++){
            Cliente temporal=misClientes[i];
            if(temporal==null){
                pos=i;
                existe=true;
            }
        }
        return pos;
    }

    /**
     * Descripcion: Este metodo se encarga de crear un nuevo cliente
     * pre: La Naviera está creada y el arreglo de clientes está inicializado
     * @param nombreCliente != null
     * @param nitCliente != null
     * pos: La naviera queda con un nuevo cliente siempre y cuando,el nit no existe y existan posiciones disponibles en el arreglo
     * @return String mensaje de exito o error en el proceso
    */   
    public String addCliente(String nombreCliente, String nitCliente){
        String mensaje="Cliente ingresado exitosamente";
        Cliente objCliente=buscarCliente(nitCliente);
        if (objCliente!=null){
            //aqui ya existe un objeto cliente con el mismo nit
            mensaje="Error el nit del cliente ya existe";
        }
        else{
            //aqui ya puedo crear cliente
            int posVacia=calcularPosVaciaClientes();
            if (posVacia==-1){
                mensaje="Error ya tiene creado los cinco clientes de la naviera";
            }
            else{
                misClientes[posVacia]=new Cliente (nombreCliente, nitCliente);
            }
        }
      
        return mensaje;
    }
    
    /**
     * Descripcion: Este metodo se encarga de concatenar los nombres de los clientes en un String
     * pre: La Naviera está creada y el arreglo clientes esta inicializado
     * @return String con los nombres de los clientes de la naviera
    */
    public String displayClientes(){
        String mensaje="Los clientes registrados en la naviera son:";
        for(int i=0; i<misClientes.length;i++){
            if(misClientes[i]!=null){
                mensaje+="\n"+misClientes[i].getNombre();
            }
        }
        return mensaje;
    }
}