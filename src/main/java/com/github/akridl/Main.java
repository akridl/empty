package com.github.akridl;

import org.apache.commons.lang3.math.NumberUtils;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, -1, 4, 1, 42, 5, 9};
        int maxNumber = NumberUtils.max(array);

        System.out.println("Max number is: " + maxNumber);
    }
}
