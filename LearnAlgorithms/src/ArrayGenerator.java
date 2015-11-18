import java.util.Random;

public class ArrayGenerator {
	
	public static int[] makeIntArray(int members) {
		int[] returnIntArray = new int[members];
		Random rand = new Random();
		int maxInt = 100; // TODO: Make it an argument
		
		// TODO: Make it with argument (random/almost sorted/etc. unique/other)
		for (int i=0;i< members; i++) {
			returnIntArray[i] = rand.nextInt(maxInt);
		}
		return returnIntArray;
	}

}
