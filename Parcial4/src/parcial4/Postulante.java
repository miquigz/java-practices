package parcial4;

public class Postulante {
    private String nombre;
    private double promedio;
    private int ingreso;
    private int egreso;

    public Postulante(String nombre, double promedio, int ingreso, int egreso) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.ingreso = ingreso;
        this.egreso = egreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getEgreso() {
        return egreso;
    }

    public void setEgreso(int egreso) {
        this.egreso = egreso;
    }
    
    
}
