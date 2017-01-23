package VladimirRudenko.app.utils.runners;

import VladimirRudenko.app.utils.convertors.PrimitiveConvertor;
public class Lesson3Runner {
    public static void main (String args[])
    {
        PrimitiveConvertor castingFloatToChar = new PrimitiveConvertor();
        castingFloatToChar.floatToChar();

        PrimitiveConvertor castingIntToChar = new PrimitiveConvertor();
        castingIntToChar.intToChar();

        PrimitiveConvertor castingCharToInt = new PrimitiveConvertor();
        castingCharToInt.charToInt();
    }
}
