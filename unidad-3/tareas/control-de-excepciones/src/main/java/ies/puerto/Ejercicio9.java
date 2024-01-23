package ies.puerto;

public class Ejercicio9 {

    public static void main(String[] args) throws MyException {
        boolean condition = true;
        conditionsMethod(condition);
    }

    /**
     * Function that
     * @param condition
     * @throws MyException
     */
    public static void conditionsMethod (boolean condition) throws MyException {
        if (condition){
           // throw new MyException("MyException shows a message.");
            throw new MyException(1, "MyException shows a message.");
        }
    }
}
