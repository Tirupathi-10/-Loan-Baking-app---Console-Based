package com.Oops.Abstract;

public class Animalnfo {

	public static void main(String[] args) {
		System.out.println("Welcome to Animal Park");
		System.out.println();
		System.out.println("-------Dog Info------");
		Animal d = new Dog();
		d.sound();
		d.eat();
		d.walk();
		System.out.println();
		System.out.println("-------Cat Info------");
		Animal c = new Cat();
		c.sound();
		c.eat();
		c.walk();
	}

}
