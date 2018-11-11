package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("west" );
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("north");
        Wall wall4 = new Wall("south");

        Ceiling ceiling = new Ceiling(10, 55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 1);

        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }
}
