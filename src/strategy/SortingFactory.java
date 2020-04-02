package strategy;
/**
 * Tehdas luo parametrin avulla algoritmin
 * @author Samu Rinne
 *
 */
public class SortingFactory {

	
	public SortingFactory(){}
	
	public ISorting getAlgorithm(String a) {
		ISorting algorithm;
		if (a.equals("selection")) {
			algorithm = new SelectionSort();
		}else if(a.equals("merge")) {
			algorithm = new MergeSort();
		}else {
			algorithm = new QuickSort();
		}
		return algorithm;
	}
}
