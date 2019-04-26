package sort;

import java.util.Arrays;

public class SortMain {

    public static void main(String[] args) {
        int[] list = {4, 1, 3, 9, 6, 8};
        SortMain sortMain = new SortMain();
        System.out.println("begin list = " + Arrays.toString(list));
        int[] afterSort = sortMain.sort(new InsertionSort(), list);
        System.out.println("after sort list = " + Arrays.toString(afterSort));
    }

    private int[] sort(ISort iSort, int[] list) {
        return iSort.sort(list);
    }
}
