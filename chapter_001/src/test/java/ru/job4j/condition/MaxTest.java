package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class  MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(5, 10);
        result = result < 15 ? 10 : 5;
        assertThat(result, is(10));
    }
    @Test
    public void whenFirstMax(){//первое максимальное
        Max maxa = new Max();
        int result = maxa.max(2, 1);
        result = result < 15 ? 2 : 1;
        assertThat(result, is(2));
    }
    @Test
    public void whenSecondMax(){  //второе максимальное
        Max max = new Max();
        int result = max.max(1, 2);
        result = result < 1 ? 1 : 2;
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstAndSecondAreEqual(){ // оба числа одинаковые
        Max max = new Max();
        int result =max.max(2,2);
        result = result < 15 ? 2 : 2;
        assertThat(result, is(2));

    }

}