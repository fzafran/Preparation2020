package com.project;

import com.project.sorters.impl.BubbleSort;
import com.project.sorters.impl.InsertionSort;
import com.project.sorters.impl.SelectionSort;

public class SorterWrapper {

    public static final String SELECTION_SORT = "SelectionSort";
    public static final String Bubble_Sort = "BubbleSort";
    public static final String Insertion_Sort = "InsertionSort";


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
           case Bubble_Sort:
               BubbleSort bubbleSort = new BubbleSort();
               return bubbleSort.sort(arrayToSort);

            case Insertion_Sort :
                InsertionSort insertionSort = new InsertionSort();
                return insertionSort.sort(arrayToSort);
            //
            default:
                return arrayToSort;
        }
    }




}
