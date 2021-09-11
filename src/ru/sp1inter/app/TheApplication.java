package ru.sp1inter.app;

import ru.sp1inter.java.Door;

public class TheApplication {

    public void startMyApp() {
        Door door = new Door();
        door.setColor("Black");
        door.setHeight(20);
        door.setName("Dubovaya");


    }

    public void door (Door door){
       //log out
        System.out.println("door.getName() = " + door.getName());
        System.out.println("door.getColor() = " + door.getColor());
        System.out.println("door.getHeight() = " + door.getHeight());
    }
}
