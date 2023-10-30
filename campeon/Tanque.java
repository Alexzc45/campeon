package campeon;
public class Tanque extends campeon {
    private int resistencia;
    public Tanque(String nombre, int nivelHabilidad,int resistencia,String rol, int oroAcumulado) {
        super(nombre, nivelHabilidad, rol, oroAcumulado);
        this.resistencia = resistencia;
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
        System.out.println("El "+rol+" comienza a lanzar un ataque para defender a sus compañeros");
    }
    @Override
    public void lanzarHabildad(){
        System.out.println("El "+rol+" Lanza una habilidad para proteger sus aliados");
    }
    @Override
    public void recolectarOro(){
        System.out.println("El "+rol+" empieza a recolectar oro ayudando a sus aliados");   
    }
}

    
    

