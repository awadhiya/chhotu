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
}
