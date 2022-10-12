package ejercicio01;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        Investigador[] investigadores = new Investigador[50];
        
        investigadores[0] = new Investigador("InvestigadorN1", 2, "Informatica");
        investigadores[1] = new Investigador("InvestigadorN2", 4, "Medicina");
        investigadores[2] = new Investigador("InvestigadorN1", 9, "Geofisica");
        
        Subsidio subsidio1, subsidio2;
        subsidio1 = new Subsidio(4800, "Reformas");
        subsidio2 = new Subsidio(4800, "Investigacion");
        
        for (int i=0; i < 2; i++){
            investigadores[i].agregarSubsidio(subsidio1);
            investigadores[i].agregarSubsidio(subsidio2);
            investigadores[i].getSubsidios()[1].setOtorgado(true);
        }
        
        Proyecto project = new Proyecto("Nombre proyecto", 2342, "Martinez");
        for (int i=0; i < 2; i++){
            project.agregarInvestigador(investigadores[i]);
        }
        //project.agregarInvestigador(ines);
        System.out.println(project.toString());
    }
    
}
