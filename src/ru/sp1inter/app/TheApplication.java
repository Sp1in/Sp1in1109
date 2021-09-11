package ru.sp1inter.app;

import ru.sp1inter.java.Door;

public class TheApplication {

    public void startMyApp() {
        Door door = new Door();
        door.setColor("Black");
        door.setHeight(20);
        door.setName("Dubovaya");

        /* print the obg door */
        printDoor(door);

        /* create second constructor of Comp with name and diskSize*/
        Comp dell = new Comp("Dell", 100);
        printComp(dell);
        /* comp change disc size to 253 */
        dell.setDiscSize(253);
        printComp(dell);
        /* increase disk size to 1000 */
        dell.setDiscSize(dell.getDiscSize() + 1000);
        printComp(dell);

        /* decrease disk size to 755 */
        int currentDiscSize = dell.getDiscSize();
        int decreasedDiscSize = currentDiscSize - 755;
        dell.setDiscSize(decreasedDiscSize);
        /* log "Old info" */
        System.out.println("Old info");

        printComp(dell);

        /* create another obj comp2 with name : Aser , and diskSize 1222 */
        Comp acer = new Comp("Acer", 1222);
        printComp(acer);

        /* switch disk sizes between dell and acer */

        int acerSize = acer.getDiscSize();
        int dellSize = dell.getDiscSize();

        acer.setDiscSize(dellSize);
        dell.setDiscSize(acerSize);
        /* log "New info" */
        System.out.println("New info");
        printComp(acer);
        printComp(dell);

        /*  decrease disk size of acer to 755 */

        int diskSizeAcer = acer.getDiscSize() - 755;
        System.out.println("diskSizeAcer = " + diskSizeAcer);

    }

    private void printComp(Comp comp) {
        /* change the log, and print name and disk size  */
        /* add to log __________________ */
        System.out.println("_____________________" + "\n" +
                "discSize of comp is " + comp.getDiscSize() + "\n"
                        + "name of comp is " + comp.getName()
        );
    }

    /* rename to another */
    public void printDoor(Door door) {
        //log out
        System.out.println(
                "My print door.getName() = " + door.getName() + "\n" +
                        "door.getColor() = " + door.getColor() + "\n" +
                        "door.getHeight() = " + door.getHeight()
        );
    }
}
