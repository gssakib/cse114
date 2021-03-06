/*
 * Name: Gazi Sakib 
 * SBU ID - 109849940 
 * Course No. - CSE 114 
 * Assignment Name - HW 6
 */

public class CarRepairShop {
	Car[] repairCar = new Car[100];
	int countCars = 0;

	Ticket[] repairTicket = new Ticket[1];
	int ticketNo = 0;

	public int addNewCar(String vin, String make, int year) {

		Car temp = new Car(vin, make, year);
		for (int i = 0; i < countCars; i++) {
			try {
				if (repairCar[i].getVin().equals(temp.getVin())) {
					return -1;
				}
			} catch (NullPointerException e) {
				continue;
			}

		}
		if (countCars + 1 == repairCar.length) {
			Car[] dummyRef = new Car[2 * repairCar.length];
			for (int i = 0; i < repairCar.length; i++) {
				try {
					dummyRef[i] = repairCar[i];
				} catch (NullPointerException e) {
					continue;
				}

			}
			repairCar = dummyRef;
		}

		repairCar[countCars++] = temp;
		// System.out.println(repairCar[countCars-1].getVin());
		return countCars;
	}

	public int addRepairTicket(String vin, double cost, String description) {
		int vinMatch = 0;

		if (ticketNo + 1 == repairTicket.length) {
			Ticket[] dummyRef = new Ticket[2 * repairTicket.length];
			for (int i = 0; i < repairTicket.length; i++) {
				try {
					dummyRef[i] = repairTicket[i];
				} catch (NullPointerException e) {
					continue;
				}

			}
			repairTicket = dummyRef;
		}

		for (int i = 0; i < countCars; i++) {
			try {
				if (repairCar[i].getVin().equals(vin)) {
					vinMatch++;

				}
			} catch (NullPointerException e) {
				continue;
			}

		}

		if (vinMatch == 1) {

			Ticket tempTicket = new Ticket(vin, cost, description);
			repairTicket[ticketNo++] = tempTicket;
			// ticketNo++;
			return ticketNo;

		} else {

			return -1;
		}

	}

	public double getRepairCost(int ticketNum) {
		if (ticketNo >= ticketNum && ticketNum > 0) {
			try {
				return repairTicket[ticketNum - 1].getCost();
			} catch (NullPointerException e) {

				return -1;
			}

		} else {
			return -1;
		}

	}

	public double getTotalRepairCosts(String vin) {
		double sum = 0;
		for (int i = 0; i < ticketNo; i++) {

			try {
				if (repairTicket[i].getVin().equals(vin)) {

					sum += repairTicket[i].getCost();

				}
			} catch (NullPointerException e) {

				return -1;
			}

		}
		if (sum == 0) {
			return -1.0;
		} else {
			return sum;
		}

	}

	public String getWorstCarMake() {
		int biggestCountIndex = 0;
		String maxVin = "";
		int[] arryCount = new int[ticketNo];

		if (countCars == 0 || ticketNo == 0) {
			return null;
		}
		for (int i = 0; i < ticketNo; i++) {
			int wCount = 0;

			try {
				for (int j = 0; j < ticketNo; j++) {
					try {
						if (repairTicket[i].getVin().equals(
								repairTicket[j].getVin()))
							wCount++;
					} catch (NullPointerException e) {
						continue;
					}

				}
				arryCount[i] = wCount;
			} catch (NullPointerException e) {
				continue;
			}

		}

		for (int i = 1; i < arryCount.length; i++) {
			try {
				if (arryCount[i] > arryCount[i - 1]) {
					biggestCountIndex = i;
				}

			} catch (NullPointerException e) {
				continue;
			}

		}

		maxVin = repairTicket[biggestCountIndex].getVin();
		for (int i = 0; i < repairCar.length; i++) {
			try {
				if (repairCar[i].getVin().equals(maxVin)) {
					return repairCar[i].getMake();
				}
			} catch (NullPointerException e) {
				continue;
			}

		}

		return null;
	}

	public boolean updateRepairCost(int ticketNum, double newCost) {
		for (int i = 0; i < ticketNo; i++) {
			if (ticketNum == i + 1) {
				try {
					repairTicket[i].setCost(newCost);
					return true;
				} catch (NullPointerException e) {
					continue;
				}

			}

		}

		return false;
	}

	public boolean deleteRepair(int ticketNum) {

		for (int i = 0; i < ticketNo; i++) {

			try {
				if (ticketNum == i + 1) {
					repairTicket[i] = null;

					return true;
				}

			} catch (NullPointerException e) {
				return false;

			}

		}
		return false;
	}

	public boolean deleteAllRepairsForCar(String VIN) {
		int count = 0;
		for (int i = 0; i < ticketNo; i++) {

			try {
				if (repairTicket[i].getVin().equals(VIN)) {
					repairTicket[i] = null;
				}

				count++;

			} catch (NullPointerException e) {
				continue;

			}

		}

		if (count > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteCarAndRepairs(String VIN) {
		boolean condition = false;
		boolean dummy = false;
		for (int i = 0; i < countCars; i++) {

			try {
				if (VIN.equals(repairCar[i].getVin())) {
					repairCar[i] = null;

					condition = true;
				}

			} catch (NullPointerException e) {
				continue;

			}

		}
		dummy = deleteAllRepairsForCar(VIN);
		if (condition == true) {
			return condition;
		} else {
			return condition;
		}
	}

}

class Ticket {

	private String vin;
	private String des;
	private double cost;

	public Ticket(String vin, double cost, String des) {

		this.vin = vin;
		this.cost = cost;
		this.des = des;

	}

	public String getVin() {

		return vin;

	}

	public double getCost() {

		return cost;

	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getDes() {

		return des;

	}

}

class Car {

	private String vin;
	private String make;
	private int year;

	public Car(String vin, String make, int year) {
		this.vin = vin;
		this.make = make;
		this.year = year;
	}

	public String getVin() {
		return vin;

	}

	public String getMake() {
		return make;
	}

	public int getYear() {
		return year;
	}
}
