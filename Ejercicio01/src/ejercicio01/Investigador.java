package ejercicio01;

public class Investigador {
    private String nombre;
    private int categoria;
    private String especialidad;
    private Subsidio[] subsidios = new Subsidio[5];

    public Investigador(String nombre, int categoria, String especialidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.especialidad = especialidad;
    }
    
    public void agregarSubsidio(Subsidio unSubsidio){
        if (this.hayLugar()){
            this.getSubsidios()[ this.getCantSubsidios() + 1 ] = unSubsidio;
        }else
            System.out.println("No se pudo agregar investigador al proyecto.(Maximo excedido)");
    }
    
  
    public boolean hayLugar(){
        return this.getCantSubsidios() < 5;
    }
    
    public double getMontoSubsidios(){
        double auxTotal = 0;
        for (int i = 0; i < this.getCantSubsidios(); i ++){
            if (this.getSubsidios()[i].isOtorgado())
                auxTotal = auxTotal + this.getSubsidios()[i].getMonto();
        }
        return auxTotal;
    }

    public String toString(){
        String texto;
        texto = this.getNombre()+ "  " + this.getEspecialidad() + "  " + this.getMontoSubsidios();
        return texto;
    }
    
    
    //getters & setters
    public int getCategoria() {
        return categoria;
    }
    public String getEspecialidad() {
        return especialidad;
    }
        public String getNombre() {
        return nombre;
    }
    
    public void setSubsidios(Subsidio[] subsidios){
        this.subsidios = subsidios;
    }
    public int getCantSubsidios(){
        return this.getSubsidios().length;
    }
    public Subsidio[] getSubsidios(){
        return this.subsidios;
    }
}
