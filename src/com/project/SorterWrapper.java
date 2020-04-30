package com.project;

import com.project.sorters.impl.BubbleSort;
import com.project.sorters.impl.SelectionSort;

public class SorterWrapper {

    public static final String SELECTION_SORT = "SelectionSort";
    public static final String BUBBLE_SORT = "BubbleSort";

    private String sortingMethod;

    public String getSortingMethod() {
        return sortingMethod;
    }

    public void setSortingMethod(String sortingMethod) {
        this.sortingMethod = sortingMethod;
    }

    public int[] sort(int[] arrayToSort) {
        switch (this.sortingMethod) {
            case SELECTION_SORT :
                SelectionSort selectionSort = new SelectionSort();
                return selectionSort.sort(arrayToSort);
            case BUBBLE_SORT :
                BubbleSort bubbleSort = new BubbleSort();
                return bubbleSort.sort(arrayToSort);
            default:
                return arrayToSort;
        }
    }
}
