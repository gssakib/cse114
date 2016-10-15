import java.util.Arrays;


public class Homework5Methods {
	
	// part 1
		public static String eliminateDuplicates(String str) {
			StringBuffer sentence = new StringBuffer(str);
			
			
			for(int i = 1; i < sentence.length(); i++){
				
				for(int j = 0; j < i; j++){
					
					if (sentence.charAt(i) == sentence.charAt(j)){
						
						sentence.delete(i, i+1);
						i--;
					}
					
				}
				
				
				
				
			}
			return sentence.toString();
		}
		
		
		
		// part 2
		public static String getDigits(String phoneNumber) {
			StringBuffer str = new StringBuffer(phoneNumber);
			char[][] maps  = {{'A','B','C','a','b','c'},
							  {'D','E','F','d','e', 'f'},
							  {'G','H','I','g','h','i'},				
							  {'J','K','L','j','k','l'},
							  {'M','N','O', 'm','n','o'},
							  {'P','Q','R','S', 'p','q','r','s'},
							  {'T','U','V', 't', 'u', 'v'},
							  {'W','X','Y','Z','w','x','y','z'}};
			for(int h = 0; h< str.length(); h++){
				
				for(int i = 0; i < maps.length; i++){
					
					for(int j = 0; j< maps[i].length; j++ ){
						 
						if(str.charAt(h) == maps[i][j]){
							str.replace(h, h+1,Integer.toString(i+2) );
							
						}else if(str.charAt(h) == '-'){
							str.delete(h, h+1);
							h--;
						}
						
						
						
					}
					
					
					
				}
				
				
				
				
			}
		
			return str.toString();
		
		
		}
		
		
		
