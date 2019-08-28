package com.chunqiu.basic.sort;

/**
 * 
* @ClassName: Sort
* @Description: 排序算法测试类
* @author Administrator
* @date 2019年8月27日
*
 */
public class Sort {

	public static void main(String[] args) {
		int [] arr  = {45,8,7,24,18};
		popSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}
	
	/**
	 * 
	* @Title: popSort
	* @Description: 冒泡排序
	* @param     排序数组
	* @return void    null
	* @throws
	 */
	public static void popSort(int [] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {//声明比较的轮数
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j +1]) {
					int tmp = arr [j + 1];
					arr[j + 1]= arr [j];
					arr[j]= tmp;
					
				}
			}
		}
	}
	
	/**
	 * 
	 * @Title: select
	 * @Description:选择排序
	 * @param     排序数组
	 * @return void    null
	 * @throws
	 */
	public static void selectSort(int [] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {//声明比较的轮数
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j +1]) {
					int tmp = arr [j + 1];
					arr[j + 1]= arr [j];
					arr[j]= tmp;
				}
			}
		}
	}
}
