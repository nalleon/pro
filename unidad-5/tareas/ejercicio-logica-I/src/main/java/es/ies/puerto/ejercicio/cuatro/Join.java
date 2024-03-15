package es.ies.puerto.ejercicio.cuatro;

import java.util.*;

public class Join {
    List<Map<String, Object>> tabla1;
    List<Map<String, Object>> tabla2;
    public Join() {
        tabla1 = new ArrayList<>();
        tabla2 = new ArrayList<>();

        Map<String, Object> fila1 = new HashMap<>();
        fila1.put("id", 1);
        fila1.put("nombre", "Juan");
        tabla1.add(fila1);

        Map<String, Object> fila2 = new HashMap<>();
        fila2.put("id", 2);
        fila2.put("nombre", "María");
        tabla1.add(fila2);

        Map<String, Object> fila3 = new HashMap<>();
        fila3.put("id", 1);
        fila3.put("producto", "Camisa");
        tabla2.add(fila3);

        Map<String, Object> fila4 = new HashMap<>();
        fila4.put("id", 3);
        fila4.put("producto", "Zapatos");
        tabla2.add(fila4);
    }

    Map<Integer, List<Object>> innerJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        Map<Integer, List<Object>> innerJoin = new HashMap<>();

        for (Map.Entry<Integer, String> entry1 : tabla1.entrySet()) {
            Integer id1 = entry1.getKey();
            String nombre = entry1.getValue();
            Integer id2 = tabla2.get(id1);

            if (id2 != null) {
                List<Object> datosCombinados = new ArrayList<>();
                datosCombinados.add(nombre);
                datosCombinados.add(id2);
                innerJoin.put(id1, datosCombinados);
            }
        }
        return innerJoin;
    }

    Map<Integer, List<Object>> leftJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        Map<Integer, List<Object>> leftJoin = new HashMap<>();
        for (Map.Entry<Integer, String> entry1 : tabla1.entrySet()) {
            Integer id1 = entry1.getKey();
            String nombre = entry1.getValue();
            Integer id2 = tabla2.get(id1);
            List<Object> datosCombinados = new ArrayList<>();
            datosCombinados.add(nombre);
            if (id2 != null) {
                datosCombinados.add(id2);
            } else {
                datosCombinados.add(null);
            }
            leftJoin.put(id1, datosCombinados);
        }
        return leftJoin;

    }

    Map<Integer, List<Object>> rightJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        Map<Integer, List<Object>> rightJoin = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry2 : tabla2.entrySet()) {
            Integer id1 = entry2.getKey();
            String nombre = tabla1.get(id1);
            Integer id2 = entry2.getKey();
            Integer num2 = entry2.getValue();
            List<Object> datosCombinados = new ArrayList<>();

            datosCombinados.add(nombre);
            datosCombinados.add(num2);

            rightJoin.put(id2, datosCombinados);
        }
        return rightJoin;
    }

    Map<Integer, List<Object>> fullJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        Map<Integer, List<Object>> fullJoin = new HashMap<>();

        Map<Integer, List<Object>> leftJoinResult = leftJoin(tabla1,tabla2);
        for (Map.Entry<Integer, List<Object>> entryLeft : leftJoinResult.entrySet()){
                fullJoin.put(entryLeft.getKey(), entryLeft.getValue());
        }

        Map<Integer, List<Object>> rightJoinResult = rightJoin(tabla1,tabla2);

        for (Map.Entry<Integer, List<Object>> entryRight : rightJoinResult.entrySet()){
                Integer id2 = entryRight.getKey();
                List<Object> datosCombinados =entryRight.getValue();

                if (!fullJoin.containsKey(id2)){
                    fullJoin.put(id2,datosCombinados);
                }
        }
        return fullJoin;
    }
}
