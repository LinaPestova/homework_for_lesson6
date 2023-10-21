package ru.pestovaalina;

public class Main {
    public static void main(String[] args) {
        byte aByte = 127;
        byte xByte = 9;
        byte yByte = 115;
        short aShort = 200;
        int aInt = 300;
        long aLong = 400;
        float aFloat = 1.2f;
        double aDouble = 1.32;

        boolean aBoolean = true;
        boolean bBoolean = false;

        //Операторы арифметики
        System.out.println(aByte + aShort);
        System.out.println(aShort - aInt);
        System.out.println(aLong * aFloat);
        System.out.println(aInt / aDouble);
        System.out.println(yByte % xByte);

        //Логические операции
        System.out.println("aBoolean && bBoolean = " + (aBoolean && bBoolean));
        System.out.println("aBoolean || bBoolean = " + (aBoolean || bBoolean));
        System.out.println("!(aBoolean && bBoolean) = " + !(aBoolean && bBoolean));

        //Операции переполнения
        System.out.println(aByte + xByte); //в ответе будет тип данных short
    }
}
