package ch2_bai6;
import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
		
		System.out.println("vui long nhap gia tri: ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		while (a <= 0) {
			System.out.println("nhap lai so nguyen duong: ");
			a = sc.nextInt();

		}
		int KetQua = 1;
		
		for (int i = 1; i <= a; i++) {
			
			KetQua *= i;
		}
		System.out.println("gia tri cua " + a + "! la = " + KetQua);
	}
}

