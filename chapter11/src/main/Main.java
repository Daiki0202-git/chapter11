package main;

import enemy.Matango;
import profession.Dancer;

public class Main {
	public static void main(String[] args) {
		Dancer d = new Dancer();
		Matango m = new Matango("マタンゴ", 59);
		
		
		
		d.dance();
		d.attack(m);
	}

}
