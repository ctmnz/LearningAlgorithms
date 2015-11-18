
public class main {

	public static void main(String[] args) {
		int[] toSortInt = ArrayGenerator.makeIntArray(16);
		
		int[] sortedOut = SortingAlgorithms.doIntMerge(toSortInt);
		
		debugHelper.printIntArray(sortedOut);
//		debugHelper.printIntArray(toSortInt);		
//		debugHelper.printIntArray(sortedOut);
		

	}

}
