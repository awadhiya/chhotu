package ntu;

import util.MyUtils;

public class CheckOddEven {

	public static void main(String[] args) {
		if(args.length> 0 ) {
			int var = MyUtils.getInt(args[0]);
			if(var%2 == 0) {
				System.out.println(var+" is even");
			} else {
				System.out.println(var+" is ODD");
			}			
		}
		System.out.println("DONE");

	}

}
