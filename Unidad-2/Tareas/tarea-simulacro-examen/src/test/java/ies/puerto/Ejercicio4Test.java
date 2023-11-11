package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4;
    String owner = "Nabil";
    double salary = 1230;
    @BeforeEach
    public void beforeEach (){
        ejercicio4 = new Ejercicio4(owner, salary);
    }

    @Test
     public void constructorTestOK(){
        Assertions.assertEquals(owner, ejercicio4.getOwner(), "Expected result not found.");
        Assertions.assertEquals(salary, ejercicio4.getSalary(), "Expected result not found.");
    }

    @Test
    public void setGetOwnerTestOK(){
        String anotherOwner = "Claus";
        ejercicio4.setOwner(anotherOwner);
        Assertions.assertEquals(anotherOwner, ejercicio4.getOwner(), "Expected result not found.");
    }
    @Test
    public void setGetSalaryTestOK(){
        double anotherSalary = 5000;
        ejercicio4.setSalary(anotherSalary);
        Assertions.assertEquals(anotherSalary, ejercicio4.getSalary(), "Expected result not found.");
    }
    @Test
    public void depositMoneyTestOK(){
        double money = 135.47;
        double resultOK = 1365.47;
        Assertions.assertEquals(resultOK, ejercicio4.depositMoney(money),"Expected result not found.");
    }
    @Test
    public void withdrawMoneyTestOK(){
        double money = 135.47;
        double resultOK = 1094.53;
        Assertions.assertEquals(resultOK, ejercicio4.withdrawMoney(money),"Expected result not found.");
    }
    @Test
    public void showInformationTestOK(){
        String resultOK = "Owner:" + owner + ", Salary:" + salary;
        Assertions.assertEquals(resultOK, ejercicio4.showInformation(),"Expected result not found.");
    }

}
