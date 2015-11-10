public class Calc{
	public static double getAverage(double [] num){
             double sum = 0.0;
	     for(int i = 0;i<num.length; i++) {
                sum+=num[i];
	     }
	     return(sum/num.length);
	}
	public static double getSum(double [] num){
             double sum = 0.0;
	     for(int i =0;i<num.length;i++){
                sum+=num[i];
	     }
	     return(sum);
	}
	public static double getProduct(double [] num){
	double product =1.0 ;
	for(int i = 0;i<num.length;i++){
		product=product*num[i];
	}
		return(product);
	}
	public double getFactorial(double num){
	double factorial = 1.0;
	for(int i=1;i<=num;i++){
	factorial=factorial*i;
	}
	return(factorial);
      }
}







