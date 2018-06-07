package ntu;

import util.MyUtils;

public class PrintNumberInWord {

	public static void main(String[] args) {
		if(args.length < 1) System.exit(0);
		int var = MyUtils.getInt(args[0]);
		if( var == 0) {
			System.out.println("ZERO");
		} else if( var == 1) {
			System.out.println("ONE");
		} else if(var == 2) {
			System.out.println("TWO");
		} else if (var == 3) {
			System.out.println("THREE");
		}else if (var == 4) {
			System.out.println("FOUR");
		}else if(var == 5) {
			System.out.println("FIVE");
		}else if(var == 6) {
			System.out.println("SIX");
		}else if(var == 7) {
			System.out.println("SEVEN");
		}else if (var == 8) {
			System.out.println("EIGHT");
		}else if (var == 9) {
			System.out.println("NINE");
		}else {
			System.out.println("OTHER");
		}
		String str = "";
		switch(var) {
		case 0: str = "zero"; break;
		case 1: str = "one"; break;
		case 2: str = "two";break;
		case 3: str = "three"; break;
		case 4: str ="four";break;
		case 5: str = "five"; break;
		case 6: str = "six"; break;
		case 7: str = "seven"; break;
		case 8: str ="eight";break;
		case 9: str = "nine"; break;
		default: str = "other";
		}
		System.out.println(str);

	}

}
