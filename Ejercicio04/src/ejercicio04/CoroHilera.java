package ejercicio04;

public class CoroHilera extends Coro{
    private Corista[][] coristas;
    private int fila;
    private int columna;
    
    public CoroHilera(int hileras, Director director) {
        super(director);
        this.coristas = new Corista[hileras][hileras]; //fila y col de IGUAL DIMENSION.
        this.setFila(0);
        this.setColumna(0);
    }
    

    @Override
    public void agregarCorista(Corista unCorista) {
        //fila < dimF fila
        if (this.getFila() < this.getCoristas().length){
            //col < dimF col
            if (this.getColumna() < this.getCoristas().length){
                Corista[][] auxCorista = this.getCoristas();
                
                auxCorista[ this.getFila() ][ this.getColumna() ] = unCorista;
                this.setCoristas(auxCorista);
                this.setColumna(this.getColumna() + 1);//Avanzo col
            }else if(this.getColumna() == this.getCoristas().length){//Si llene una fila, entonces avanzo
                this.setColumna(0);//establezco col en 0 (vuelvo a llenar de izq a der).
                this.setFila(this.getFila() + 1);
            }
        }
    }
    

    @Override
    public boolean isLleno() {
        boolean auxLleno = true;
        for (int i=0; i < this.getCoristas().length; i++ )
            for (int j=0; j < this.getCoristas().length; j++ )
                if (null  == this.getCoristas()[i][j].getNombre())
                    auxLleno = false;
        return auxLleno;
    }
    
    @Override
    public boolean bienFormado() {        
        int[][] auxTonos = new int[this.getCoristas().length][this.getCoristas().length];
        //Obtengo todos los tonos en una matriz.
        for (int i =0; i < this.getCoristas().length; i++)
            for (int j =0; j < this.getCoristas().length; j++)
                auxTonos[i][j] = this.getCoristas()[i][j].getTono();
        
        boolean mismoTono = true;
        int tonoAct;
        //Valido si cada corista tiene el mismo tono por hilera.
        for (int i=0; i < this.getCoristas().length; i++){
            tonoAct = auxTonos[i][0]; //fila i, columna 0(primera).
            for (int k=0; k < this.getCoristas().length; k++ )
                if (auxTonos[i][k] != tonoAct)
                    mismoTono = false; //Hipotetico caso en el que un tono sea <> al primero, entonces fallara la condicion del mismo tono por hilera.  
        }
        
        //Primeros coristas de cada hilera(cols) ordenados por tono(Mayor a menor)
        boolean mayorMenor = true;
        for (int j=1; j < this.getCoristas().length; j++)
            if (this.getCoristas()[0][j-1].getTono() < this.getCoristas()[0][j].getTono())
                mayorMenor = false;
        //Hipotetico caso en el que el tono sig sea Mayor que el ant, entonces no cumplo el orden Mayor a menor.
        
        return mismoTono && mayorMenor;//si ambos true: bien formado.
    }
        
//RAW CONTENT
/*boolean mayorMenor = true;
        for (int i=1; i < this.getCoristas().length; i++)
            if (this.getCoristas()[i-1][0].getTono() > this.getCoristas()[i][0].getTono()){
                mayorMenor = false;
*/

    
    
    //Getters & Setters
    public Corista[][] getCoristas() {
        return this.coristas;
    }

    public void setCoristas(Corista[][] coristas) {
        this.coristas = coristas;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }



    
    
    
    
}
