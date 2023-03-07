package ch2_bai4;
import java.util.Scanner;
public class bai4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ten: ");
		String name = in.nextLine();
		
		System.out.println("Tuoi: ");
		int age = in.nextInt();
		
		if(age<16) System.out.println("Ban "+name+ " o tuoi vi thanh nien");
		else if( age >=16 && age <18) System.out.println("Ban "+name+ " o do tuoi truong thanh");
		else System.out.println("Ban "+ name+" da gia");
	}
}