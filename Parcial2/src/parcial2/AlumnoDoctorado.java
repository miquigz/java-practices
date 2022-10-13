package parcial2;

public class AlumnoDoctorado extends Alumno{
    private String titulo;
    private String uniOrigen;

    public AlumnoDoctorado(String titulo, String uniOrigen, int DNI, String nombre, int maxMaterias) {
        super(DNI, nombre, maxMaterias);
        this.titulo = titulo;
        this.uniOrigen = uniOrigen;
    }
    
    
    

    @Override
    public String infoExtra() {
        String text = "Titulo;" +this.getTitulo() + "Universidad de origen:" + this.getUniOrigen();
        return text;
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

}
