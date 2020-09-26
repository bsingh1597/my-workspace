package com.ds.practice;

public class TestClass {

	public static void main(String[] args) throws Exception {

		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5 };

		MyLinkedList<Integer> myll = new MyLinkedList<Integer>();

		for (Integer i : arr) {

			myll.addLast(i);
		}

		for (int i = 0; i < myll.size(); i++) {

			System.out.print(myll.findAtIdx(i) + " ");
		}

		myll.add(0, 24);

		System.out.println("After adding 24 at 0th place");

		for (int i = 0; i < myll.size(); i++) {

			System.out.print(myll.findAtIdx(i) + " ");
		}

	}

}
