package parcial3;

public class AlumnoDeGrado extends Alumno{
    private String carrera;

    public AlumnoDeGrado(String carrera, int DNI, String nombre, int maxMaterias) {
        super(DNI, nombre, 30);//30 = N
        this.carrera = carrera;
    }

    
    //getters & setters
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public boolean isGraduado() {
        boolean auxBoolean = false;
        if ((this.getMaterias()[29].getCodigo() == this.getMaterias().length) && (this.getMaterias()[29].getNota() > 5))
            auxBoolean= true;
        return auxBoolean;
    }

}