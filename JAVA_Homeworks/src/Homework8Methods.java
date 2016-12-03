import java.util.ArrayList;
import java.util.Collections;
public class Homework8Methods {
	// part 1
		public static int findTimes10(int[] nums) {
			int lower = 0;
			
			return findTimes10Helper(nums, lower);
		}

		
		
		public static int findTimes10Helper(int[] nums, int lower){
			
			if(lower+1 == nums.length ){
				
				return -1;
			}else if(10*nums[lower] != nums[lower + 1] ){
				
				return findTimes10Helper(nums, lower + 1);
			}else{
				
				return (lower);
			}
		
		}
		
		
		
		// part 2
		public static void replaceMult5(int[] nums, int newVal) {
			int lower = 0;
			replaceMult5Helper(nums, newVal, lower);
			
		}

		public static void replaceMult5Helper(int[] nums, int newVal, int lower){
			if(nums[lower] % 5 == 0 && (lower != nums.length - 1)){
				nums[lower] = newVal;
				
				replaceMult5Helper(nums, newVal, lower+1);
			}else if((lower != nums.length -1)){
				replaceMult5Helper(nums, newVal, lower+1);
			}else if((lower == nums.length -1) && nums[lower] % 5 == 0){
				nums[lower] = newVal;
			}
			
		}
		
		
		
		
		
		// part 3
		public static ArrayList<int[]> permuteArray(int[] array) {
		
		
			ArrayList<int[]> result = new ArrayList();
			permutations(array, new int[]{}, result);
			return result;
		}
		
		public static void permutations(int[] x, int[] y, ArrayList<int[]> result){
			if(x.length == 0){
				result.add(y);
				return;
				
			}
			
			for(int i = 0; i < x.length; i++){
				int[] x2 = new int[x.length - 1];
				if(i >0){
					System.arraycopy(x, 0, x2, 0, i);
				}
				if(i < x.length -1){
					System.arraycopy(x, i + 1, x2, i,x.length - i - 1);
				}
				
				int[] y2 = new int[y.length + 1];
				System.arraycopy(y, 0, y2, 0, y.length);
				y2[y.length] = x[i];
				permutations(x2,y2,result);
				
				
			
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// part 4
		public static String[] mobius(String s1, String s2) {
			ArrayList<String> result = new ArrayList();
			String s3 = s1 + s2;
			int len = s3.length() ;
			int count = len;
			mobiusHelper(s3,  result, len, count);
			
			String[] fResult = new String[result.size()];
			Collections.reverse(result);
			fResult = result.toArray(fResult);
			return fResult;
		}
		
		public static void mobiusHelper(String x, ArrayList<String> result, int len, int count){
			
			if(x.length() == 0){
				result.add(x);
				return;
				
			}
			
			
			if(count > 0){
				
				
				String proxy = String.valueOf(x.charAt(len -1)) +  x.substring(0, len-1);
				
				result.add(proxy);
				mobiusHelper(proxy,result, len, count -1);
			}
			
			
		}

		// part 5
		public static int teddy(int initial, int goal, int increment) {
			int count = 0;
			
			while (count<= 10){
				if(bears(initial,  goal, increment,  count)){
					return count;
				}else{
					count++;
				}
				
				
			}
			return -1;
			
		}
		
		
		public static boolean bears(int initial, int goal, int increment, int n){
			if(goal == initial){
				return true;
			}else if(n == 0){
				return false;
			}else if(bears(initial + increment, goal, increment, n-1)){
				return true;
			}else if ((initial %2 == 0) && bears(initial/2, goal, increment, n-1) ){
				return true;
			}else if(bears(initial - increment, goal, increment, n-1)){
				return true;
			}else if((initial %2 == 0) && bears(3*(initial/2), goal, increment, n-1)){
				return true;
			}else{
				return false;
			}
			
		}
		
		
		
		
		
		
		
		
		
}
