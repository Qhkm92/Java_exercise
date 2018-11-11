package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1, 1, 5,5);

        Dog dog = new Dog("Yorkie",8,2,3,1,2,3,"long silky"  );
        dog.eat();
        dog.walk();
        dog.run();
    }
}
