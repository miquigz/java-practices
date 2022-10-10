package ejercicio01;

public class Proyecto {
    private String nombre;
    private int cod;
    private String director;
    private Investigador[] investigadores;

    public Proyecto(String nombre, int cod, String director) {
        this.nombre = nombre;
        this.cod = cod;
        this.director = director;
    }
    
    public void agregarInvestigador(Investigador inve){
        if (this.hayLugar()){
            this.investigadores[this.getCantInvestigadores() + 1] = inve;
        }else
            System.out.println("No se pudo agregar investigador al proyecto.(Maximo excedido)");
    }

    public int getCantInvestigadores(){
        return this.getInvestigadores().length;
    }
    
    public Investigador[] getInvestigadores() {
        return investigadores;
    }
    
    public boolean hayLugar(){
        return this.getCantInvestigadores() < 50;
    }
    
    public double dineroTotalOtorgado(){
        int i;    double montoTotal = 0;
        //Recorremos cantidad de investigadores del proyecto
        for (i=0; i < this.getCantInvestigadores(); i++){
            montoTotal = montoTotal + this.getInvestigadores()[i].getMontoSubsidios();
        }
        System.out.println("Monto total:" + montoTotal);
        return montoTotal;
    }
    
    
    public void otorgarTodos(String nombre_investigador){
        boolean encontre = false;
        for (int i=0; i < this.getCantInvestigadores(); i++){
            if (this.getInvestigadores()[i].getNombre() == nombre_investigador){
                encontre = true;
                for (int j=0; j < this.getInvestigadores()[i].getCantSubsidios(); j++)
                    //Si NO esta otorgado lo pongo en true.
                    if ( !(this.getInvestigadores()[i].getSubsidios()[j].isOtorgado()) )
                        this.getInvestigadores()[i].getSubsidios()[j].setOtorgado(true);
            }
        }
        if (encontre){
            System.out.println("Todos los subsidios otorgados a: " + nombre_investigador);
        }else
            System.out.println("Investigador no encontrado");
    }
        
    public String toString(){
        String text = this.getNombre() + this.getCod() + this.getDirector() + this.dineroTotalOtorgado();
        for (int i = 0; i < this.getCantInvestigadores(); i++){
            text = text + "\n" + this.getInvestigadores()[i].toString();
        }
        return text;
    }
    
    //getters
    public String getNombre() {
        return nombre;
    }
    public int getCod() {
        return cod;
    }
    public String getDirector() {
        return director;
    }
}

//------------RAW CONTENT (ya Factorizado)-------------
/*
    public double dineroTotalOtorgado(){
        int i, k; double montoTotal = 0;
        //Recorremos cantidad de investigadores del proyecto
        for (i=0; i < this.getCantInvestigadores(); i++){
            //Recorremos los subsidios del investigador actual.
            for (k = 0; k < this.getInvestigadores()[i].getCantSubsidios(); i++)
                //Verificamos si fue otorgado dicho subsidio, de ser asi: sumamos monto.
                if (this.getInvestigadores()[i].getSubsidios()[k].isOtorgado())
                    montoTotal = montoTotal + this.getInvestigadores()[i].getSubsidios()[k].getMonto();
        }
        System.out.println("Monto total:" + montoTotal);
        return montoTotal;
    }
*/