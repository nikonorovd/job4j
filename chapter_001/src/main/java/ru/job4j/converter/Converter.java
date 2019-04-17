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
        return value * 70;
    }
    /**
     *Конвертируем рублив доллары.
     *@param value рубли
     *@return Доллары
     */

    public int rubleToDollar(int value){
        return value * 60;
    }
    /**
     *Конвертируем рублив доллары.
     *@param value Евро
     *@return рубли
     */
    public int euroToRuble(int value){
        return value / 70;
    }
    /**
     *Конвертируем рублив доллары.
     *@param value Доллары
     *@return рубли
     */
    public int dollarToRuble(int value){
        return value / 60;
    }

}