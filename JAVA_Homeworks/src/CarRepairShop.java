public class CarRepairShop {
	public int addNewCar(String vin, String make, int year) {
		return -8;
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
