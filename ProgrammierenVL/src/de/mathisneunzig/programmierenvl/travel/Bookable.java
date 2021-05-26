package de.mathisneunzig.programmierenvl.travel;

import de.mathisneunzig.programmierenvl.NotEnoughSlotsException;

public interface Bookable {
	
	public int freeSlots();
	public boolean book(int slots) throws NotEnoughSlotsException;

}
