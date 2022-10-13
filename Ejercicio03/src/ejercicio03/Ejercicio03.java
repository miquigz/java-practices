package ejercicio03;

public class Ejercicio03 {

    public static void main(String[] args) {
       Ocasional eventoOca = new Ocasional("TV", "C5N", "Martes", "artista", 3);
       Gira eventoGira = new Gira("To world", 4, "artistaNombre", 14);
       eventoOca.agregarTema("tema1");
       eventoGira.agregarTema("tema12323");
       Fecha fe = new Fecha("La Plata", "Miercoles");
       eventoGira.agregarFecha(fe);
       
       eventoOca.actuar();
       eventoGira.actuar();
       
       
       System.out.println(eventoGira.getNombreGira()+ " costo: "+ eventoGira.calcularCosto());
       System.out.println(eventoOca.getNombre()+ " costo: "+ eventoOca.calcularCosto());
       
    }
    
}
