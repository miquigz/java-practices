package ejercicio04;

public class Corista {
    private String nombre;
    private int DNI;
    private int edad;
    private int tono;

    public Corista(String nombre, int DNI, int edad, int tono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.tono = tono;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTono() {
        return tono;
    }

    public void setTono(int tono) {
        this.tono = tono;
    }
    
    
    
    
    
}
