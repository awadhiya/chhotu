package ntu;

public class Loopers {
	static void printSquareBoard(int x, boolean chequered) {
		for(int line=0;line<x;++line) {
			if(chequered) {
				//identifies even line using mod and prints extra space to create checker
				System.out.print(line%2 == 0 ? " ":"");
			}
			for(int col=0;col<x;++col) {
				System.out.print("# ");
			}
			System.out.println("");
		}
	}
	/**
	 * prints pretty upto 3 digits calc (%3d). May need adjustment for larger numbers.
	 * @param Max
	 */
	static void computeTable(int Max) {
		//print column headers
		System.out.print(" *  | ");
		for(int col =1;col<=Max;col++) {
			System.out.printf(" %2d ",col);
		}		
		//printing newline and fixed header lines (under *  | )
		System.out.print("\n-----");
		//print dynamic header lines
		for(int col =1;col<=Max;col++) {
			System.out.print("----");
		}
		
		for(int row = 1;row<=Max;++row) {
			//new line and header for each row			
			System.out.printf("\n%2d  |",row);
			for(int col =1;col<=Max;col++) {
				System.out.printf(" %3d",row*col);
			}
		}

	}
	public static void main(String[] args) {
		//printSquareBoard(9,true);
		computeTable(30);
	}

}
