package parcial3;

public class AlumnoDoctorado extends Alumno{
    private String titulo;
    private String uniOrigen;

    public AlumnoDoctorado(String titulo, String uniOrigen, int DNI, String nombre, int maxMaterias) {
        super(DNI, nombre, 8);
        this.titulo = titulo;
        this.uniOrigen = uniOrigen;
    }
    
    
    

   
    
    
    //Getters & setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getUniOrigen() {
        return uniOrigen;
    }
    public void setUniOrigen(String uniOrigen) {
        this.uniOrigen = uniOrigen;
    }

    @Override
    public boolean isGraduado() {
        boolean auxBoolean = false;
        if (this.getMaterias()[6].getCodigo() == 7 && this.getMaterias()[6].getNota() > 7
        && this.getMaterias()[7].getCodigo() == 8 && this.getMaterias()[7].getNota() > 7)
            auxBoolean = true;
        return auxBoolean;
    }

}