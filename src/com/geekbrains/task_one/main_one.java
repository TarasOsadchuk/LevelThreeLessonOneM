package com.geekbrains.task_one;

import java.util.Arrays;

public class main_one {

    /**
     * Написать метод, который меняет два элемента массива местами (массив может быть любого
     * ссылочного типа);
     */

    public static void main(String[] args) {

        String[] arr_string = {"privet", "ok", "how are you?"};
        Integer[] arr_int = {1, 2, 3};

        System.out.println(Arrays.toString(arr_string));
        System.out.println(Arrays.toString(arr_int));

        method_change(arr_string, 0, 3);
        method_change(arr_int, 1, 2);

        System.out.println(Arrays.toString(arr_string));
        System.out.println(Arrays.toString(arr_int));
    }

    public static <T> void method_change(T[] array, int one, int two) {
        T arr_any = array[one];
        array[one] = array[two];
        array[two] = arr_any;
    }
}

