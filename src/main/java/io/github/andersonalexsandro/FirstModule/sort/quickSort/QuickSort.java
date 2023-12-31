package io.github.andersonalexsandro.FirstModule.sort.quickSort;

public class QuickSort {
    Integer[] numbersToSort;

    public QuickSort(Integer[] numbersToSort) {
        this.numbersToSort = numbersToSort;
    }

    public void sort(){
        quickSort(numbersToSort, 0, numbersToSort.length-1);
        printArray(numbersToSort);
    }

    private void quickSort(Integer[] numbersToSort, int beginning, int ending){
        if(beginning < ending){
            int pivot = partition(numbersToSort, beginning, ending);
            quickSort(numbersToSort, beginning, pivot-1);
            quickSort(numbersToSort, pivot+1, ending);
        }
    }

    private int partition(Integer[] numbersToSort, int beginning, int ending){
        int pivot = numbersToSort[ending];
        int i = beginning;
        for(int j = beginning; j < ending; j++){
            if(numbersToSort[j] <= pivot){
                swap(numbersToSort, i, j);
                i++;
            }
        }
        swap(numbersToSort, i, ending);
        return i;
    }

    private void swap(Integer[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void printArray(Integer[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
