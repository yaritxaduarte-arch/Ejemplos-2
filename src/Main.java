public class Main {
    public static void main(String[] args)
    {
        Persona [] person = new Persona [4];
        person [0] = new Estudiante("juan",20,"ing");
        person [1] = new Profesor("carlos",58,"calculo");
        person [2] = new Estudiante("nicol",17,"ing civil");
        person [3] = new Profesor("Luis",60,"fisic");

        for (Persona p : person){
            System.out.println(p.getNombre() + p.rol());
        }



    }
}
