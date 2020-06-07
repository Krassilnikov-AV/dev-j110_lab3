package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20]; 
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
           // инициализация массива значениями последовательности чисел Фибоначчи
            FibonacciInitializer fibNum = new FibonacciInitializer();
            fibNum.initialize(array);
            printArray("fibonachi", array);
            
          // сумма эл-ов массива
              int sum = 0;
          for(int arr : array) {
              sum = sum + arr;        
          }
          System.out.println(sum);
        /** _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
         * инициализация массива последовательностью от -50 до 50
         * *_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
         * */
          RandomInitializer ranNum = new RandomInitializer(-50, 50);
          ranNum.initialize(array);
          printArray("array", array);
     /**_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
     * сортировка пузырьком
     * _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- 
     */
     BubbleSort bubSort = new BubbleSort();
     bubSort.sort(array);
     printArray("bubble", array);
     /**_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
     *инициализация массива последовательностью от -50 до 50
     * _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- 
     */
    RandomInitializer ranNum1 = new RandomInitializer(-50, 50);
          ranNum1.initialize(array);
          printArray("array", array);
    /**_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
     *сортировка выбором 
     * _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- 
     */
    SelectionSort selNum = new SelectionSort();
    selNum.sort(array);
    printArray("selection", array);
    /**_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
     *инициализация массива последовательностью от -50 до 50
     * _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- 
     */
    RandomInitializer ranNum2 = new RandomInitializer(-50, 50);
          ranNum2.initialize(array);
          printArray("array", array);
    /**_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
     *сортировка Шелла
     * _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- 
     */
    ShellSort shellSort = new ShellSort();
          shellSort.sort(array);
          printArray("shell", array);
    }
    
    
    private static void printArray(String header, int[] array) {
        System.out.println(header);
        Arrays.stream(array).forEach(val -> System.out.print(val + " "));
        System.out.println();
    }
}
