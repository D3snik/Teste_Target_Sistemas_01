package application;

import java.util.Scanner;

import entities.Tecnica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Tecnica tec = new Tecnica();
		
		tec.setIndice(13);
		tec.setSoma(0);
		tec.setK(0);
		
		System.out.println("Valor da soma : " + tec.Conta());
	sc.close();	
	}		
}
