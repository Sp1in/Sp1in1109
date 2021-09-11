package ru.sp1inter.start;

import ru.sp1inter.java.Door;

public class Main {

        public static void main(String[] args) {

            Door door = new Door();
            door.setColor("Black");
            door.setHeight(20);
            door.setName("Dubovaya");

            System.out.println("door.getName() = " + door.getName());
            System.out.println("door.getColor() = " + door.getColor());
            System.out.println("door.getHeight() = " + door.getHeight());

    }

}
