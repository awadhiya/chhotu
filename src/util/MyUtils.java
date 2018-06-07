package util;

public class MyUtils {
	public static int getInt(String str) {
		int ret = 0;
		try {
			ret = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			System.out.println("Bad Input");
		}
		return ret;
	}
	public static int[] getIntPair(String str1, String str2) {
		int lower = getInt(str1);
		int higher = getInt(str2);		
		if(lower > higher) {
			int temp = higher;
			higher = lower;
			lower = temp;
		}
		int[] ret = new int[2];
		ret[0] = lower;
		ret[1] = higher;
		return ret;
		// or you can do this
		// return new int[] {lower,higher};
	}
}
