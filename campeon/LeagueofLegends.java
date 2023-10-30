package campeon;
public class LeagueofLegends {
    public static void main(String[] args) {
        killer killer1 = new killer("sombrio", 20, 75, "killer", 1200);
        killer1.realizarAtaque();        
        System.out.println("---------------------");      
        Tanque tanque1 = new Tanque("inquebrantable", 25, 90, "Tanque", 1500);
        tanque1.recolectarOro();
        System.out.println("---------------------");
        Supports support1 = new Supports("sanador", 18, 80, "support", 1000);
        Magos mago1 = new Magos("Arcano", 22, 85, "Mago", 1300);
        mago1.lanzarHabildad();
        System.out.println("---------------------");
        support1.setNivelHabilidad(20);
        killer1.setOroAcumulado(1400);
        Magos mago2 = new Magos("hechicero",24,95,"mago",1600);
        support1.recolectarOro();
        System.out.println("---------------------");
        tanque1.realizarAtaque();
        System.out.println("---------------------");
        mago2.informacion();
        System.out.println("---------------------");
        support1.informacion();
        System.out.println("---------------------");
    }  
}
