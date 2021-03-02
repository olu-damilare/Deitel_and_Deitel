public class QuadraticEquation{
	private double coefficientOfXSquared;
	private double coefficientOfX;
	private double constant;
	private double root1;
	private double root2;

	public void setCoefficientOfXSquared(double number){
		coefficientOfXSquared = number;
	}
	public double getCoefficientOfXSquared(){
		return coefficientOfXSquared;
	}
	public void setCoefficientOfX(double number){
		coefficientOfX = number;
	}
	public double getCoefficientOfX(){
		return coefficientOfX;
	}
	public void setConstant(double constant){
		this.constant = constant;
	}
	public double getConstant(){
		return constant;
	}
	public void calculateRoot1(){
		double squareRootValue = Math.sqrt((coefficientOfX * coefficientOfX) - (4 * coefficientOfXSquared * constant));
		root1 =(-coefficientOfX + squareRootValue) / (2 * coefficientOfXSquared);
	}
	public double getRoot1(){
		return root1;
	}
	public void calculateRoot2(){
		double squareRootValue = Math.sqrt((coefficientOfX * coefficientOfX) - (4 * coefficientOfXSquared * constant));
		root2 =(-coefficientOfX - squareRootValue) / (2 * coefficientOfXSquared);
	}
	public double getRoot2(){
		return root2;
	}
	

}