package com.Oops.Abstract;

public class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("Dog Sounds Like Bow Bow......");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats Food like Biscuits,milk....");
	}

	@Override
	public void walk() {
		System.out.println("Dog can walk and Run");
	}

}
