package ies.puerto.abstrac;

import java.util.List;

public abstract class IntegerArrayListAbstrac {
        public List<Integer> addIntegerNumbers(List<Integer> myIntegerList){
                for (int i=1; i <= 10; i++){
                        if (i % 2 == 0){
                                myIntegerList.add(i);
                        }
                }
                return myIntegerList;
        }
}
