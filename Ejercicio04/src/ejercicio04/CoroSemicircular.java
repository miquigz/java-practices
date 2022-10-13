package ejercicio04;
    
public class CoroSemicircular extends Coro {
    private Corista[] coristas;
    private int dimL;
    

    public CoroSemicircular(int dimension, Director director) {
        super(director);
        this.coristas = new Corista[dimension];
    }

    
    @Override
    public void agregarCorista(Corista unCorista) {
        if (this.getDimL() < this.getCoristas().length){
            Corista[] auxCoristas = this.getCoristas();
            auxCoristas[this.getDimL()] = unCorista;
            this.setCoristas(auxCoristas);
            this.setDimL(this.getDimL() + 1);
        }
    }
    
    @Override
    public boolean isLleno() {
        boolean auxLleno = true;
        for (int i=0; i < this.getCoristas().length; i++)
            if (null  == this.getCoristas()[i].getNombre())
                auxLleno = false;
        return auxLleno;
    }

    
    @Override
    public boolean bienFormado() {
        boolean auxBien = true;
        for (int i=1; i < this.getCoristas().length; i++)
            if (this.getCoristas()[i].getTono() < this.getCoristas()[i].getTono())
                auxBien = false;
        return auxBien;    
    }
    
    //Getters & Setters
    public Corista[] getCoristas() {
        return coristas;
    }

    public void setCoristas(Corista[] coristas) {
        this.coristas = coristas;
    }

    public int getDimL() {
        return dimL;
    }

    public void setDimL(int dimL) {
        this.dimL = dimL;
    }

    
}
