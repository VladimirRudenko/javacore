package VladimirRudenko.runners;

import VladimirRudenko.app.utils.convertors.PrimitiveConvertor;
public class Lesson3Runner {
    public static void main (String args[])
    {
        PrimitiveConvertor castingFloatToChar = new PrimitiveConvertor();
        castingFloatToChar.floatToChar();


        castingFloatToChar.intToChar();


        castingFloatToChar.charToInt();
    }
}
