package kureselısınma;

import java.util.Scanner;

public class Kureselİsınma {
	public static void main(String[] args) {
		int [] soru1 = {1, 2, 3, 4};		
		int [] soru2 = {1, 2, 3, 4};		
		int [] soru3 = {1, 2, 3, 4};				
		int [] soru4 = {1, 2, 3, 4};	
		int [] soru5 = {1, 2, 3, 4};
		
		int cevap1=0, cevap2=0, cevap3=0, cevap4=0, cevap5=0;
		int dogru=0;
		
		System.out.println("a=1   b=2   c=3   d=4");
		
		System.out.print("hangi ulke en cok sera gazi yakmaktadir?\n");
		System.out.print("a)iran	b)turkiya	c)amerika	d)almanya");
		Scanner input = new Scanner(System.in); {
			cevap1=input.nextInt();
		}
		if(cevap1==soru1[0]) {
			dogru=dogru+1;
			System.out.print("dogru cevap");
		}
		else {
			System.out.print("yanlis cevap");
		}
		
		System.out.print("hangi ulke en cok sera gazi yakmaktadir?\n");
		System.out.print("a)iran	b)turkiya	c)amerika	d)almanya");
		Scanner input2 = new Scanner(System.in); {
			cevap1=input2.nextInt();
		}
		if(cevap2==soru2[1]) {
			dogru=dogru+1;
			System.out.print("dogru cevap");
		}
		else {
			System.out.print("yanlis cevap");
		}
		
		System.out.print("hangi ulke en cok sera gazi yakmaktadir?\n");
		System.out.print("a)iran	b)turkiya	c)amerika	d)almanya");
		Scanner input3 = new Scanner(System.in); {
			cevap1=input3.nextInt();
		}
		if(cevap3==soru3[2]) {
			dogru=dogru+1;
			System.out.print("dogru cevap");
		}
		else {
			System.out.print("yanlis cevap");
		}
		
		System.out.print("hangi ulke en cok sera gazi yakmaktadir?\n");
		System.out.print("a)iran	b)turkiya	c)amerika	d)almanya");
		Scanner input4 = new Scanner(System.in); {
			cevap1=input4.nextInt();
		}
		if(cevap4==soru4[0]) {
			dogru=dogru+1;
			System.out.print("dogru cevap");
		}
		else {
			System.out.print("yanlis cevap");
		}
		
		System.out.print("hangi ulke en cok sera gazi yakmaktadir?\n");
		System.out.print("a)iran	b)turkiya	c)amerika	d)almanya");
		Scanner input5 = new Scanner(System.in); {
			cevap1=input5.nextInt();
		}
		if(cevap5==soru5[0]) {
			dogru=dogru+1;
			System.out.print("dogru cevap");
		}
		else {
			System.out.print("yanlis cevap");
		}
		
		if(dogru==5) {
		System.out.print("mukemmel");	
		}
		
		if(dogru==4) {
			System.out.print("cok iyi");	
			}
		
		if(dogru<=3) {
			System.out.print("bilgilerini yenile");	
			}
	}

}

