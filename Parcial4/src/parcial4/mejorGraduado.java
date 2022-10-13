package parcial4;

public class mejorGraduado extends Premiacion{

    public mejorGraduado(int maximoPostulados) {
        super(maximoPostulados);
    }

    @Override
    public Postulante otorgarPremio() {
        Postulante mayorPostulante = null;
        double mayorProm = -99;
        for (int i =0; i < this.getDimL(); i++){
            if (this.getPostulados()[i].getPromedio() > mayorProm){
                mayorProm = this.getPostulados()[i].getPromedio();
                mayorPostulante = this.getPostulados()[i];
            }
        }
        return mayorPostulante;
    }
    
}
