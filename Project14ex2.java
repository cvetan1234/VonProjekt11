package smg_5;

public class Project14ex2 {

	public static void main(String[] args) {

		int n = 50000;
		int[] arrBubble = new int[n];
		int[] arrMerge = new int[n];
		int[] arrSelection = new int[n];
		int[] arrQuick = new int[n];

		for(int i = 0; i < n; i++) {
			int element = (int) (Math.random()*1000);
			arrBubble[i] = element;
			arrMerge[i] = element;
			arrSelection[i] = element;
			arrQuick[i] = element;

		}
		
		long timeBubble = 0, timeSelection = 0, timeMerge = 0, timeQuick = 0;
		
		long currentTime = System.currentTimeMillis();
		BubbleSort.bubbleSort(arrBubble);
		timeBubble = System.currentTimeMillis() - currentTime;
		
		currentTime = System.currentTimeMillis();
		SelectionSort.selectionSort(arrSelection);
		timeSelection = System.currentTimeMillis() - currentTime;
		
		currentTime = System.currentTimeMillis();
		MergeSort.mergeSort(arrMerge);
		timeMerge = System.currentTimeMillis() - currentTime;
		
		currentTime = System.currentTimeMillis();
		QuickSort.quickSort(arrQuick);
		timeQuick = System.currentTimeMillis() - currentTime;
		
		System.out.println("Array Size: " + n);
		System.out.println("Bubble sort: " + timeBubble);
		System.out.println("Merge sort: " + timeMerge);
		System.out.println("Selection sort: " + timeSelection);
		System.out.println("Quick sort: " + timeQuick);
	}

}