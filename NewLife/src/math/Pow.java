package math;

public class Pow {


	double pow(double x,int n){
		if(n==0){
			return 1;
		}
		double half = pow(x,n/2);
		if(n%2==0){
			return half * half;
		}else if(n>0){
			return half*half*x;
		}else{
			return half*half/x;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Pow().pow(2, 3));
	}
}
