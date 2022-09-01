package com.juaracoding.postest28;

import java.util.Arrays;

public class SoalNomorTiga {
	public static void main(String[] args) {

		String a, b, c, d;
		a = ":T1:202112SOAL3";
		b = "\n:T1:202111SOAL3";
		c = "\n:T1:202110SOAL3";
		d = ":T2:";

		String[] ArrayT1 = new String[5];
		ArrayT1[0] = "SOAL3/2112/AB00000";
		ArrayT1[1] = "0011 OD:0001234500";
		ArrayT1[2] = "CDE5432100 SOALO03";
		ArrayT1[3] = " ABCDE12345 XAS SK";
		ArrayT1[4] = "ILL TEST ESSAY .DT";

		String[] ArrayT2 = new String[5];
		ArrayT2[0] = "SOAL3/2111/BC00001";
		ArrayT2[1] = "1100 OD:0003452100";
		ArrayT2[2] = "EFG2451300 SOALOO3";
		ArrayT2[3] = " EFGHI25134 XAS SK";
		ArrayT2[4] = "ILL TEST ESSAY .DT";

		String[] ArrayT3 = new String[5];
		ArrayT3[0] = "SOAL3/2110/DE21003";
		ArrayT3[1] = "1010 OD:0001524300";
		ArrayT3[2] = "HIJ2145300 SOALOO3";
		ArrayT3[3] = " JKLMNS2431 XAS SK";
		ArrayT3[4] = "ILL TEST ESSAY .DT";

		System.out.println(a);
		System.out.print(d + ArrayT1[2] + ArrayT1[3] + ArrayT1[4] + ArrayT1[0] + ArrayT1[1] + "\n");
		System.out.println(b);
		System.out.print(d + ArrayT2[2] + ArrayT2[3] + ArrayT2[4] + ArrayT2[0] + ArrayT2[1] + "\n");
		System.out.println(c);
		System.out.print(d + ArrayT3[2] + ArrayT3[3] + ArrayT3[4] + ArrayT3[0] + ArrayT3[1]);
	}
}
