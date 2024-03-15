package es.ies.puerto.modelo.impl;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Crea una función que ordene y retorne una matriz de números.
 * - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro
 *   adicional "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor
 *   o de mayor a menor.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
 *   automáticamente.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Integer[] nums = {5, 2, 9, 1, 3};
        System.out.println(orderNumList(nums, "asc"));
        System.out.println(orderNumList(nums, "desc"));
        System.out.println(orderNumList(nums, "invalid"));
    }
    public static String orderNumList(Integer[] nums, String typeOrder){
        typeOrder = typeOrder.toLowerCase();
        Integer [] result = nums;

        switch (typeOrder){
            case "asc":
                for (int i = 1; i <= nums.length-1; i++){
                    if (nums[i-1] > nums[i]){
                        int previous = nums[i - 1];
                        int current = nums[i];
                        result[i] = previous;
                        result[i-1] = current;
                    }
                }
                break;

            case "desc":
                for (int i = 1; i <= nums.length-1; i++){
                    if (nums[i-1] < nums[i]){
                        int current = nums[i];
                        int previous = nums[i - 1];
                        result[i] = previous;
                        result[i-1] = current;
                    }
                }
                break;

            default:
                return "Param must be either asc or desc";

        }
        return Arrays.toString(result);
    }
}
