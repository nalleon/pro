package es.ies.puerto.modelo.impl;
/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class Ejercicio9 {

    public String calcArea(String polygon, float base, float height){
        float result = 0;

        if (polygon.contentEquals("square") && base!=height){
            return "Base must equal height.";
        }
        switch (polygon){
            case "triangle":
                result = (base * height)/2;
                break;
            case "square":
                result = (base * height);
                break;

            case "rectangle":
                result = base * height;
                break;
            default:
                return "Supported polygons are: triangle, square and rectangle.";
        }

        return String.valueOf(result);
    }
}
