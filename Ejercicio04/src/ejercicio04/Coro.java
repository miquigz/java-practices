package ejercicio04;

public abstract class Coro {
    
    private Director director;

    public Coro(Director director) {
        this.director = director;
    }
    
    public abstract void agregarCorista(Corista unCorista);
    
    public abstract boolean isLleno();

    public abstract boolean bienFormado();
    
    //Getters & Setters
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
    
    
    
}
