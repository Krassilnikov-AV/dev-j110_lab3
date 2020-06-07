package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка выбором (англ. selection sort).
 *
 * <p>Алгоритм сортировки. Может быть как устойчивый, так и
 * неустойчивый. На массиве из n элементов имеет время
 * выполнения в худшем, среднем и лучшем случае Θ(n2),
 * предполагая что сравнения делаются за постоянное время.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%BE%D0%BC">Сортировка выбором</a>
 */
public class SelectionSort implements Sort {

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса SelectionSort
         */
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний, 
      2-последний,...)*/
    for (int i = 0; i < array.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
        int min = array[i];
        int min_i = i; 
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
        for (int j = i+1; j < array.length; j++) {
            //Если находим, запоминаем его индекс
            if (array[j] < min) {
                min = array[j];
                min_i = j;
            }
        }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
        if (i != min_i) {
            int tmp = array[i];
            array[i] = array[min_i];
            array[min_i] = tmp;
        }
      }
    }
}
