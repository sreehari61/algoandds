package org.example;

import sorting.BubbleSort;
import sorting.ISort;
import sorting.SelectionSort;

import java.io.*;
import java.util.*;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(64);
        data.add(25);
        data.add(12);
        data.add(22);
        data.add(11);
        data.add(111);
        System.out.println(data);

        ArrayList<Integer> sortedArray = sort.sort(data);
        sort.printArray();

    }
}