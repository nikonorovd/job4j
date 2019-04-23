package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class  MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(5, 10);
        assertThat(result, is(5));
    }
    @Test
    public void whenFirstMax(){
        Max maxa = new Max();
        int result = maxa.max(6, 4);
        assertThat(result, is(6));
    }

    @Test
    public void whenFirstAndSecondAreEqual(){
        Max max = new Max();
        int result =max.max(2,2);
        assertThat(result, is(2));

    }

}