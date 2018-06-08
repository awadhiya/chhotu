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
		/*printSquareBoard(9,true);
		computeTable(30);
		printPatternA(9);		
		printPatternB(9);
		printPatternC(9);
		printPatternE(9);
		printPatternF(6);
		printPatternG(4);*/
		printPatternH(10);
		printPatternI(10);
	}
	static void printPatternA(int x) {
		for(int row = 1; row <= x; ++row) {
			for(int j = 0; j < row; ++j) {
				System.out.print("# ");
			}
			System.out.println("");
		}
	}
	static void printPatternB(int x) {
		for(int row = x; row > 0; --row) {
			for(int j = 0; j < row; ++j) {
				System.out.print("# ");
			}
			System.out.println("");
		}
	}
	static void printPatternC(int x) {
		for(int row = x; row > 0; --row) {
			for(int spaceCount = row; spaceCount < x; ++spaceCount) {
				System.out.print("  ");
			}
			for(int starCount = 0; starCount < row; ++starCount) {
				System.out.print("# ");
			}
			System.out.println("");
		}
	}
	static void printPatternD(int x) {
		for(int row = 1; row < x; ++row) {
			for(int col = 1; col < x; ++col) {
				if(col >= (x-row)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	static void printPatternE(int x) {
		for(int row = 1; row <= x; ++row) {
			for(int col = 1; col <= x; ++col) {
				if(row == 1 || row == x) System.out.print("# ");
				else if(col == 1 || col == x) System.out.print("# ");
				else System.out.print("  ");				
			}
			System.out.println("");
		}
	}
	static void printPatternF(int x) {
		System.out.println("     (f)   ");
		for(int row = 1; row <= x; ++row) {
			for(int col = 1; col <= x; ++col) {
				if(row == 1 || row == x) System.out.print("# ");
				else if(col == row) System.out.print("# ");
				else System.out.print("  ");				
			}
			System.out.println("");
		}
	}
	static void printPatternG(int x) {
		System.out.println("       (g)");
		for(int row = 1; row <= x; ++row) {
			for(int col = 1; col <= x; ++col) {
				if(row == 1 || row == x) System.out.print("# ");
				else if((x-col) == (row-1)) System.out.print("# ");
				else System.out.print("  ");				
			}
			System.out.println("");
		}
	}
	static void printPatternH(int x) {
		System.out.println("       (h)");
		for(int row = 1; row <= x; ++row) {
			for(int col = 1; col <= x; ++col) {
				if(row == 1 || row == x) System.out.print("# ");
				else if((col == row)|| ((x-col) == (row-1))) System.out.print("# ");
				else System.out.print("  ");				
			}
			System.out.println("");
		}
	}
	static void printPatternI(int x) {
		for(int row = 1; row <= x; ++row) {
			for(int col = 1; col <= x; ++col) {
				if(row == 1 || row == x) System.out.print("# ");
				else if((col == row)
						|| ((x-col) == (row-1))
						|| col == 1
						|| col == x)
						System.out.print("# ");
				else System.out.print("  ");				
			}
			System.out.println("");
		}
	}
}
