package ies.puerto;

import java.lang.invoke.SwitchPoint;

/**
 * Supongamos que tenemos que implementar un programa que clasifica a los estudiantes según sus calificaciones en
 * un examen. Las notas son:
 * Entre 0-4.99. Suspenso.
 * Entre 5-6. Aprobado.
 * Entre 6-6.99. Bien.
 * Entre 7-8.99. Notable.
 * Entre 9-9.99. Sobresaliente.
 * Entre 10. Matrícula.
 * Implementa la solución realizando dos métodos/programas. El primero utilizando if/else y
 * el segundo utilizando switch.
 * @author Nabil
 */
public class Ejercicio3 {
    /**
     * Funcion que clasifica las notas de estudiantes utilizando if
     * @param nota a clasificar
     * @return string de la calificacion
     */
    public String clasificacionNotasIf(double nota) {
        String resultado = "Nota";
            if (nota <= 4.99) {
            resultado = "Suspenso";

            if (nota > 4.99 && nota <= 5.99) {
                resultado = "Aprobado";
            }
            if (nota > 5.99 && nota <= 6.99) {
                resultado = "Bien";
            }
            if (nota > 6.99 && nota <= 8.99) {
                resultado = "Notable";
            }
            if (nota > 8.99 && nota <= 9.99) {
                resultado = "Sobresaliente";
            }
            if (nota == 10) {
                resultado = "Matricula";
            }
        }
        return resultado;
    }

    /**
     * Funcion que clasifica las notas de estudiantes utilizando switch
     * @param nota a evaluar
     * @return
     */
      public String clasificacionNotasSwitch (int nota) {

          String resultado = null;
          switch (nota) {
              case 1:
                  if (nota < 5) {
                      resultado = "Suspenso";
                  }
                  break;
              case 2:
                  if (nota == 5 && nota < 6) {
                      resultado = "Aprobado";
                  } break;
                  case 3:
                  if (nota == 6 && nota < 7) {
                      resultado = "Bien";
                  }
                  break;
                  case 4:
                  if (nota == 7 && nota < 9) {
                      resultado = "Notable";
                  }
                  break;

                  case 5:
                  if (nota == 9 && nota < 10) {
                      resultado = "Sobresaliente";
                  }
                  break;
                  case 6:
                  if (nota == 10) {
                      resultado = "Matricula";
                  }
                  break;
          }
          return resultado;
      }
}

