package ejercicio02;

public class Auto {
    private String nombre;
    private String patente;

    public Auto(String nombre, String patente) {
        this.nombre = nombre;
        this.patente = patente;
    }

    
    
    
    
    
    
    public String toString(){
        String txt;
        txt = this.getNombre()+ " " + this.getPatente()+ " ";
        return txt;
    }
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    

}

