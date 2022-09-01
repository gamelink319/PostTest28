package com.juaracoding.postest28;

public class SoalNomerSatu {
	public static void main(String args[]) {
		int intloop = 0;
		for (int i = 0; i < 100; i++) {
			intloop++;
			for (int x = 0; x < 1; x++) {
				if (intloop % 3 == 0 || intloop % 5 == 0) {
					System.out.println("Bizzbuzz");
				}
				if (intloop % 3 == 0) {
					System.out.println("Bizz");
				}
				if (intloop % 5 == 0) {
					System.out.println("buzz");
				}
			}
		}
	}
}