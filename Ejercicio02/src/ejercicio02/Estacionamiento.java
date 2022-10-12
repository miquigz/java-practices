package ejercicio02;

public class Estacionamiento {
    
    private String nombre;
    private String direccion;
    private int apertura;
    private int cierre;
    private int n;
    private int m;
    private Auto[][] estacionamientos;
    private boolean[][] ocupado;
    
    public Estacionamiento(String nombre, String direccion, int apertura, int cierre, int n, int m) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setApertura(apertura);
        this.setCierre(cierre);
        this.setN(n);
        this.setM(m);
        this.setEstacionamientos(new Auto[n][m]);
        this.ocupado = new boolean[n][m];
        this.setOcupadoAll(false);
    } //= new Auto[n][m];
    
    public Estacionamiento(String nombre, String direccion){
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setApertura(800);// 08:00 (8 am)
        this.setCierre(2100);// 21:00 (9 pm)
        this.setN(5);//pisos
        this.setM(10);//plazas(por piso)
        this.setEstacionamientos(new Auto[this.getN()][this.getM()]);
        this.ocupado = new boolean[n][m];
        this.setOcupadoAll(false);
    }
    
    
    
    public void agregarAuto(Auto a, int x, int y){//damos por sentado que: X e Y son lugares desocupados.
        Auto[][] auxEst; 
        auxEst = this.getEstacionamientos(); //Obtenemos matriz actual
        auxEst[x][y] = a; 
        this.setEstacionamientos(auxEst); //Actualizamos.
        this.setOcupado(x, y, true);
    }
    
    public String obtenerPosicion(String unaPatente){
        int i, j; 
        String txt = "Auto Inexistente";
        for (i= 0; i < this.getN(); i++)
            for (j=0; j < this.getM(); j++)
                if (this.getOcupado()[i][j])
                    if (this.getEstacionamientos()[i][j].getPatente() == unaPatente)
                        txt  = "Patente: " + unaPatente + "Encontrada en piso:" + i+1 + ", plaza:" + j+1;
        return txt;
    }

    
    public String toString(){
        String txt = "";
        int i, j;
        for (i = 0; i < this.getN(); i++){
            
            for (j = 0; j < this.getM(); j++){
                if (this.getOcupado()[i][j]){
                    txt = txt + " Plaza " + j + ":"+ this.getEstacionamientos()[i][j].toString();
                }else{
                    txt = txt + " Plaza " + j + ":libre |";
                }
            }
            txt = txt + "[Piso N:" + i + "]\n";
        }
        return txt;
    }
    
    
    public int totalPlaza(int Y){
        int total =0;
        for (int i = 0; i < this.getN(); i++){
            if (this.getOcupado()[i][Y]){
                total++;
            }
        }
        return total;
    }
    
    
    
    
/*    public boolean isOcupado(int x, int y){
        return this.getOcupado()[x][y];
    }*/
    public void setOcupadoAll(boolean unValor){
        for (int i=0; i < this.getN(); i++)
            for (int j=0; j < this.getM(); j++)
                this.ocupado[i][j] = unValor;
    }
    
    public void setOcupado(int x, int y, boolean unValor){
        this.getOcupado()[x][y] = unValor;
    }
    
    public boolean[][] getOcupado(){
        return this.ocupado;
    }
    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getApertura() {
        return apertura;
    }

    public void setApertura(int apertura) {
        this.apertura = apertura;
    }

    public int getCierre() {
        return cierre;
    }

    public void setCierre(int cierre) {
        this.cierre = cierre;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public Auto[][] getEstacionamientos() {
        return estacionamientos;
    }

    public void setEstacionamientos(Auto[][] estacionamientos) {
        this.estacionamientos = estacionamientos;
    }

    
}
