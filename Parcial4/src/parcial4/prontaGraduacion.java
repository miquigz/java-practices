package parcial4;

public class prontaGraduacion extends Premiacion {
    
    public prontaGraduacion(int maxPostulantes){
        super(maxPostulantes);
    }
    
    @Override
    public Postulante otorgarPremio() {
        int auxAnios;
        Postulante menorPostulante = null;//inicializo en null
        int menorAnios = 999;
        for (int i =0; i < this.getDimL(); i++){
            auxAnios = this.getPostulados()[i].getEgreso() - this.getPostulados()[i].getIngreso();
            if ( auxAnios < menorAnios ){
                menorAnios = auxAnios;
                menorPostulante = this.getPostulados()[i];
            }
        }
        return menorPostulante;
    }
    
    
    
    
    
}
