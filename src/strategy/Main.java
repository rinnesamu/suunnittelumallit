package strategy;

import java.util.Random;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ISorting s;
		SortingFactory factory = new SortingFactory();
		final int n = 100000;
		int[] unsorted = new int[n];
        int i;
        Random r = new Random(); 
        System.out.println("Generoidaan syöttöaineisto: ");
        for (i=0;i<n;i++) {

            unsorted[i] = r.nextInt(1000);
            System.out.print(unsorted[i]+" ");
            if (i>0 && i%40==0)
                System.out.println();
        }
        System.out.println();
        System.out.println("Which sorrting algorithm you want to use?");
        System.out.println("Type 1 if you want quicksort (default)");
        System.out.println("Type 2 if you want selectionsort");
        System.out.println("Type 3 if you want mergesort");
        String ans = scanner.nextLine();
        switch(ans) {
        case "1":
        	s = factory.getAlgorithm("quick");
        	break;
        case "2":
        	s = factory.getAlgorithm("selection");
        	break;
        case "3":
        	s = factory.getAlgorithm("merge");
        	break;
        default:
        	s = factory.getAlgorithm("default");
        }
        long start = System.nanoTime();
        int[] sorted = s.sort(unsorted);
        long end = System.nanoTime();
        System.out.println();
        for (i=0;i<n;i++) {
            System.out.print(sorted[i]+" ");
            if (i>0 && i%40==0)
                System.out.println();
        }
        long time = (end-start)/1000000;
        System.out.println("\nRunning time: " + time + " milliseconds");

	}

}
