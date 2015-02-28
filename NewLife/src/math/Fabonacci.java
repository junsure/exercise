package math;

import java.util.Map;

public class Fabonacci {

	public int fab(int n){
		if(n<=2){
			return 1;
		}
		int a=1;
		int b=1;
		int ret = 0;
		int i=3;
		while(i<=n){
			ret = a+b;
			a=b;
			b=ret;
			i++;
		}
		return ret;
	}
	
	public int fab(int n ,Map<Integer,Integer> hm){
		if(n<=2){
			return 1;
		}
		if(hm.containsKey(n)){
			return hm.get(n);
		}
		int tmp = fab(n-1,hm)+fab(n-2,hm);
		hm.put(n, tmp);
		return tmp;
	}
}
