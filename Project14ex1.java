package smg_5;

import java.util.*;
import smg_3.*;


public class Project14ex1 {
	/**
	public static <E extends Comparable<E>> void mergeSort(E[] list) {
		if (list.length > 1) {
// Merge sort the first half //1 5 3 2 6 7
			E[] firstHalf = (E[]) new Comparable[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);
// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			E[] secondHalf = (E[]) new Comparable[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
// Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, list);
		}
	}
	
	public static <E extends Comparable<E>> void merge(E[] list1, E[] list2, E[] temp) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1].compareTo(list2[current2]) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}
	*/
	public static <E> void mergeSort(E[] list, Comparator<E> comparator) {
		if (list.length > 1) {
// Merge sort the first half //1 5 3 2 6 7
			E[] firstHalf = (E[]) new Comparable[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf, comparator);
// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			E[] secondHalf = (E[]) new Comparable[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf, comparator);
// Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, list, comparator);
		}
	}
	
	public static <E> void merge(E[] list1, E[] list2, E[] temp, Comparator<E> comparator) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (comparator.compare(list1[current1], list2[current2]) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}
	
	public static void main(String[] args) {
		Circle[] list = { new Circle(2), new Circle(3), new Circle(2), new Circle(1) };
				//2, 3, 2, 5, 6, 1, -2, 3, 14, 12
		//Integer[] list = { new Integer(2), new Integer(3), new Integer(2), new Integer(1), new Integer(15), new Integer(7), new Integer(8), new Integer(5) };
		//mergeSort(list);
		mergeSort(list, new CircleComparator());
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
	
}
