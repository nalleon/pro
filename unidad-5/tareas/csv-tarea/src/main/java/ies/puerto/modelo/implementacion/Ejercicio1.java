package ies.puerto.modelo.implementacion;

public class Ejercicio1 {

    private int rows;
    private int columns;

    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1(1,5);
        ejercicio1.printTriangle();
    }

    /**
     * Constructors of the class
     */

    public Ejercicio1(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    /**
     * Getters and setters
     */
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void printTriangle (){
        int row= 1;
        while (row <= getRows()){
            printNum();
            printSpaces();
            System.out.println();
            row++;
        }
    }


    public  void printSpaces (){
        int space = 1;
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
    }
    public void printNum (){
        for (int num=1; num <= 2*getRows()-1; num++){
            System.out.print("1");
        }
    }
}
