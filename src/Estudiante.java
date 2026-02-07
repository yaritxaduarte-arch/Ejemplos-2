public class Estudiante extends Persona {
    //atributos
    private String carrera;
    // construtor
    public Estudiante (String nombre, int edad,String carrera){
        super(nombre,edad);
        this.carrera= carrera;
    }
    //metodo

    @Override
    public String rol()
    {
        return " esta matriculado correctamente";
    }

    public void mostrarInfo (){
        System.out.println("El nombre del estudiante es: " + getNombre());
        System.out.println("La edad del estudiante es: " + getEdad());
        System.out.println("La carrera que estudia es: " + carrera);
    }


}
