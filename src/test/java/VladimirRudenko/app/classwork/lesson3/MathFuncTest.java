package VladimirRudenko.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vladimir on 23.01.17.
 */
public class MathFuncTest {

    @Test
    public void add(){
         MathFunc mathFunc = new MathFunc();

         Assert.assertEquals(6, mathFunc.add());


     }
}
