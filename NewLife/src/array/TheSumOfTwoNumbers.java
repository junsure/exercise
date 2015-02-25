package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author supertool
 *给定两数之和，是否能找出其中的两个数使其和为某个特定的值
 */
public class TheSumOfTwoNumbers {

	public TheSumOfTwoNumbers() {
	}

	// O(nlgn)
	boolean hasSum(int[] arr,int target){
		if(arr ==null || arr.length==0){
			return false;
		}
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<j){
			int sum = arr[i]+arr[j];
			if(sum==target){
				return true;
			}else if(sum<target){
				i++;
			}else{
				j--;
			}
		}
		return false;
	}

	//O(n) 不存在重复的数据
	int [] twoSum(int[] arr, int target){
		int[] res={-1,-1};
		if(arr==null || arr.length==0){
			return res;
		}
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i], i);
		}
		for(int i=0;i<arr.length;i++){
			int tmp=target-arr[i];
			if(tmp!=arr[i]&&hm.containsKey(tmp)){
				res = new int[]{i,hm.get(tmp)};
				break;
			}
		}
		return res;
	}
	
	//O(n) 集合中存在重复值
	public static class TwoSumm{
		
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		public void save(int input){
			int originalCount = 0;
			if(hm.containsKey(input)){
				originalCount = hm.get(input);
			}
			hm.put(input, originalCount+1);
		}
		
		public boolean test(int target){
			Iterator<Integer> it = hm.keySet().iterator();
			while(it.hasNext()){
				Integer val = it.next();
				if(hm.containsKey(target-val)){
					boolean isDouble = target == 2*val;
					if(!(isDouble&& hm.get(val)==1)){
						return true;
					}
				}
			}
			return false;
		}
	}

	
	public static void main(String[] args) {
		TheSumOfTwoNumbers theSumOfTwoNumbers =new TheSumOfTwoNumbers();
		int[]arr = new int[]{1,2,43,3,21,13,20,33,10};
		int target = 3;

		boolean hasSum = theSumOfTwoNumbers.hasSum(arr,target);
		System.out.println(hasSum);

		int[] indexes = theSumOfTwoNumbers.twoSum(arr, target);
		System.out.println(Arrays.toString(indexes));

	}

}
