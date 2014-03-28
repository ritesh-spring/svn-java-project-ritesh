package org.ritesh;

class Animal {
	public void printAn() {
		System.out.println("I am Animal");
	}
}

class Dog extends Animal {
	public void printAn() {
		System.out.println("I am Dog");
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
        Animal a=new Animal();
		// All Dogs are Animal hence upcasting is fine.
		Animal a1 = d; // upcast ok with no explicit cast
		a1.printAn();
		Animal a2 = (Animal) a; // upcast ok with an explicit cast
		a2.printAn();
	}
}
