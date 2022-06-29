package com.cg.assignments;

public class Assignment8 {
	public static void main(String[] args) {

		sortArray();
	}

	static void sortArray() {
		int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		for (int j = 1; j < arr.length; j++) {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i - 1] > arr[i]) {
					int temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}