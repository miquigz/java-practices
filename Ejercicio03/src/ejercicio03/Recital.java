package ejercicio03;

public abstract class Recital {
    private String nombre;
    private String[] listaTemas;
    private int dimL;
    
    public Recital(String nombre, int cantidadTemas) {
        this.nombre = nombre;
        this.listaTemas = new String[cantidadTemas];
        this.dimL = 0;
    }
    
    //i)
    public void agregarTema(String nombre){
        if (hayLugar()){
            String[] auxArray = this.getListaTemas();
            auxArray[this.getDimL()] = nombre;
            this.setListaTemas(auxArray);
            this.setDimL(this.getDimL() + 1);//Sumamos dimL
        }else{
            System.out.println("Cantidad de temas excedido");
        }
    }
    public boolean hayLugar(){
        return dimL < this.getListaTemas().length;
    }
    public void actuar(){
        for (int i=0; i < this.getDimL(); i++){
            System.out.println("y ahora tocaremos:" + this.getListaTemas()[i] + "\n");
        }
    }
    
    //iv)
    public abstract double calcularCosto();
        
    //Getters & setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String[] getListaTemas() {
        return listaTemas;
    }
    public void setListaTemas(String[] listaTemas) {
        this.listaTemas = listaTemas;
    }

    public int getDimL() {
        return dimL;
    }

    public void setDimL(int dimL) {
        this.dimL = dimL;
    }
    
    
}