		// part 3
		public static int lowestBasePalindrome(int num) {
			//initializing some variable
			int i =2;
			
			boolean palin = false;
			
			while(!palin){
				
				//changing base
				StringBuffer expr = new StringBuffer(BaseToBase.decimal2Xbase(Integer.toString(num), i));
				
				
				if(expr.toString().equals(expr.reverse().toString())){
					palin = true;
				}else{
					i++;
				}
				
			}
			return i;
		}
		
		
		// part 4
		public static int[] interleaveArrays(int[] array1, int[] array2, int stride, int maxElements) {
			
			int m = 0;
			int n= 0;
			int k =0;
			if(stride > maxElements){
				stride = maxElements;
			}
			
			if(stride <= 0 || maxElements <= 0){
				return null;
			}
			
			if(maxElements >= array1.length + array2.length){
				int [] arry = new int[maxElements];
				if(array1.length > array2.length){
					for(;n< (array2.length / stride);){
						
						for(int i = 0; i < stride; i++, k++, m++){
							arry[k] = array1[m];
						}
						
						for(int j = 0; j < stride; j++, k++, n++){
							arry[k] = array2[n];
						}
						//System.out.println(n);
					}
					
					for(; m <array1.length; m++,k++){
						arry[k] = array1[m];
					}
					
					for(;n < array2.length ; n++, k++){
						arry[k] = array2[n];
					}
					
					//System.out.println("lala");
					int[] result1 = new int[array1.length + array2.length];
					for(int i = 0; i< result1.length; i++){
							result1[i] = arry[i];
					
					}
					return result1;
					}else if(array2.length > array1.length){
						
						
						for(;m< array1.length / stride;){
							
							for(int i = 0; i < stride; i++, k++, m++){
								arry[k] = array1[m];
							}
							
							for(int j = 0; j < stride; j++, k++, n++){
								arry[k] = array2[n];
							}
							//System.out.println(n);
						}
						for(; m <array1.length; m++,k++){
							arry[k] = array1[m];
						}
						
						for(; n <array2.length; n++,k++){
							arry[k] = array2[n];
						}
						int[] result1 = new int[array1.length + array2.length];
						for(int i = 0; i< result1.length; i++){
								result1[i] = arry[i];
						
						}
						return result1;
						
						
					}else{
						//System.out.println("lala");
						for(;m<  array1.length / stride;){
							
							for(int i = 0; i < stride; i++, k++, m++){
								arry[k] = array1[m];
							}
							
							for(int j = 0; j < stride; j++, k++, n++){
								arry[k] = array2[n];
							}
							//System.out.println(n);
							
						}
						for(; m <array1.length; m++,k++){
							arry[k] = array1[m];
						}
						
						for(; n <array2.length; n++,k++){
							arry[k] = array2[n];
						}
						
						int[] result1 = new int[array1.length + array2.length];
						for(int i = 0; i< result1.length; i++){
								result1[i] = arry[i];
						
						}
						return result1;
						
						
					}
					
				}else if(maxElements < array1.length + array2.length){
					
					int [] arry = new int[maxElements];
					//System.out.println("lala");
					if(maxElements <= array2.length && maxElements <= array1.length){
						//System.out.println("lala");
						for(;n< (maxElements / stride);){
							
							for(int i = 0; i < stride; i++, k++, m++){
								arry[k] = array1[m];
							}
							if(k == maxElements){
								return arry;
							}
							for(int j = 0; j < stride; j++, k++, n++){
								arry[k] = array2[n];
							
							}
							if(k == maxElements){
								return arry;
							}
							System.out.println(k);
						}
						//System.out.println("lala");
						for(; m <maxElements; m++,k++){
							arry[k] = array1[m];
						}
						
						for(;n < maxElements ; n++, k++){
							arry[k] = array2[n];
						}
						
						//System.out.println("lala");
						
						return arry;
					}else if(maxElements > array2.length && maxElements < array1.length){
						for(;n< (array2.length / stride);){
							
							for(int i = 0; i < stride; i++, k++, m++){
								arry[k] = array1[m];
							}
							if(k == maxElements){
								return arry;
							}
							for(int j = 0; j < stride; j++, k++, n++){
								arry[k] = array2[n];
							}
							if(k == maxElements){
								return arry;
							}
							//System.out.println(n);
						}
						
						for(; m <maxElements; m++,k++){
							arry[k] = array1[m];
						}
						
						for(;n < array2.length ; n++, k++){
							arry[k] = array2[n];
						}
						
						//System.out.println("lala");
						
						return arry;
					}else if(maxElements < array2.length && maxElements > array1.length){
						for(;n< (array1.length / stride);){
							
							for(int i = 0; i < stride; i++, k++, m++){
								arry[k] = array1[m];
							}
							if(k == maxElements){
								return arry;
							}
							for(int j = 0; j < stride; j++, k++, n++){
								arry[k] = array2[n];
							}
							if(k == maxElements){
								return arry;
							}
							//System.out.println(n);
						}
						
						for(; m <array1.length; m++,k++){
							arry[k] = array1[m];
						}
						
						for(;n < maxElements ; n++, k++){
							arry[k] = array2[n];
						}
						
						//System.out.println("lala");
						
						return arry;
					}else if((maxElements > array2.length && maxElements > array1.length) &&(array2.length > array1.length)){
						for(;n< (array1.length / stride);){
							
							for(int i = 0; i < stride; i++, k++, m++){
								arry[k] = array1[m];
							}
							if(k == maxElements){
								return arry;
							}
							
							for(int j = 0; j < stride; j++, k++, n++){
								arry[k] = array2[n];
							}
							if(k == maxElements){
								return arry;
							}
							//System.out.println(n);
						}
						
						for(; m <array1.length; m++,k++){
							arry[k] = array1[m];
						}
						
						for(;n < maxElements ; n++, k++){
							arry[k] = array2[n];
						}
						return arry;
					}else if((maxElements >= array2.length && maxElements >= array1.length) &&(array2.length <= array1.length)){
						//System.out.println("lala");
						
						for(;n< (array2.length / stride);){
							System.out.println("lala");
							for(int i = 0; i < stride; i++, k++, m++){
								arry[k] = array1[m];
							}
							if(k == maxElements){
								return arry;
							}
							
							for(int j = 0; j < stride; j++, k++, n++){
								arry[k] = array2[n];
							}
							if(k == maxElements){
								return arry;
							}
						//System.out.println(n);
						}
						
						//System.out.println("lala");
						
						for(; m <maxElements; m++,k++){
							
							arry[k] = array1[m];
						}
						
						for(;n < array2.length ; n++, k++){
							
							arry[k] = array2[n];
						}
						
						  
						 
						System.out.println("lala");
						
						return arry;
					}
								
						
					
				}
			return null;
			}
	
		// part 5
		public static void rotateRight(int[][] matrix, int numCols) {
			
			for(int k = 0; k< matrix.length;k++){
				for(int j = 0; j < numCols; j++){
					
					int temp = matrix[k][matrix[k].length - 1]; // Retain the first element
					// Shift elements right
					for (int i = matrix[k].length -1; i > 0; i--) {
					 matrix[k][i] = matrix[k][i-1];
					}
					// Move the last element to fill in the first position
					 matrix[k][0] = temp;
					
					
			}

				
				
			}
			
			/*
			for(int i =0; i< matrix.length; i++){
				
				for(int j= 0; j< matrix[i].length; j++){
					
					System.out.print(matrix[i][j]);
					System.out.print(" ");
					
				}
				System.out.println("");
			}
			*/
				}	
	

}
