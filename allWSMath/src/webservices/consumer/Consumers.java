package webservices.consumer;

import webservices.Division;
import webservices.DivisionService;
import webservices.Multiplication;
import webservices.MultiplicationService;
import webservices.Random;
import webservices.RandomService;
import webservices.Subtraction;
import webservices.SubtractionService;
import webservices.Sum;
import webservices.SumService;

public class Consumers {
	
	public static void main(String[] args) {
		
		System.out.println("Preparando para consumir o WS Sum....");
		
		//service
		SumService sumService = new SumService();
		System.out.println("Preparando para consumir o WS Sum....");
		RandomService randomService = new RandomService();
		System.out.println("Preparando para consumir o WS Random....");
		DivisionService divisionService = new DivisionService();
		System.out.println("Preparando para consumir o WS Division....");
		SubtractionService subtractionService = new SubtractionService();
		System.out.println("Preparando para consumir o WS Subtraction....");
		MultiplicationService multiplicationService = new MultiplicationService();
		System.out.println("Preparando para consumir o WS Multiplication....");
		
		//proxy
		Sum proxySum = sumService.getSumPort();
		Random proxyRandom = randomService.getRandomPort();
		Division proxyDivision = divisionService.getDivisionPort();
		Subtraction proxySubtraction = subtractionService.getSubtractionPort();
		Multiplication proxyMultiplication = multiplicationService.getMultiplicationPort();
		
		//operations
		double nextSum = proxySum.sum(5, 2);
		double nextRandom = proxyRandom.random(50) ;
		double nextDivision = proxyDivision.division(18, 3);
		double nextSubtraction = proxySubtraction.subtraction(1500, 1100);
		double nextMultiplication = proxyMultiplication.multiplication(4, 8);
		
		System.out.println("Resultado Sum 5 + 2: " + nextSum);
		System.out.println("Resultado Random 50: " + nextRandom);
		System.out.println("Resultado Division 18 / 3: " + nextDivision);
		System.out.println("Resultado Subtraction 1500 - 1100: " + nextSubtraction);
		System.out.println("Resultado Multiplication 4 * 8: " + nextMultiplication);
		
		
		
	}

}
