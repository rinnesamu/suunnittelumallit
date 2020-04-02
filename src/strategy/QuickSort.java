package strategy;

public class QuickSort implements ISorting {

	@Override
	public int[] sort(int[] unsorted) {
		quickSort(unsorted, 0, unsorted.length-1);
		return unsorted;
	}

	private void quickSort(int table[], int lo0, int hi0) {
		int lo = lo0;
		int hi = hi0;
		int mid, swap;

		mid = table[(lo0 + hi0) / 2];
		while (lo <= hi) {
			while (table[lo] < mid) {
				++lo;
			}

			while (table[hi] > mid) {
				--hi;
			}

			if (lo <= hi) {
				swap = table[lo];
				table[lo] = table[hi];
				++lo;
				table[hi] = swap;
				--hi;
			}
		}

		if (lo0 < hi) {
			quickSort(table, lo0, hi);
		}
		if (lo < hi0) {
			quickSort(table, lo, hi0);
		}
	}

}
