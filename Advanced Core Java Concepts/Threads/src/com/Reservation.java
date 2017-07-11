package com;

class Operator extends Thread {

	int noOfSeats = 1;
	int wanted;

	public Operator(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {
		bookTicket();
	}

	public void bookTicket() {
		String name = Thread.currentThread().getName();
		System.out.println("Available Seats are: " + noOfSeats);
		
		synchronized (this) {
			System.out.println("Trying to Book " + wanted + " seats for " + name);
			if (wanted <= noOfSeats) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				noOfSeats = noOfSeats - wanted;
				System.out.println(wanted + " Seats Booked for " + name);
			} else {

				System.out.println("Sorry. No Seats are available to book");
			}
		} // end of sync block
		
	/*	System.out.println("---- Try after some time");
		
		synchronized (this) {
			System.out.println("--- current Passenger: "+name);
			try {
				System.out.println("--- Processing "+name);
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}

	}



public class Reservation {

	public static void main(String[] args) {

		Operator op = new Operator(1);

		Thread p1 = new Thread(op, "Passenger-1");
		Thread p2 = new Thread(op, "Passenger-2");

		p1.start();
		p2.start();

	}

}
