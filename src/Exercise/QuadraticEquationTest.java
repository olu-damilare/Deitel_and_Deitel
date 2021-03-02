import java.util.Scanner;
public class QuadraticEquationTest{
	public static void main(String[] args){
		QuadraticEquation question = new QuadraticEquation();

		System.out.println("Enter the value for coefficient of x squared:");
		Scanner input = new Scanner(System.in);
		double xSquaredCoefficient = input.nextDouble();
		question.setCoefficientOfXSquared(xSquaredCoefficient); 

		System.out.println("Enter the value for coefficient of x:");
		double xCoefficient = input.nextDouble();
		question.setCoefficientOfX(xCoefficient); 

		System.out.println("Enter the value for coefficient of the constant:");
		double constant = input.nextDouble();
		question.setConstant(constant); 
		
		question.calculateRoot1();
		question.calculateRoot2();
		System.out.printf("%s%.2f%n", "x1 = ", question.getRoot1());
		System.out.printf("%s%.2f%n", "x2 = ", question.getRoot2());

	}

}