package princ;

import java.util.Scanner;

import entities.Quartos;

public class Pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		int rom = 0;
		Quartos[] qua = new Quartos[10];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.printf("rent #%d%n",i+1);
			System.out.printf("qual seu nome %n");
			String nome = sc.next();
			System.out.println("qual seu email ");
			String email = sc.next();
			System.out.println("digite o quarto ");
			 rom=sc.nextInt();
			qua[rom] = new Quartos(nome, email);

		}
		sc.close();
		for (int y = 0; y < qua.length; y++) {
			if(qua[y]!=null){
				System.out.printf("Rent # %d ",y);
				System.out.println("Name : " + qua[y].getNome());
				System.out.println("email : " + qua[y].getEmail());
				
			}
			

		}
	}

}
