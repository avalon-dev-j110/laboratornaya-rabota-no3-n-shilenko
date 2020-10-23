package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.InsertionSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        int[] array = new int[20];
		FibonacciInitializer fibonacciInitializer = new FibonacciInitializer();
		fibonacciInitializer.initialize(array);
		System.out.println("The first 20 elements of the Fibonacci number sequence");
		System.out.println(Arrays.toString(array));
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		System.out.println("The sum of the first 20 elements of the Fibonacci number sequence: " + sum);
		System.out.println();

		System.out.println("Bubble sort");
		RandomInitializer randomInitializer = new RandomInitializer(-50, 50);
		randomInitializer.initialize(array);
		System.out.println(Arrays.toString(array));
		BubbleSort bubbleSort = new BubbleSort();
		long startTime = System.nanoTime();
		bubbleSort.sort(array);
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println(Arrays.toString(array));
		System.out.println("Estimated Time: " + estimatedTime + " ns");
		System.out.println();

		System.out.println("Selection sort");
		randomInitializer.initialize(array);
		System.out.println(Arrays.toString(array));
		SelectionSort selectionSort = new SelectionSort();
		startTime = System.nanoTime();
		selectionSort.sort(array);
		estimatedTime = System.nanoTime() - startTime;
		System.out.println(Arrays.toString(array));
		System.out.println("Estimated Time: " + estimatedTime + " ns");
		System.out.println();

		System.out.println("Insertion sort");
		randomInitializer.initialize(array);
		System.out.println(Arrays.toString(array));
		InsertionSort insertionSort = new InsertionSort();
		startTime = System.nanoTime();
		insertionSort.sort(array);
		estimatedTime = System.nanoTime() - startTime;
		System.out.println(Arrays.toString(array));
		System.out.println("Estimated Time: " + estimatedTime + " ns");
		System.out.println();

		System.out.println("Shell sort");
		randomInitializer.initialize(array);
		System.out.println(Arrays.toString(array));
		ShellSort shellSort = new ShellSort();
		startTime = System.nanoTime();
		shellSort.sort(array);
		estimatedTime = System.nanoTime() - startTime;
		System.out.println(Arrays.toString(array));
		System.out.println("Estimated Time: " + estimatedTime + " ns");
		System.out.println();
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
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
    }
}
