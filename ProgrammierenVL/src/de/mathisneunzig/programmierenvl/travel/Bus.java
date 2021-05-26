package de.mathisneunzig.programmierenvl.travel;

public class Bus extends Vehicle implements Bookable{

	public Bus(LicencePlate l, int seats) {
		super(l, seats);
	}

	@Override
	public int freeSlots() {
		int freeSeats = 0;
		for (boolean b : getSeatMap()) {
			if(b == false) {
				freeSeats++;
			}
		}
		return freeSeats;
	}

	@Override
	public boolean book(int slots) {
		if(freeSlots() < slots) {
			return false;
		}
		
		boolean[] b_map = getSeatMap();
		
		for(int i = 0; i < b_map.length; i++) {
			if(!b_map[i]) {
				b_map[i] = true;
				slots--;
			}
			if(slots == 0)
				break;
		}
		return true;
	}
	
	public void drive() {
		System.out.println("Ich fahre los...");
	}

}
