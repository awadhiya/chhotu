package ntu;

public class HarmonicSum {

	public static void main(String[] args) {
		int maxDenom = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		for (int denom = 1; denom <= maxDenom; ++ denom) {
			sumL2R = sumL2R + (1.0/denom);
		}
		for (int denom = maxDenom; denom >= 1; --denom) {
			sumR2L = sumR2L + (1.0/denom);
		}
		System.out.println("L2R\t"+sumL2R);
		System.out.println("R2L\t"+sumR2L);

	}

}
