package ies.puerto;

public class AppPersona {

    static Alumno alumno;
    static Estudiante estudiante;

    public static void main(String[] args) {
        alumno = new Alumno("Nabil",18, "23457242W");
        estudiante = new Estudiante("1ºDAM", new float[]{7.6f, 5f, 10f, 8.4f, 5.75f});
        System.out.println("> Student's info:\n" +alumno.toString());
        System.out.println("> Valid DNI:\n" + alumno.validateDNI());
        System.out.println("> Student's info:\n" + estudiante.toString());
        System.out.println("> Greeting: " + estudiante.greeting());
    }
}
