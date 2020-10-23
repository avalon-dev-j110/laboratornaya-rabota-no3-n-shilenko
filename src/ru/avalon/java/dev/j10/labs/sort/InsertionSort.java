package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/*
  @author Nikolai Shilenko
 */
/**
 * Сортировка вставками (англ. insertion sort).
 * <p> алгоритм сортировки,
 * в котором элементы входной последовательности просматриваются по одному,
 * и каждый новый поступивший элемент размещается в подходящее место среди ранее упорядоченных элементов.
 * Вычислительная сложность — O(n^2).
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%B2%D1%81%D1%82%D0%B0%D0%B2%D0%BA%D0%B0%D0%BC%D0%B8">Сортировка вставками</a>
 */
public class InsertionSort implements Sort {

    @Override
    public void sort(int[] array) {
        int outer, inner, temp;
        for (outer = 1; outer < array.length; outer++) {
            temp = array[outer];
            inner = outer;
            while (inner > 0 && array[inner - 1] >= temp) {
                array[inner] = array[inner - 1];
                --inner;
            }
            array[inner] = temp;
        }
    }
}
