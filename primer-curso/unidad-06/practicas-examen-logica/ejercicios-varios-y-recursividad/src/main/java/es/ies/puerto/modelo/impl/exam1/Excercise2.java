package es.ies.puerto.modelo.impl.exam1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Excercise2 {
    final String expresionRegular = "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$";
    private final String fechaEstreno = "17/12/2003";
    Date dFechaEstreno = null;
    private final String formatDate = "dd/MM/yyyy";
    SimpleDateFormat dateFormat;

    public Excercise2() {
        dateFormat = new SimpleDateFormat(formatDate);
        try {
            dFechaEstreno = dateFormat.parse(fechaEstreno);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public long obtenerDiasDesdeRetornoRey(String fecha) {
        if (fecha == null || !validateDate(fecha)){
            return -1;
        }

        Date todaysDate = new Date();
        Date insertedDate;


        try{
            if (fecha.isEmpty()){
                insertedDate = todaysDate;
            } else {
                insertedDate = dateFormat.parse(fecha);
            }



        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return 1;

    }


    public boolean validateDate(String date){
        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
