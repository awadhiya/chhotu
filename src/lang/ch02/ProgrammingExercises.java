package lang.ch02;

public class ProgrammingExercises {
	private static final int TEN = 10;
	private double getFahren(double celsius) {
		return ((celsius*9)/5)+32;
	}
	private boolean isTriangleValid(int s1, int s2, int s3) {
		return ((s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2));		
	}
	private void checkSum(int isbn) {
		int len = String.valueOf(isbn).length();
		//leading zero
		boolean isZero = false;
		if(len == 8) {
			len = 9;
			isZero = true;
		}
		System.out.print("The ISBN-10 number is "+(isZero?"0":"")+isbn);
		int sum = 0;		
		while(isbn > TEN) {
			int remain = isbn % TEN;
			isbn = isbn/TEN;
			sum += remain*len;
			len -= 1;
		}
		sum += isbn*len;

		//System.out.println(sum);
		sum = sum%11;		
		if(sum == 10) {
			System.out.println("X");
		}
		else System.out.println(sum);
	}
	private void sumDigits(int num) {
		//printing num here, as it's value will change further down
		System.out.print("Sum of digits in "+num+" = ");
		int tot = 0;		
		while(num > TEN ) {
			tot += (num%TEN);
			num = num/TEN;			
		}
		tot += num;
		System.out.print(tot);
	}
	//3.27
	private void checkPointInTraiangle(double px, double py) {
		final int Y = 100; 
		final int X = 200;		
		//slope
		double m = -0.5;
		int c = 100;
		//Let's calulate y coordinate at px
		double iy = m*px+c;
		
		System.out.println("Point ("+px+","+py+") is "+(px > X ||py > Y || iy < py?"outside":"inside")+" the traingle");
		
	}
	//3.28
	private void checkOverlappingSq(double x1, double y1, double w1, double h1,
			double x2, double y2, double w2, double h2) {
		x1 = x1 - w1*0.5;
		y1 = y1 - h1*0.5;
		x2 = x2 - w2*0.5;
		y2 = y2 - h2*0.5;
		double x1max = x1 + w1;
		double y1max = y1 + h1;
		double x2max = x2 + w2;
		double y2max = y2 + h2;
		//r2 is contained if x2 > x1 and x2max < x1max (and same for y)
		if(x2 >= x1 && x2max <= x1max && y2 >= y1 && y2max <= y1max) {
			System.out.println("r2 is inside r1");
		} else if( (x2max < x1 && y2max < y1) || (x2 > x1max && y2 > y1max)) {
			System.out.println("r2 does not overlap r1");
		} else {
			System.out.println("r2 overlaps r1");
		}
				
	}
	public static void main(String args[]) {
		ProgrammingExercises pe = new ProgrammingExercises();
		//System.out.println(pe.getFahren(43));
		//pe.sumDigits(12530);
//		pe.checkSum(13031997);
//		pe.checkSum(13601267);
//		System.out.println(pe.isTriangleValid(1, 3, 2));
//		pe.checkPointInTraiangle(100.5, 25.5);
//		pe.checkPointInTraiangle(100.5, 50.5);
//		pe.checkPointInTraiangle(0, 100.1);
//		pe.checkPointInTraiangle(200.1,0);
//		pe.checkPointInTraiangle(199.0,0.1);
		pe.checkOverlappingSq(2.5, 4, 2.5, 43, 1.5, 5, 0.5, 3);
		pe.checkOverlappingSq(1, 2, 3, 5.5, 3, 4, 0.5, 5);
		pe.checkOverlappingSq(1, 2, 3, 3, 40, 45, 3, 2);
	}

}
