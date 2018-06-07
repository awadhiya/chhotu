package ntu;

public class ComputePI {

	public static void main(String[] args) {
		boolean why = true;
		double pi = 1;
		int MAXTERM = 2000000;
			for(int i =3;i<MAXTERM;i = i+2) {				
				if(why) {
					pi = pi-(1.0/i);
					//System.out.println(i);
				} else {
					pi = pi+(1.0/i);
				}
				why = !why;
			}
			pi = pi*4;
		System.out.println(pi);
		System.out.println(Math.PI);
	}

}
