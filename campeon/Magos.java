package campeon;
public class Magos extends campeon {
    private int poderMagico;
    public Magos(String nombre, int nivelHabilidad,int poderMagico, String rol, int oroAcumulado) {
        super(nombre, nivelHabilidad, rol, oroAcumulado);
        this.poderMagico = poderMagico;
    }
    @Override
    public void informacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel de Habilidad: " + nivelHabilidad);
        System.out.println("Rol: " + rol);
        System.out.println("Oro Acumulado: " + oroAcumulado);
    }
    @Override
    public void realizarAtaque(){
        System.out.println("El "+rol+" comienza a lanzar un ataque al enemigo");
    }
    @Override
    public void lanzarHabildad(){
        System.out.println("El "+rol+" Lanza una habilidad poderosa que consume mucho mana");
    }
    @Override
    public void recolectarOro(){
        System.out.println("El "+rol+" empieza a recolectar oro limpiando su linea");   
    }
}

    
    
    

