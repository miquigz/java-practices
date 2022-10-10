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
    
    public Subsidio[] getSubsidios(){
        return this.subsidios;
    }
    
    public int getCantSubsidios(){
        return this.getSubsidios().length;
    }
    
    public boolean hayLugar(){
        return this.getCantSubsidios() < 5;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setSubsidios(Subsidio[] subsidios){
        this.subsidios = subsidios;
    }
    
    
}
