package parcial2;

public class AlumnoDeGrado extends Alumno{
    private String carrera;

    public AlumnoDeGrado(String carrera, int DNI, String nombre, int maxMaterias) {
        super(DNI, nombre, maxMaterias);
        this.carrera = carrera;
    }

    @Override
    public String infoExtra() {
        String text = "Carrera: " + this.getCarrera();
        return text;
    }
    
    //getters & setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
}
