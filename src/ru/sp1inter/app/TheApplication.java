package ru.sp1inter.app;

import ru.sp1inter.models.Comp;

public class TheApplication {

    public void startMyApp() {
        Comp x = new Comp("x-comp", 12);
        Comp y = new Comp("y-comp", 33);
        Comp z = new Comp("z-comp", 2232);
        Comp t = new Comp("t-comp", 1);


        Comp bigger = findMaxComp(x, y);
        System.out.println("Big comp:" + bigger.getName());
        Comp smaller = findMinComp(x, y);
        System.out.println("Smaller comp:" + smaller.getName());
        int diff = diffSizeOfComps(x, y);
        System.out.println("diff:" + diff);
        diff = diffSizeOfComps(y, x);
        System.out.println("diff:" + diff);

        diff = diffSizeOfCompsNick(x, y);
        System.out.println("diffNick:" + diff);
        diff = diffSizeOfCompsNick(y, x);
        System.out.println("diffNick:" + diff);
    }

//     /**
//      * метод должен вернуть сумму  -чисел- размеров дисков деленную на 300 и умноженную на 1000, отнять b
//      */
//     public double work(Comp x, Comp y, int numberCode) {
//         if (numberCode == 0) {
//             return 10;
//         }
//         return x.getDiscSize() - y.getDiscSize();
//     }

//     /**
//      * метод должен вернуть размер большего диска
//      */
//     public double work(Comp a, Comp b) {
//         int max;
//
//         if (a.getDiscSize() < b.getDiscSize()) {
//             max = b.getDiscSize();
//         } else {
//             max = a.getDiscSize();
//         }
//
//         return max;
//     }

    /* метод должен называться work
    и должен вернуть String т.е имя(большего по размеру компа)*/
    public String work(Comp first, Comp second) {

        Comp max;

        if (first.getDiscSize() > second.getDiscSize()) {
            max = first;
        } else {
            max = second;
        }

        return max.getName();
    }

    /* метод должен называться findMaxComp
        и должен вернуть больший по размеру комп*/
    public Comp findMaxComp(Comp a, Comp b) {
        Comp big;
        if (a.getDiscSize() > b.getDiscSize()) {
            big = a;
        } else {
            big = b;
        }

        return big;
    }

    /* метод должен называться findMinComp
           и должен вернуть меньший по размеру комп*/
    public Comp findMinComp(Comp a, Comp b) {
        Comp min;
        if (a.getDiscSize() < b.getDiscSize()) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    /* метод должен называться diffSizeOfComps
                  и должен вернуть разность размеров большего от меньшего компов х & y */
    public int diffSizeOfComps(Comp x, Comp y) {
        int diff;
        if (x.getDiscSize() < y.getDiscSize()) {
            diff = y.getDiscSize() - x.getDiscSize();
        } else {
            diff = x.getDiscSize() - y.getDiscSize();
        }
        return diff;
    }

    public int diffSizeOfCompsNick(Comp x, Comp y) {
        Comp max = findMaxComp(x,y);
        Comp min = findMinComp(x,y);
        return max.getDiscSize() - min.getDiscSize();
    }
}
