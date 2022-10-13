package parcial4;

public abstract class Premiacion {
    private Postulante[] postulados;
    private int dimL;
    
    public Premiacion(int maximoPostulados){
        this.setPostulados(new Postulante[maximoPostulados]);
    }
    
    public void agregarPostulante(Postulante unPostulante){
        if (this.getDimL() < this.getPostulados().length){
            Postulante[] auxArray = this.getPostulados();
            auxArray[this.getDimL()] = unPostulante;
            this.setDimL(this.getDimL() + 1);
            this.setPostulados(auxArray);
        }else{
            System.out.println("Maximo de postulantes excedido");
        }
    }
    
    public abstract Postulante otorgarPremio();

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int getDimL() {
        return dimL;
    }

    public void setDimL(int dimL) {
        this.dimL = dimL;
    }

    public Postulante[] getPostulados() {
        return postulados;
    }

    public void setPostulados(Postulante[] postulados) {
        this.postulados = postulados;
    }
    
    
    
}
