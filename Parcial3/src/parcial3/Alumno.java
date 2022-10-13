package parcial3;

public abstract class Alumno {
    private int DNI;
    private String nombre;
    private Materia[] materias;
    private int dimL;
    
    public Alumno(int DNI, String nombre, int cantMaterias) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.dimL = 0;
        this.materias = new Materia[cantMaterias];
    }

    public void aprobarMateria(Materia unaMateria){
        if (dimL < this.getMaterias().length){
            Materia[] auxArray = this.getMaterias();
            auxArray[this.getDimL()] = unaMateria;
            this.setMaterias(auxArray);
            this.setDimL(this.getDimL() + 1);
        }else
            System.out.println("Limite de materias excedidio");
    }
    
    public abstract boolean isGraduado();
    
    public String toString(){
        String txt = this.getDNI() + this.getNombre() + "Materias aprobadas: \n";
        for (int i=0; i < this.getDimL(); i++){
            txt = txt + this.getMaterias()[i].toString();
        }
        txt = txt + "Esta graduado: "+ this.isGraduado();
        return txt;
    }
    
     
    //Getters & Setters
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
    public Materia[] getMaterias() {
        return materias;
    }
    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }
    public int getDimL() {
        return dimL;
    }
    public void setDimL(int dimL) {
        this.dimL = dimL;
    }
    
}
