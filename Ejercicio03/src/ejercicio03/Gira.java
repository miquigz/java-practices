package ejercicio03;

public class Gira extends Recital {
    
    private String nombreGira;
    private Fecha[] fechas;
    private int actual;
    private int dimLFechas;

    public Gira(String nombreGira, int cantFechas, String nombre, int cantidadTemas) {
        super(nombre, cantidadTemas);
        this.nombreGira = nombreGira;
        this.fechas = new Fecha[cantFechas];
        this.actual = 0;//Por defecto 0, es decir la primera fecha del array
        this.dimLFechas = 0;
    }
    
    //ii)
    public void agregarFecha(Fecha fecha){
        if (this.hayLugar()){
            Fecha[] auxFecha = this.getFechas();
            auxFecha[this.getDimLFechas()] = fecha;
            this.setFechas(auxFecha);
            this.setDimLFechas(this.getDimLFechas() + 1);//sumamos dimL
        }else{
            System.out.println("Cantidad de fechas excedida");
        }
    }
    public boolean hayLugar(){
        return this.getDimL() < this.getFechas().length;
    }
    public void actuar(){
        System.out.println("EldimL es:" + this.getDimLFechas());
        if (null != this.getFechas()[this.getActual()]){
            System.out.println("Buenas noches" + this.getFechas()[this.getActual()].getCiudad() + "\n");
        }
        super.actuar();//Imprime en consola temas
        this.setActual(this.getActual() + 1);
    }
        
    //iv)
    @Override
    public double calcularCosto() {
        double aux = 30000 * this.getDimLFechas();
        return aux;
    }
    
    //Getters & Setters
    public String getNombreGira() {
        return nombreGira;
    }
    public void setNombreGira(String nombreGira) {
        this.nombreGira = nombreGira;
    }
    public Fecha[] getFechas() {
        return fechas;
    }
    public void setFechas(Fecha[] fechas) {
        this.fechas = fechas;
    }
    public int getActual() {
        return actual;
    }
    public void setActual(int actual) {
        this.actual = actual;
    }
    
    public int getDimLFechas() {
        return this.dimLFechas;
    }

    public void setDimLFechas(int dimL) {
        this.dimLFechas = dimL;
    }

    
}
