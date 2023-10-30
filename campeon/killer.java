package campeon;
public class killer extends campeon{
    private int letalidad;
    public killer(String nombre, int nivelHabilidad,int letalidad,String rol, int oroAcumulado) {
        super(nombre, nivelHabilidad, rol, oroAcumulado);
        this.letalidad = letalidad;
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
        System.out.println("El "+rol+" comienza a lanzar un ataque letal al enemigo");
    }
    @Override
    public void lanzarHabildad(){
        System.out.println("El "+rol+" Lanza una habilidad peligrosa");
    }
    @Override
    public void recolectarOro(){
        System.out.println("El "+rol+" empieza a recolectar oro haciendose la jungla");   
    }
}
    

