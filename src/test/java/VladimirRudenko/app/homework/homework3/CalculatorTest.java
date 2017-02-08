package VladimirRudenko.app.homework.homework3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vladimir on 30.01.17.
 */

public class CalculatorTest {
    @Test
    public void max() {
        Calculator a = new Calculator();
        double res = a.max(4,6);
        if (res!=6) Assert.fail();
    }

    }

    @Test
    public void increment() {
        Calculator a = new Calculator();
        int res = a.increment(4);
        if (res!=5) Assert.fail();

    }

    @Test
    public void decrement()  {
        public void increment() {
            Calculator a = new Calculator();
            int res = a.decrement(4);
            if (res!=3) Assert.fail();
        }

    @Test
    public void copySign(){
        Calculator a = new Calculator();
        float res = a.copySign(9.9f, -5.5f);
        if (res!= -9.9) Assert.fail();

    }

    @Test
    public void sin() {
        Calculator a = new Calculator();
        double res = a.sin(0);
        if(res!=0) Assert.fail();
    }

    @Test
    public void abs() {
        Calculator a = new Calculator();
        double res = a.abs(-3);
        if (res!=3) Assert.fail();
    }

    @Test
    public void rint() {
        Calculator a = new Calculator();
        double res = a.rint(3.4);
        if (res!=3) Assert.fail();
    }

    @Test
    public void pow() {
        Calculator a = new Calculator();
        double res = a.pow(2,3);
        if(res!=8) Assert.fail();
    }

    @Test
    public void sqrt() {
        Calculator a = new Calculator();
        double res = a.sqrt(7);
        if(res!=49) Assert.fail();
    }
  /*  @Test
    public void max() {
        Calculator a = new Calculator();
        float res = a.max(7,4);
        if (res!=7) Assert.fail();
    }*/

    @Test
    public void del() {
        Calculator a = new Calculator();
        double res = a.del(7,7);
        Assert.assertTrue(res ==1);
    }

    @Test
    public void mult() {
        Calculator a = new Calculator();
        double res = a.mult(7,7);
       // if (res!=49) Assert.fail();
        Assert.assertEquals(49, res, 0.2);
    }

    @Test
    public void deduct() {
        Calculator b = new Calculator();
        double res = b.deduct(3,7);
        if (res!=-4) Assert.fail();
    }

    @Test
    public void add() {
        Calculator a = new Calculator();
        double res = a.add(3,7);
        if (res!=10) Assert.fail();

        //Assert.assertEquals(res, 10);
    }

    }



