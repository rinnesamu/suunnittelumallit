package strategy;

public class MergeSort implements ISorting {
	
	private static int[] help;

	@Override
	public int[] sort(int[] unsorted) {
		help = new int[unsorted.length];
		mergeSort(unsorted, 0, unsorted.length-1);
		return unsorted;
	}
	
	private void merge(int t[], int p, int q, int r) {
        //i osoittaa 1. osataulukkoa, j osoittaa 2. osataulukkoa
        // k osoittaa aputaulukkoa, johon yhdiste kirjoitetaan.
        int i=p, j=q+1, k=0;
        while(i<q+1 && j<r+1) {
                if (t[i]<t[j]) {
                        help[k++]=t[i++];
                }
                else {
                        help[k++]=t[j++];
                }
                
                
        }
        //toinen osataulukko käsitelty, siirretään toisen käsittelemättömät
        while (i<q+1) {
            help[k++]=t[i++];
        }
        while (j<r+1) {
                help[k++]=t[j++];
        }
        //siirretään yhdiste alkuperäiseen taulukkoon
        for (i=0;i<k;i++) {
                t[p+i]=help[i];
        }
    }

    private void mergeSort(int t[],  int alku,  int loppu) {
        int ositus;
        long la, ll, lt;
        if (alku<loppu) { //onko väh. 2 alkiota, että voidaan suorittaa ositus

                la=alku; ll=loppu;
                lt=(la+ll)/2;
                ositus=(int)lt;
                mergeSort(t, alku, ositus);//lajitellaan taulukon alkupää
                mergeSort(t, ositus+1, loppu);//lajitellaan taulukon loppupää
                merge(t, alku, ositus, loppu);//yhdistetään lajitellut osataulukot
        }
    }



}
