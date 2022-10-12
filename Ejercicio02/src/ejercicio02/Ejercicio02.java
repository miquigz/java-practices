package ejercicio02;

import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio02 {

    public static void main(String[] args) {
        Estacionamiento est;
        GeneradorAleatorio.iniciar();
        
        est = new Estacionamiento("estacionamient", "7 y 50", 800, 2000, 3, 3);
        
        //Auto a = new Auto("Nombre Duenio", "USE613");
        
        Auto a;
        for (int i= 0; i < est.getN()-1; i++){
            for(int j= 0; j < est.getM(); j++){
                if (j == 0 & i == 0){
                    a = new Auto("Nombre Duenio", "USE613");
                    est.agregarAuto(a, i, j);
                }else{
                    a = new Auto("Nombre duenio", GeneradorAleatorio.generarString(6));
                    est.agregarAuto(a, i, j);
                }
            }
        }
        
        System.out.println(est.toString());
        System.out.println("------------------------");
        System.out.println(est.obtenerPosicion("USE613"));
        System.out.println("------------------------");
        System.out.println(est.obtenerPosicion("NONE613"));
        System.out.println("------------------------");
        System.out.println(est.totalPlaza(1));
        System.out.println("------------------------");
        
        
    }
    
}
