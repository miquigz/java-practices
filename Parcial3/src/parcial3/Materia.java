package parcial3;

public class Materia {
    private int codigo;
    private double nota;
    private String fecha;
    

    public Materia(int codigo, double nota, String fecha) {
        this.codigo = codigo;
        this.nota = nota;
        this.fecha = fecha;
    }

    
    
    public String toString(){
        String txt = this.getCodigo() + this.getNota() + this.getFecha() + "\n";
        return txt;
    }
    
    
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
