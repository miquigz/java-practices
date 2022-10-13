package parcial1;

public class Parcial1 {

    
    public static void main(String[] args) {
        
        Catalogo cata = new Catalogo();
        Artista arti = new Artista("nombre1", "Argentina");
        Artista arti2 = new Artista("nombre2", "Argentina");
        cata.incorporarArtista(arti2, 4);
        cata.incorporarArtista(arti, 2);
        System.out.println(cata.toString());
    }
    
}
