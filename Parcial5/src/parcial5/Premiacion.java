package parcial5;

public abstract class Premiacion {
    private Postulante[] postulados;//docentes-investigadores.
    private int dimL;

    public Premiacion(int cantMaxima) {
        this.postulados = new Postulante[cantMaxima];
        this.dimL = 0;
    }
 
    public abstract String otorgarPremio(int X);
    
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
