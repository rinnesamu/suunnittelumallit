package strategy;

public class SelectionSort implements ISorting {

	@Override
	public int[] sort(int[] unsorted) {
		int min, temp;
		for (int i = 0; i < unsorted.length; i++) {
			min = i;
			for (int j = i + 1; j < unsorted.length; j++) {
				if (unsorted[j] < unsorted[min]) {
					min = j;
				}
			}
			if (min != i) {
				temp = unsorted[min];
				unsorted[min] = unsorted[i];
				unsorted[i] = temp;
			}
		}
		return unsorted;
	}

}
