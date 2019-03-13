package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void whenEcho() {
    Calculate calculate = new Calculate();
        String hello = calculate.echo("Hello");
        assertThat(hello, is("Hello Hello Hello"));
    }
}