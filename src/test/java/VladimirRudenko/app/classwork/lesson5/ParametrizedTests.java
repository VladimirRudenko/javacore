package VladimirRudenko.app.classwork.lesson5;

import VladimirRudenko.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by vladimir on 30.01.17.
 */
/*@RunWith(JUnitParamsRunner.class)
public class ParametrizedTests {
    MathFunc mathFunc;

    @Before
    public void setUp(){
        mathFunc = new MathFunc();
    }

    @Test
    @FileParameters(value = "src/test/resources/multiplyData.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expected){
        Assert.assertEquals(expected, MathFunc.multiply());
    }

}*/
