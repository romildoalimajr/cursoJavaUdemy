package entrada_de_dados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		x = sc.next();
		int y;
		y = sc.nextInt();
		double z;
		z = sc.nextDouble();
		char f;
		f = sc.next().charAt(0);
		
		System.out.println("Voce digitou.: " + x);
		System.out.println("Voce digitou.: " + y);
		System.out.println("Voce digitou.: " + z);
		System.out.println("Voce digitou.: " + f);
		
		String s1, s2, s3;
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS.:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
