package de.mathisneunzig.programmierenvl;

public class NotEnoughSlotsException extends Exception {

	private static final long serialVersionUID = 571514703146261726L;

    private int freeSlots;
	
	public NotEnoughSlotsException(int needed, int left) {
		super("Es gibt nicht mehr genug Slots. Es sind nur noch "+left+" verf�gbar. Eine Buchung von "+needed+" Slots ist nicht m�glich.");
		this.freeSlots = left;
	}

    public int getFreeSlots(){
        return freeSlots;
    }

}
