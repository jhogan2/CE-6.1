public class calcDriver{
	public static void main(String [] args){
	Calc fact = new Calc();
	double [] num = new double[3];

	num[0]=5.0;
	num[1]=6.0;
	num[2]=7.0;

	System.out.println(fact.getFactorial(7));
	System.out.println(Calc.getSum(num));
	System.out.println(Calc.getProduct(num));
	System.out.println(Calc.getAverage(num));
	}
}
