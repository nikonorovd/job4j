package ru.job4j.converter;

/**
 * Конвертер валюты.
 */

public class Converter {
    /**
     * *Конвертируем рубли в евро
     * @param value рубли
     * @return Евро
     */
    public int rubleToEuro(int value){
        int a1=1;
        int b1=70*a1;
        int c1 = b1;
        return c1;
    }
    /**
     *Конвертируем рублив доллары.
     *@param value рубли
     *@return Доллары
     */

    public int rubleToDollar(int value){
        int a2=1;
        int b2=60*a2;
        int c1 = b2;
        return c1;
    }
    /**
     *Конвертируем рублив доллары.
     *@param value Евро
     *@return рубли
     */
    public int euroToRuble(int value){
        int a3=1;
        int b3=70;
        int c3 = b3/70*a3;
        int c1 =c3;
        return c1;
    }
    /**
     *Конвертируем рублив доллары.
     *@param value Доллары
     *@return рубли
     */
    public int dollarToRuble(int value){
        int a4=1;
        int b4=60;
        int c4 = b4/60*a4;
        int c1 = c4;
        return c1;
    }

}