package sort;

/**
 *
 */
public class InsertionSort implements ISort {
    @Override
    public int[] sort(int[] list) {
        int length = list.length;
        for (int i = 1; i < length; i++) {
            int selectValue = list[i];
            int index = i - 1;
            for (; index > 0; index--) {
                if (selectValue < list[index]) {
                    list[index] = list[index - 1];
                } else {
                    break;
                }
            }
            list[index] = selectValue;
        }
        return list;
    }
}
