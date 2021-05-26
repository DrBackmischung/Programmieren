package de.mathisneunzig.programmierenvl.travel;

import de.mathisneunzig.programmierenvl.NotEnoughSlotsException;

public class Airplane extends Vehicle implements Bookable{

	public Airplane(LicencePlate l, int seats) {
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
	public boolean book(int slots) throws NotEnoughSlotsException{
		if(freeSlots() < slots) {
			throw new NotEnoughSlotsException(slots, freeSlots());
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
	
	public void fly() {
		System.out.println("Ich fliege los...");
	}

}
