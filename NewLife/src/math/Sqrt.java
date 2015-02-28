package math;

public class Sqrt {

	double sqrt(double a){
		if(a==0||a==1){
			return 1;
		}
		double precision = 10e-7;
		double start=0,end=0;
		end=Double.MAX_VALUE;
		if(a<1){
			end=1;
		}
		while(end-start>precision){
			double mid = (start+end)/2;
			if(mid*mid==a){
				return mid;
			}else if(mid*mid>a){
				end = mid;
			}else{
				start= mid;
			}
		}
		return (start+end)/2;
	}
	
	public static void main(String[] args) {
		System.out.println(new Sqrt().sqrt(2));
	}
}
