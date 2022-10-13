package parcial2;

public class Parcial2 {

    public static void main(String[] args) {
        
        AlumnoDeGrado AluGrado = new AlumnoDeGrado("Licenciatura Info", 1234, "ExampleName", 34);
        AlumnoDoctorado AluDoc = new AlumnoDoctorado("Ingenieria en Sistemas", "UBA", 4321, "Ej nombre", 48);
        
        Materia mat1 = new Materia("CADP", 8, "12/03/2017");
        Materia mat2 = new Materia("MAT1", 9, "12/08/2018");
        
        AluGrado.agregarMateria(mat2);
        AluGrado.agregarMateria(mat1);
        AluDoc.agregarMateria(mat1);
        AluDoc.agregarMateria(mat2);
        
        System.out.println("--------------");
        System.out.println(AluGrado.toString());
        System.out.println("--------------");
        System.out.println(AluDoc.toString());
        System.out.println("--------------");
        
    }
    
}
