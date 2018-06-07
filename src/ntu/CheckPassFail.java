package ntu;

import util.MyUtils;

public class CheckPassFail {

	public static void main(String[] args) {
		int mark = 40;
		if(args.length >0) {
			int var = MyUtils.getInt(args[0]);
			if(mark >= var) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		}
		System.out.println("DONE");

	}

}
