package ntu;

import util.MyUtils;

public class SumAndAverage {

	public static void main(String[] args) {
		if(args.length < 2) System.exit(0);
		int sum = 0;
		int counter = 0;
		double avg;
		int lower = MyUtils.getInt(args[0]);
		int higher = MyUtils.getInt(args[1]);
		//optional swap step, allows user to enter large number first or second
		// else unidirectional loop will not work when lower number is entered second
		if(lower > higher) {
			int temp = higher;
			higher = lower;
			lower = temp;
		}
		for(int n = lower;n <= higher;n++) {
			//modification 6 - use only numbers which are divisible by 7
			if(n%7 != 0) continue;
			//System.out.println(n);
			counter++;
			sum+= n;		 
		}
		/*
		 * multiplying sum with 1.0 will promote it to double and average will compute to 50.5
		 * else sum/counter will round to integer and return 50.0
		 * or we can assign avg = sum and recompute avg = avg/counter
		 */
		
		avg = (sum*1.0)/counter;
		System.out.println("Sum is "+sum+" and average is "+avg);
	}

}
