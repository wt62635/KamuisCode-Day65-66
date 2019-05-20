package Sort;

import java.util.Arrays;

/**
 * 希尔排序（Shell sort）
 * 也称递增减量排序算法，是插入排序的一种更高效的改进版本。
 * 希尔排序是非稳定排序算法。
 * 工作原理是每一轮按照事先决定的间隔进行插入排序，间隔会依次缩小，最后一次一定要是1。
 * 
 * ※希尔排序属于不稳定排序。
 * @author Kamui
 *
 */
public class ShellSort {
	private static final int num [] =
		{12,23,53,216,56,234,77,46,99,4,76,48,96,65,74,24,51,19,200,100};
	
	public static void sort(int arr[]) {
		int i ;
		int j ;
		int temp ;
		int gap = 1 ;
		int len = arr.length;
		
		while(gap < len / 3) {
			gap = gap * 3 + 1 ;
		}
		for( ; gap > 0 ; gap /= 3 ) {
			for( i = gap ; i < len ; i++ ) {
				temp = arr[i] ;
				for(j = i - gap ; j >= 0 && arr[j] > temp ; j -=gap) {
					arr[j + gap] = arr[j] ;
				}
				arr[j + gap] = temp;
			}
		}
		System.out.println(Arrays.toString(arr) + "希尔排序");
	}
	public static void main(String[] args) {
		sort(num);
	}
}
