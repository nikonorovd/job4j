package ru.job4j.calculate;

/**
 *
 */

public class Calculate {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println(calculate.echo("Hello World"));
    }

    public String echo(String name) {
        return String.format("%s %s %s", name, name, name);
    }
}
