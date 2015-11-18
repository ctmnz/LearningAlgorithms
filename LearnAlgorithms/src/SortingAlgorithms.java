
public class SortingAlgorithms {
	public static int[] doIntMerge(int[] toSort) {
		int[] sortedOut = new int[toSort.length];
		
		int[] tmpArr = new int[toSort.length];
		int n = toSort.length;
		int m = n / 2 ;
		int k = 1;
		int tmpInt;
		
		for (int i =0; i < n; i ++) { 
			System.out.println(toSort[i]);
		}
		
		
		
		return sortedOut;
	}
	
	public static int[] doMurge(int[] a, int[] b) {
		int calculatedLen = a.length + b.length;
		int[] returnInt = new int[calculatedLen];
		
		
		int k = 0;
		int j = 0;
		int o = 0;
		int l = calculatedLen;
		while (l >= 0) {
			if (a[k] < b[j] ) {
				returnInt[o] = a[k];
				k = k + 1;
				l = l - 1;
				o = o + 1;
				continue;
			} else {
				returnInt[o] = b[j];
				j = j + 1;
				l = l - 1;
				o = o + 1;
			}
		}
		
		
		
		
		return returnInt;
	}
	
	
	
}
