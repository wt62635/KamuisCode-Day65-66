package Sort;

import java.util.Arrays;

/**
 * 快速排序(Quick Sort)
 * 又称划分交叉排序，简称快排。基于分治的思想，是冒泡排序的改进型。
 * 工作原理：首先在数组中选择一个基准点（该基准点的选取可能影响快速排序的效率），
 * 然后分别从数组的两端扫描数组，设两个指示标志（low指向起始位置，high指向末尾)，
 * 首先从后半部分开始，如果发现有元素比该基准点的值小，就交换low和high位置的值，
 * 然后从前半部分开始扫秒，发现有元素大于基准点的值，就交换low和high位置的值，
 * 如此往复循环，直到low>=high,然后把基准点的值放到high这个位置。
 * 一次排序就完成了。然后采用递归的方式分别对前半部分和后半部分排序，
 * 当前半部分和后半部分均有序时该数组就自然有序了。
 * 
 * ※快速排序是目前已知的排序算法中最快之一。
 * @author Kamui
 *
 */
public class QuickSort {
	private static final int num [] =
		{12,23,53,216,56,234,77,46,99,4,76,48,96,65,74,24,51,19,200,100};
	
	public  static void sort(int arr[]) {
		//分别指定数组的第一个下标和最后一个下标为基准low和high
		recursion(arr , 0 , arr.length - 1);
		System.out.println(Arrays.toString(arr) + "快速排序");
	}
	
	/*
	 * 第二次排序-递归分组排序
	 */
	private static void recursion(int arr[] , int low , int high) {
		if(low < high) {
			int middle = getMiddle(arr, low , high);//将数组进行一分为二
			recursion(arr , low , middle - 1);//对低值组进行递归排序
			recursion(arr , middle + 1 , high);//对高值组进行递归排序
		}
	}
	
	/*
	 * 第一次排序-位置交换排序
	 */
	private static int getMiddle(int arr[] , int low , int high) {
		int tmp = arr[low];//指定low下标所指数值为参照值temp
		while(low < high) {
			/*
			 * 实现low和high的位置交换
			 */
			while(low < high &&arr[high] >= tmp) {
				high-- ;//比temp指值大时，high基准的下标往前移
			}
			arr[low] = arr[high];//将比当前low更小的数值附过去
			
			while(low <high && arr[low] <= tmp) {
				low++;//比temp指值小时，low基准的下标往后移
			}
			arr[high] = arr[low];//将比当前high更大的数值附过去
			
		}
		arr[low] = tmp ;//最后将参照值放入low的位置，第一次排序结束
		return low ;//返回参照值的下标位置参数
	}
	
	
	public static void main(String[] args) {
		sort(num);
	}
}
