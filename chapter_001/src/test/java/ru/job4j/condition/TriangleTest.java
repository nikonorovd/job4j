package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea(){
        //Создаем объект "Треугольник"
        Triangle triangle = new Triangle();
        //вычисляем площадь
        double result = triangle.area(0,0,0,1,0,0);
        //Задаем ожидаемый результат
        double expected = 2D;
        //Проверяем результат и ожидаемое значение
        assertThat (result, closeTo(expected, 0.1));
    }
}
