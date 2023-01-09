package org.redbasic.sam1;

import java.util.Random;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 10;
		}

		callArray(arr);

		Random name = new Random();
		

		System.out.println("hello world");
	}

	private static void callArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
