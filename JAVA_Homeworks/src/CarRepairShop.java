public class CarRepairShop {
	Car[] repairCar = new Car[100];
	int countCars = 0;
	public int addNewCar(String vin, String make, int year) {
		
		Car temp = new Car(vin, make, year);
		for(int i = 0; i < countCars; i++){
			if(repairCar[i].equals(temp)){
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
		return -7;
	}
	
	public double getRepairCost(int ticketNum) {
		return 23.4;
	}
	
	public double getTotalRepairCosts(String vin) {
		return 29.12;
	}

	public String getWorstCarMake() {
		return "Go-Kart";
	}
	
	public boolean updateRepairCost(int ticketNum, double newCost) {
		return false;
	}
	
	public boolean deleteRepair(int ticketNum) {
		return false;
	}
	
	public boolean deleteAllRepairsForCar(String VIN) {
		return false;
	}
	
	public boolean deleteCarAndRepairs(String VIN) {
		return false;
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
	
	
	
	
	
}
