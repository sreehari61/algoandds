package org.algods;

import org.algods.linkedList.SingleLinkedList;
import org.algods.sorting.BubbleSort;

import java.util.*;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sllist = new SingleLinkedList();

        sllist.insert(2);
        sllist.insert(3);

        sllist.display();
    }
}