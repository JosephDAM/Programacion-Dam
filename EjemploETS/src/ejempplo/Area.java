package ejempplo;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		double base, area, altura;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Base: ");
		base=sc.nextDouble();
		System.out.println("Altura: ");
		altura=sc.nextDouble();
		area = (base * altura) / 2;
		System.out.println("El area: " + area);
		sc.close();
		

	}

}
