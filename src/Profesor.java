public class Profesor extends Persona{
    //atributos
    private String materia;
    //constructor
    public Profesor (String nombre, int edad,String materia){
        super(nombre,edad);
        this.materia=materia;
    }

    @Override
    public String rol()
    {
        return " y Me gusta enseñar mucho la materia de "+ materia;
    }
    public void mostrarInfo (){
        System.out.println("El nombre del profesor es: " + getNombre());
        System.out.println("La edad del profesor es: " + getEdad());
        System.out.println("La materia que favorita es: " + materia);
    }

}
