
public class Main {

	public static void Main(String[] args) {
		int[] toSortInt = ArrayGenerator.makeIntArray(16);
		
		int[] sortedOut = SortingAlgorithms.doIntMerge(toSortInt);
		
		DebugHelper.printIntArray(sortedOut);
//		debugHelper.printIntArray(toSortInt);		
//		debugHelper.printIntArray(sortedOut);
		

	}

}
