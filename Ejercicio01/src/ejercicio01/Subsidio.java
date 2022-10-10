package ejercicio01;

public class Subsidio {
    private double monto;
    private String motivo;
    private boolean otorgado;

    public Subsidio(double monto, String motivo){
        this.monto = monto;
        this.motivo = motivo;
        this.otorgado = false;
    }

    public double getMonto() {
        return monto;
    }

    public String getMotivo() {
        return motivo;
    }

    public boolean isOtorgado() {
        return otorgado;
    }
    
    public void setOtorgado(Boolean valor){
        this.otorgado = valor;
    }
    
}
