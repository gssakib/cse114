public class CarRepairShop {
	Car[] repairCar = new Car[100];
	int countCars = 0;
	
	Ticket[] repairTicket = new Ticket[1];
  	int ticketNo = 0;
	
	public int addNewCar(String vin, String make, int year) {
		
		Car temp = new Car(vin, make, year);
		for(int i = 0; i < countCars; i++){
			if(repairCar[i].getVin().equals(temp.getVin())){
				return -1;
			}
		}
		if(countCars + 1 == repairCar.length){
			Car[] dummyRef = new Car[2*repairCar.length];
			for(int i = 0; i < repairCar.length; i++){
				dummyRef[i] = repairCar[i];
			}
			repairCar = dummyRef;
		}
		
		repairCar[countCars++] = temp;
		//System.out.println(repairCar[countCars-1].getVin());
		return countCars;
	}
	
	public int addRepairTicket(String vin, double cost, String description) {
		int vinMatch = 0;
		
		if(ticketNo + 1 == repairTicket.length){
			Ticket[] dummyRef = new Ticket[2*repairTicket.length];
			for(int i = 0; i < repairTicket.length; i++){
				dummyRef[i] = repairTicket[i];
			}
			repairTicket = dummyRef;
		}
		
		
		for(int i = 0; i< countCars; i++){
	        
	        if(repairCar[i].getVin().equals(vin)){
	         	vinMatch ++; 
	          
	        }
	        
	      }
		
		if(vinMatch == 1){
	    	 
	    	  Ticket tempTicket = new Ticket(vin, cost, description);
		      repairTicket[ticketNo++] = tempTicket;
		      return ticketNo;  
	    	  
	      }else{
	    	
	    	  return -1;
	      }
	      
	}
	
	public double getRepairCost(int ticketNum) {
		if(ticketNo >= ticketNum && ticketNum > 0){
	       	return  repairTicket[ticketNum-1].getCost();
	      }else{
	       	return -1; 
	      }
		
	}
	
	public double getTotalRepairCosts(String vin) {
		double sum = 0;
	      for(int i =0; i< ticketNo;i++){
	            
	            if(repairTicket[i].getVin().equals(vin)){
	              
	              sum += repairTicket[i].getCost();
	              
	            }
	            
	          }
	       if(sum == 0){
	    	   return -1.0;
	       }else{
	    	   return sum;
	       }
	          
	          
	      
	        
	       
		
	}

	public String getWorstCarMake() {
		int biggestCountIndex = 0;
		String maxVin = "";
		int[] arryCount = new int[ticketNo];
		
		
		if(countCars == 0 || ticketNo == 0){
			return null;
		}
	     for(int i =0; i< ticketNo;i++){
	            int wCount = 0; 
	            for(int j = 0; j < ticketNo; j++ ){
	            	if(repairTicket[i].getVin().equals(repairTicket[j].getVin()))
	            	wCount ++;
	            }
	            arryCount[i] = wCount;
	    	  
	           
	            
	      }
	      
	      for(int i = 1; i < arryCount.length; i++ ){
	    	  if(arryCount[i] > arryCount[i-1]){
	    		  biggestCountIndex = i;
	    	  }
	    	  
	    	  
	      }
	      
	         
	      maxVin = repairTicket[biggestCountIndex].getVin();
	        for(int i = 0; i < repairCar.length; i++){
	        	if(repairCar[i].getVin().equals(maxVin)){
	        		return repairCar[i].getMake();
	        	}
	        	
	        }
	        
	      
	      return null;
	}
	
	public boolean updateRepairCost(int ticketNum, double newCost) {
		for(int i = 0; i < ticketNo; i++){
			if(ticketNum == i+1){
				
				repairTicket[i].setCost(newCost);
				return true;
			}
			
		}
		
		return false;
	}
	
	public boolean deleteRepair(int ticketNum) {
		
		for(int i = 0; i < ticketNo; i++){
			if(ticketNum == i+1){
				for(int j = i+1; j< ticketNo; j ++){
					repairTicket[j-1] = repairTicket[j];
				}
			ticketNo --;
			return true;
			}
			
		}
		return false;
	}
	
	public boolean deleteAllRepairsForCar(String VIN) {
		int count = 0;
		for(int i = 0; i< ticketNo; i++){
			if(repairTicket[i].getVin().equals(VIN)){
				for(int j = i+1; j< ticketNo; j ++){
					repairTicket[j-1] = repairTicket[j];
				}
			ticketNo --;
			count++;
			
			}
		}
	
		if(count > 0){
			return true;
		}else{
			return false;
		}
	}
	
	
	public boolean deleteCarAndRepairs(String VIN) {
		return false;
	}
	
}





class Ticket{
	  
	private String vin;
  	private String des;
  	private double cost;
	
  
  public Ticket(String vin, double cost, String des){
    
    this.vin = vin;
    this.cost = cost;
    this.des = des;
    
  }
  
  
  public String getVin(){
    
  	return vin;
  
  }
  
   public double getCost(){
    
  	return cost;
  
  }

   	public void setCost(double cost){
   		this.cost = cost;
   	}


 public String getDes(){
    
  	return des;
  
  }
  
  
}



class Car{

	private String vin;
	private String make;
	private int year;
	
	public Car(String vin, String make, int year){
		this.vin = vin;
		this.make = make;
		this.year = year;
	}
	
	
	public String getVin(){
		return vin;
		
	}
	
	public String getMake(){
		return make;
	}
	
	
	
}

