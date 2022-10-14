package parcial6;

public class Premiacion {
    private Postulante[] postulados;
    private int dimL;
    
    public Premiacion(int maxPostulantes) {
        this.postulados = new Postulante[maxPostulantes];
        this.dimL = 0;
    }

    
    











//Setters & Getters
    public Postulante[] getPostulados() {
        return postulados;
    }
    public void setPostulados(Postulante[] postulados) {
        this.postulados = postulados;
    }
    public int getDimL() {
        return dimL;
    }
    public void setDimL(int dimL) {
        this.dimL = dimL;
    }
   
}
