package parcial5;

public class Publicacion extends Premiacion{
    public Publicacion(int cantMaxima) {
        super(cantMaxima);
    }

    @Override
    public String otorgarPremio(int X) {
        String text = "";
        for (int i=0; i < this.getDimL(); i++){
            if (this.getPostulados()[i].getCantPubli() > X){
                text = text + this.getPostulados()[i].getNombre();
            }
        }
        return text;
    }
    
    
}
