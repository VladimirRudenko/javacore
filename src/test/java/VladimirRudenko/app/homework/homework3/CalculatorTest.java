package VladimirRudenko.app.homework.homework3;

import org.junit.Assert;
import org.junit.Test;

import java.lang.*;

import static org.junit.Assert.*;

/**
 * Created by vladimir on 30.01.17.
 */

public class MathTest {
    @Test
    public void max()  {
        Math max = new Math();
        Assert.assertEquals(6, Math.max(6, 5));

    }

}
