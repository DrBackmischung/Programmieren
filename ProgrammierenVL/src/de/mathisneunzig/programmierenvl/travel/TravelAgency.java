package de.mathisneunzig.programmierenvl.travel;

import de.mathisneunzig.programmierenvl.NotEnoughSlotsException;

public class TravelAgency {
	
	public static void main(String[] args) {
		Bookable[] b = new Bookable[3];
		b[0] = new Airplane(new LicencePlate("AMX", 100420), 100);
		b[1] = new Airplane(new LicencePlate("BOE", 100420), 200);
		b[2] = new Bus(new LicencePlate("HD", "MN", 210), 24);
		try {
		
			System.out.println("Im Flugzeug "+((Vehicle) b[0]).getLicencePlate()+" hat "+((Bookable) b[0]).freeSlots()+" freie Sitzplätze.");
			System.out.println("15 \tTickets werden gebucht. \tBuchung möglich: "+b[0].book(15)+ " \t Das Flugzeug hat noch "+((Bookable) b[0]).freeSlots()+" freie Sitzplätze.");
			System.out.println("20 \tTickets werden gebucht. \tBuchung möglich: "+b[0].book(20)+ " \t Das Flugzeug hat noch "+((Bookable) b[0]).freeSlots()+" freie Sitzplätze.");
			System.out.println("4 \tTickets werden gebucht. \tBuchung möglich: "+b[0].book(4)+ " \t Das Flugzeug hat noch "+((Bookable) b[0]).freeSlots()+" freie Sitzplätze.");
			System.out.println("100 \tTickets werden gebucht. \tBuchung möglich: "+b[0].book(100)+ " \t Das Flugzeug hat noch "+((Bookable) b[0]).freeSlots()+" freie Sitzplätze.");
			System.out.println("37 \tTickets werden gebucht. \tBuchung möglich: "+b[0].book(37)+ " \t Das Flugzeug hat noch "+((Bookable) b[0]).freeSlots()+" freie Sitzplätze.");
			System.out.println("70 \tTickets werden gebucht. \tBuchung möglich: "+b[0].book(70)+ " \t Das Flugzeug hat noch "+((Bookable) b[0]).freeSlots()+" freie Sitzplätze.");
			((Airplane) b[0]).fly();
			
			System.out.println("Im Flugzeug "+((Vehicle) b[1]).getLicencePlate()+" hat "+((Bookable) b[1]).freeSlots()+" freie Sitzplätze.");
			System.out.println("150 \tTickets werden gebucht. \tBuchung möglich: "+b[1].book(150)+ " \t Das Flugzeug hat noch "+((Bookable) b[1]).freeSlots()+" freie Sitzplätze.");
			System.out.println("200 \tTickets werden gebucht. \tBuchung möglich: "+b[1].book(200)+ " \t Das Flugzeug hat noch "+((Bookable) b[1]).freeSlots()+" freie Sitzplätze.");
			System.out.println("4 \tTickets werden gebucht. \tBuchung möglich: "+b[1].book(4)+ " \t Das Flugzeug hat noch "+((Bookable) b[1]).freeSlots()+" freie Sitzplätze.");
			((Airplane) b[1]).fly();
			
			System.out.println("Im Bus "+((Vehicle) b[2]).getLicencePlate()+" hat "+((Bookable) b[2]).freeSlots()+" freie Sitzplätze.");
			System.out.println("16 \tTickets werden gebucht. \tBuchung möglich: "+b[2].book(16)+ " \t Das Flugzeug hat noch "+((Bookable) b[2]).freeSlots()+" freie Sitzplätze.");
			System.out.println("16 \tTickets werden gebucht. \tBuchung möglich: "+b[2].book(16)+ " \t Das Flugzeug hat noch "+((Bookable) b[2]).freeSlots()+" freie Sitzplätze.");
			System.out.println("8 \tTickets werden gebucht. \tBuchung möglich: "+b[2].book(8)+ " \t Das Flugzeug hat noch "+((Bookable) b[2]).freeSlots()+" freie Sitzplätze.");
			System.out.println("2 \tTickets werden gebucht. \tBuchung möglich: "+b[2].book(2)+ " \t Das Flugzeug hat noch "+((Bookable) b[2]).freeSlots()+" freie Sitzplätze.");
			((Bus) b[2]).drive();
			
		} catch (NotEnoughSlotsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ende!");
		}
	}
	
}
