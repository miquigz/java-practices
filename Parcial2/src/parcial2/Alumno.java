package parcial2;

public abstract class Alumno {
    
    private int DNI;
    private String nombre;
    private Materia[] aprobadas;
    private int dimL;
    
    public Alumno(int DNI, String nombre, int maxMaterias) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.aprobadas = new Materia[maxMaterias];
        this.dimL = 0;
    }
    
    
    public void agregarMateria(Materia unaMateria){
        if (this.getDimL() < this.getAprobadas().length){
            Materia[] auxArray = this.getAprobadas();
            auxArray[ this.getDimL() ]= unaMateria;
            this.setAprobadas(auxArray);
            this.setDimL(this.getDimL() + 1);
        }else {
            System.out.println("Limite de materias excedido");
        }
    }
    
    public boolean isGraduado(){
        boolean auxBoolean = false;
        if (this.getDimL() == this.getAprobadas().length) //Si dimL == N
            for (int i=0; i < this.getAprobadas().length; i++)
                if (this.getAprobadas()[i].getNombre() == "Tesis" && this.getAprobadas()[i].getNota() >= 4)
                    auxBoolean = true;
        return auxBoolean;
    }
    
    public String toString(){
        String text = this.getDNI() + this.getNombre() +"; Materias aprboadas:";
        for (int i =0; i < this.getDimL(); i++){
            text = text + "\n" + this.getAprobadas()[i].getNombre() + this.getAprobadas()[i].getNota() + this.getAprobadas()[i].getFecha();
        }
        text = text + "Esta graduado:" + this.isGraduado() + "\n";
        text = text + this.infoExtra();
        return text;
    }
    
    public abstract String infoExtra();
    
    //Getters & setters
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Materia[] getAprobadas() {
        return aprobadas;
    }
    public void setAprobadas(Materia[] aprobadas) {
        this.aprobadas = aprobadas;
    }
    public int getDimL() {
        return dimL;
    }
    public void setDimL(int dimL) {
        this.dimL = dimL;
    }
    
    
    
}
