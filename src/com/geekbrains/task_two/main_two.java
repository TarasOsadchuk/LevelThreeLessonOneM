package com.geekbrains.task_two;

import java.util.ArrayList;
import java.util.Arrays;

public class main_two {

    /**
     * Написать метод, который преобразует массив в ArrayList;
     */

    public static void main(String[] args) {

        String[] arr_string = {"privet", "ok", "how are you?"};

        ArrayList<String> arrList = method_task_two(arr_string);

        System.out.println(arrList);
    }

    public static <T> ArrayList<T> method_task_two(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
