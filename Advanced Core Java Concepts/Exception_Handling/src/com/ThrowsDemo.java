package com;

class Team1 {

	public int div(int num1, int num2) throws Exception {

		int res = 0;

		try {
			res = num1 / num2;
		} finally {
			System.out.println("Final Work");
		}

		return res;

	}

}

class Team2 {

	public void arith() {

		int num1 = 12;
		int num2 = 0;

		try {
			Team1 team1 = new Team1();
			int divRes = team1.div(num1, num2);
			System.out.println("Team 2: Result:" + divRes);
			System.out.println("Thank You..Team1");
		} catch (Exception e) {
			System.out.println("Exception: handled By Team2 Obj's Behav");
		}
	}

}

public class ThrowsDemo {

	public static void main(String[] args) {

		Team2 team2 = new Team2();
		team2.arith();

	}

}
