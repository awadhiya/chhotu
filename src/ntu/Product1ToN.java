package ntu;

import util.MyUtils;

public class Product1ToN {
/**
 * leaving the int rounding bug to be fixed as exercise
 * This program will only compute upto int limit (12!)
 * @param args
 */
	public static void main(String[] args) {
		if(args.length < 2) System.exit(0);;
		int[] ret = MyUtils.getIntPair(args[0], args[1]);
		int lower = ret[0];
		int higher = ret[1];
		int result = 1;
		while(lower<=higher) {
			result *= lower;
			lower++;
		}
		System.out.println(result);

	}

}
