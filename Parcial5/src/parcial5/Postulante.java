package parcial5;

public class Postulante {
    private String nombre;
    private int cantPubli;
    private int antiguedad;//antiguedad en anios

    public Postulante(String nombre, int cantPubli, int antiguedad) {
        this.nombre = nombre;
        this.cantPubli = cantPubli;
        this.antiguedad = antiguedad;
    }

    
    
    
    
    
    
    
    
    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPubli() {
        return cantPubli;
    }

    public void setCantPubli(int cantPubli) {
        this.cantPubli = cantPubli;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
    
    
}
