
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
		
		
		
	
	

}
