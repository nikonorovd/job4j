package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static sun.nio.cs.Surrogate.is;

public class MultiMaxTest {
    @Test
    public  void whenSecondMax (){
        MultiMax check = new MultiMax();
        int result = check.max(1,4,2);
//        assertThat(result, is(4));
    }
}
