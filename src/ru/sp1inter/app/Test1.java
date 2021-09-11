package ru.sp1inter.app;

public class Test1 {
  /**
     * медот должен вернуть
     * сумму чисел a и b умноженную на 200,
     * далее отнять 34б,
     * и отнять "а"
     */
    public int doWork(int a, int b) {
        int result;
        /*  */
        result = (a + b) * 200 - 346 - a;
        /*  */
        return result;
    }

    public int doWork1(int a, int b) {
        int sum = a + b;
        sum = sum * 200;
        sum = sum - 346;
        sum = sum - a;
        return sum;
    }
}
