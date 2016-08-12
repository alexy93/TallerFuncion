package paquete;

public class Factorial {

	public int calfac(int n){
		if (n==0)
			return 1;
		else
			return n*calfac(n-1);
	}
}
