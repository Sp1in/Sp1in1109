package ru.sp1inter.app;

public class Comp {

    private String name;
    private int discSize;

    public Comp(String name, int discSize) {
        this.name = name;
        this.discSize = discSize;
    }

    public String getName() {
        return name;
    }

    public int getDiscSize() {
        return discSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscSize(int discSize) {
        this.discSize = discSize;
    }

}
