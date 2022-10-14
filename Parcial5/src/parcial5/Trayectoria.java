package parcial5;


public class Trayectoria extends Premiacion{

    public Trayectoria(int cantMaxima) {
        super(cantMaxima);
    }

    
    
    @Override
    public String otorgarPremio(int X) {
        String text = "";
        for (int i=0; i < this.getDimL(); i++){
            if (this.getPostulados()[i].getAntiguedad() > X){
                text = text + this.getPostulados()[i].getNombre();
            }
        }
        return text;
    }
    
    
    
    
    
}
