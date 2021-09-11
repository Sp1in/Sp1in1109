package ru.sp1inter.app;

public class TheApplication {

    public void startMyApp() {
        /* создать объект класса Comp, c названием acer с размером 1000 */
        Comp acer = new Comp("acer", 1000);
        /* создать переменную dell с размером 2000 */
        Comp dell = new Comp("dell", 2000);
        /* вывести результат команды 1 */
        Comp comp1 = findBiggestComp(dell,acer);
        System.out.println("Result 1:" + comp1.getName());
        /* вывести результат команды 2 */
        Comp comp2 = findSmalledComp(dell,acer);
        System.out.println("Result 2:" + comp2.getName());
        /* вывести результат команды 3 */
        String comp3 = findSmalledCompName(dell,acer);
        System.out.println("Result 3:" + comp3);
        /* вывести результат команды 4 */
        String comp4 = findBiggestCompName(dell,acer);
        System.out.println("Result 4:" + comp4);
        /* вывести результат команды 5 */
        int comp5 = findSmalledCompSize(dell,acer);
        System.out.println("Result 5:" + comp5);
        /* вывести результат команды 6 */
        int comp6 = findBiggestCompSize(dell,acer);
        System.out.println("Result 6:" + comp6);
    }


    /* метод должен вернуть больший из 2х компов*/
    public Comp findBiggestComp(Comp a, Comp b) {
        Comp biggest;
        if (a.getDiscSize() < b.getDiscSize()) {
            biggest = b;
        } else {
            biggest = a;
        }
        return biggest;
    }

    /* метод должен вернуть меньший из 2х компов*/
    public Comp findSmalledComp(Comp z, Comp x) {
        Comp smalled;
        if (z.getDiscSize() < x.getDiscSize()) {
            smalled = z;
        } else {
            smalled = x;
        }
        return smalled;
    }

    /* метод должен вернуть имя меньшего из 2х компов*/
    public String findSmalledCompName(Comp a, Comp b) {
        Comp smalledComp = findSmalledComp(a, b);
        String name = smalledComp.getName();
        return name;
    }

    /* метод должен вернуть имя большего из 2х компов*/
    public String findBiggestCompName(Comp z, Comp x) {
        Comp biggestComp = findBiggestComp(z, x);
        String name = biggestComp.getName();
        return name;
    }

    /* метод должен вернуть размер меньшего из 2х компов*/
    public int findSmalledCompSize(Comp a, Comp b) {
        Comp smalledComp = findSmalledComp(a, b);
        int size = smalledComp.getDiscSize();
        return size;
    }

    /* метод должен вернуть размер большего из 2х компов*/
    public int findBiggestCompSize(Comp a, Comp b) {
        Comp biggetComp = findBiggestComp(a, b);
        int size = biggetComp.getDiscSize();
        return size;
    }

}
