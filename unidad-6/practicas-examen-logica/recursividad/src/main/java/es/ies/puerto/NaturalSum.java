package es.ies.puerto;

public class NaturalSum {

    public int naturalSumTrad(int limit){
        int sum =0;
        for (int i = 1; i <= limit; i++){
            sum += i;
        }
        return sum;
    }

    public int naturalSumRecursive(int limit){
        if (limit <= 1){
            return limit;
        }

        return limit + naturalSumRecursive(--limit);
    }
}
