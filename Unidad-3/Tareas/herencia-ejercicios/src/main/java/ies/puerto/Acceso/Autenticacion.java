package ies.puerto.Acceso;
import ies.puerto.Persona;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autenticacion {
    public Autenticacion () {}

    public boolean validateDNI (String dni){
        String regex = "(\\d{8}[A-HJ-NP-TV-Z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);
        return matcher.matches();
    }

    public boolean validateAge(int age){
        if (age >= 0){
            return true;
        }
        return false;
    }
}
