package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

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
    int a, b;
    
    public RandomInitializer(int a, int b) {
     this.a = a;
     this.b = b;
    }  
    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
  
    @Override
    public void initialize(int[] array) {
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
      for (int i = 0; i < array.length; i++) {
    
          array[i] = (int) (a + ((Math.random()*(b-a))));     // сначало прибавляем 20 тем самым смещается на 20 порядок 
          
//             if( array[i] > a && array[i] <=0){          
//                 array[i] = (int) (Math.random()*array[i]);
//          //       System.out.println(array[i]); 
//            }
//             else if (array[i] < b && array[i] >=0) {
//               array[i] = (int) (Math.random()*array[i]);                
//           //      System.out.println(array[i]); 
        }
    } 
  }

