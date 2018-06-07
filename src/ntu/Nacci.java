package ntu;

public class Nacci {

	public static void main(String[] args){
		getTribonacci(20);
	}
	static void getTribonacci(int MAX){
		int start = 1;
		int mid = 1;
		int last = 2;
		System.out.println(last);
		for(int i = 0;i<MAX;++i) {
			int temp = last;
			last = start+mid+last;
			start = mid;
			mid = temp;
			System.out.println(last);
		}
	}

	static void getFibonnaci(int MAX){
		int start = 0;
		int last = 1;		
		System.out.println(last);
		for(int i = 0;i<MAX;++i) {
			int temp = last;
			last = start+last;
			start = temp;
			System.out.println(last);
		}
	}

}
