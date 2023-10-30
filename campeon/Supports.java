package campeon;
public class Supports extends campeon {
    private int habiliadesCurativas;
    public Supports(String nombre, int nivelHabilidad,int habiliadesCurativas, String rol, int oroAcumulado) {
        super(nombre, nivelHabilidad, rol, oroAcumulado);
        this.habiliadesCurativas = habiliadesCurativas;
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
        System.out.println("El "+rol+" lanza un ataque para defender a sus compañeros");
    }
    @Override
    public void lanzarHabildad(){
        System.out.println("El "+rol+" Lanza una habilidad para curar a sus aliados");
    }
    @Override
    public void recolectarOro(){
        System.out.println("El "+rol+" recolecta oro farmeando matando a los minions");   
    }
}
    

