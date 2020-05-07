package com.project.sorters.impl;

import com.project.sorters.Sorter;
import com.project.sorters.SorterBase;

public class SelectionSort extends SorterBase implements Sorter {

    @Override
    public int[] sort(int[] arrayToSort) {
        System.out.println("entered in selection sort");
        return arrayToSort;
    }

    @Override
    public String getDisclaimer() {
        return "Selection sort specific disclaimer";
    }
}
