package ch2_bai8;
import java.util.Scanner;
public class bai8 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap so phan tu: ");
			int a = sc.nextInt();
			int N[] = new int[a];
			for (int i = 0; i < a; i++) {
				System.out.println("N[" +i+"] = ");
				N[i]=sc.nextInt();
				
			}
			int s = 0;
			for (int i = 0; i < a; i++) {
				s = s + N[i];
				
			}
			System.out.println("Trung binh cac so vua nhap la: " +s/a);
			
		}

	}

