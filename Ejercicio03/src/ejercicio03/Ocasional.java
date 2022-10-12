package ejercicio03;
public class Ocasional extends Recital{
    private String motivo;
    private String contratante;
    private String dia;

    public Ocasional(String motivo, String contratante, String dia, String nombre, int cantTemas) {
        super(nombre, cantTemas);
        this.motivo = motivo;
        this.contratante = contratante;
        this.dia = dia;
    }
    
    public void actuar(){
        if (null != this.getMotivo())switch (this.getMotivo()) {
            case "beneficiencia":
                System.out.println("Recuerden colaborar con: " + this.getContratante());
                break;
            case "TV":
                System.out.println("Saludos amigos televidentes");
                break;
            case "privado":
                System.out.println("Un feliz cumpleanios para " + this.getContratante());
                break;
            default:
                break;
        }
        super.actuar();
    }
    
    //iv)
    public double calcularCosto() {
        double aux = -1;
        if (null != this.getMotivo())switch (this.getMotivo()) {
            case "beneficiencia":
                aux = 0;
                break;
            case "TV":
                aux = 50000;
                break;
            case "privado":
                aux = 150000;
                break;
            default:
                break;
        }
        return aux;
    }
    
    //getters & setters
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getContratante() {
        return contratante;
    }
    public void setContratante(String contratante) {
        this.contratante = contratante;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }

}
