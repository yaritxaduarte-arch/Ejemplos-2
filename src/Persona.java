public abstract class Persona {
    //atributos
    private String nombre;
    private int edad;
    // constructor
    public Persona (String nombre ,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    // metodos
    public String getNombre (){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad (int nuevaEdad){
        if (nuevaEdad <=0 )
        {
            throw new IllegalArgumentException("La edad tiene que ser mayor a 0 ");
        }
        this.edad = nuevaEdad;
    }
    public abstract String rol ();

}
