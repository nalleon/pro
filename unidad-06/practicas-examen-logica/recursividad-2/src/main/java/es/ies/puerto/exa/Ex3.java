package es.ies.puerto.exa;

public class Ex3 {
    public static void main(String[] args) {
        String sPalindromaTrue = "Anita lava la tina";
        String sPalindromaFalse = "Anita no lava la tina";
        System.out.println(palindromoTradicional(sPalindromaFalse));
        System.out.println(palindromoTradicional(sPalindromaTrue));
       // System.out.println(palindromoRecursivo(sPalindromaFalse));
     //   System.out.println(palindromoRecursivo(sPalindromaTrue));
    }

    public static boolean palindromoTradicional(String cadena) {

        String caderaLowercase = cadena.replaceAll("\\s+", "").toLowerCase();
        String cadenaInvertida = null;
        for (char i = caderaLowercase.charAt(caderaLowercase.length()-1); i > 0; i--){
            cadenaInvertida += i;
        }


        if (caderaLowercase.equals(cadenaInvertida)){
            return true;
        } else {
            return false;
        }
    }


    public static boolean palindromoRecursivo(String cadena) {

        return true;
    }
}
