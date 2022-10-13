
package parcial1;

public class Catalogo {
    Artista[] categorias;
//Constr
    public Catalogo() {
        this.categorias = new Artista[15];
    }

    
    
    public void incorporarArtista(Artista unArtista, int categoria){
        this.getCategorias()[categoria] = unArtista;
    }
    
    public String toString(){
        String text = "";
        for (int i =0; i < this.getCategorias().length; i++){
            text = text + "Categoria "+ i;
            if (this.getCategorias()[i] != null){
                text = text +"Categoria "+ i +","+this.getCategorias()[i].toString();
            }else {
                text = text + ",sin artista";
            }
            text = text + "\n";
        }        
        return text;
    }
    
    //Getters & setters
    public Artista[] getCategorias() {
        return categorias;
    }

    public void setCategorias(Artista[] categorias) {
        this.categorias = categorias;
    }
    
    
}
