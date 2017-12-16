package edu.slaxxx.services;

public class FibService {

	public static long getFib(int n) {
		long y = 0, x = 1, aux;

		if (n < 0 || n >= 100000) {
			return -1;
		}
		
		
		for (int i = 0; i < n; i++) {
			aux = y;
			y = x;
			x = x + aux;
		}
		return y;
	}
}
