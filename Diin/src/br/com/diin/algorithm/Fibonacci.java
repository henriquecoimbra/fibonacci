package br.com.diin.algorithm;

public class Fibonacci {

	public String createSequence(int loop) {

		int n1 = 0, n2 = 1;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < loop; i++) {
			sb.append(n1 + ",");
			sb.append(n2 + ",");

			n1 += n2;
			n2 += n1;
		}
		return sb.toString();
	}	
}
