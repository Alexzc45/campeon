package campeon;
public abstract class campeon {   
    protected String nombre;
    protected int nivelHabilidad;
    protected String rol;
    protected int oroAcumulado;
    public campeon(String nombre, int nivelHabilidad, String rol, int oroAcumulado) {
        this.nombre = nombre;
        this.nivelHabilidad = nivelHabilidad;
        this.rol = rol;
        this.oroAcumulado = oroAcumulado;
    }
    public void setNivelHabilidad(int nivelHabilidad) {
        this.nivelHabilidad = nivelHabilidad;
    }
    public void setOroAcumulado(int oroAcumulado) {
        this.oroAcumulado = oroAcumulado;
    }   
    public abstract void informacion();
    public abstract void realizarAtaque();
    public abstract void lanzarHabildad();
    public abstract void recolectarOro();
}
    

