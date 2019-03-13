package ru.job4j.calculate;
/** Класс для вычисления арифметических операций + - / * .
* @author Nikonorov.
* @since 08.03.2019.
* @version 1.
*/ 

public class Calculate {
	/** метод echo.
	* @param value value.
	*/
    public String echo(String value) {
		
        return String.format("%s %s %s", value, value, value);
    }


/** @param args - args
* calc - новый объект метода main.
*/

    public static void main(String[] args) {
	Calculate calc = new Calculate();
    System.out.println(calc.echo("aah"));
    }

}
