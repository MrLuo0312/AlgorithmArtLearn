package sort;

/**
 * 冒泡排序：顾名思义，就是单独的先对一个数字进行依次的比较，把这个数组中最小的/最大的先排好(冒泡到最后/前)，这样一来，经过N次循环，数组
 *      中的数据都会按顺序排好
 */

/**
 *  性能比较：
 *      最好情况：O(n)，当数组本身是，1，2，3，4，5，6这种已经排序好了的情况下，flag会检测到数据没的任何变化，而外层的循环还要执行N次
 *      最坏情况：O(n*n) 当数组本身是，6，5，4，3，2，1时，无论怎样，外层for也要执行N次，而内层，执行多少遍取决于flag，
 *          当每次冒泡都有逆数的时候，内层执行次数跟外层是一样的也为N，故时间复杂度为O(N*N)
 *      稳定性：稳定的，
 */

public class BubbleSort implements ISort {
    @Override
    public int[] sort(int[] list) {
        int length = list.length;
        for (int i = 0; i < length; i++) {  // 里面的比较要循环i次，可以理解为，第一层for里面的代码，每一次循环，都会有一个最大的数冒泡到数组最后
            boolean flag = false;           // 每一次缩小数据范围后，记录数据是否有逆序度，如果1，有则进行排序
            for (int j = 0; j < length - 1 - i; j++) {  // 相隔的两个数两两比较，按冒泡的方向调换位置 ，每循环一次，最大的数都已经排到最后，故下次循环，可以不用比较那个数了（-i）
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;              // 如果没有2，说明逆序对为0 ，所有数都已经排序好。
        }
        return list;
    }
}
