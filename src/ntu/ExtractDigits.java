package ntu;

public class ExtractDigits {
	static int TEN = 10;
	static void forwardDigits(int num) {
		while(num > 0) {
			int innerNum = num;
			int exponent = 0;
			while (innerNum > TEN) {
				innerNum = innerNum/TEN;
				exponent++;				
			}
			System.out.print(innerNum+" ");
			num = (int) (num%Math.pow(TEN, exponent));
		}
		System.out.print(num);
	}
	static void reverseDigits(int num) {
		int remainder = 0;
		while(num > TEN) {
			remainder = num%10;
			num = num/TEN;
			System.out.print(remainder+" ");
		}
		System.out.print(num+"\n");
	}
	public static void main(String[] args) {
		reverseDigits(432950);
		forwardDigits(432950);

	}

}
