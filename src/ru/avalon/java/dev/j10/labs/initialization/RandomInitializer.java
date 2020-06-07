package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;
import java.util.Random;
/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    

    public void initialize(int[] array) {
        
     Random random = new Random();


        for (int i = 0; i < array.length; i++) {

            array[i] = (random.nextInt(100) -50);
        }
    }
}
     /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
/*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */