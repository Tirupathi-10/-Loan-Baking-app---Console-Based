package com.Oops.Abstract;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Cat Sounds Like Meow Meow.......");

	}

	@Override
	public void eat() {
		System.out.println("Cat eats Rats");
	}

	@Override
	public void walk() {
		System.out.println("Cat Also Walk and Run");
	}

}
