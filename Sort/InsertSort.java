package Sort;

import java.util.Arrays;

/**
 * 插入排序（InsertSort）
 * 插入排序是一种简单直观的排序算法。他的工作原理是通过构件有序序列，
 * 对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 
 * @author Kamui
 *
 */
public class InsertSort {
	private static final int num [] =
		{12,23,53,216,56,234,77,46,99,4,76,48,96,65,74,24,51,19,200,100};
	
	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];//由temp取得下标i的数进行比较
			int j = i-1;//使循环的遍历的小标不会超过i
			for ( ; j >= 0 && arr[j] >temp ; j--) {
				//如果前一个下标的数比temp大，则将大于temp的值在数组里往后移动一个下标单位
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp ;
		}
		System.out.println(Arrays.toString(arr) + "插入排序");
	}
	public static void main(String[] args) {
		sort(num);
	}
}
