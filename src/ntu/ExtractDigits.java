package ntu;

public class ExtractDigits {
	static int TEN = 10;
	static void forwardDigits(int num) {
		
	}
	static void reverseDigits(int num) {
		int remainder = 0;
		while(num > TEN) {
			remainder = num%10;
			num = num/TEN;
			System.out.print(remainder+" ");
		}
		System.out.print(num);
	}
	public static void main(String[] args) {
		reverseDigits(4329);

	}

}
