package ru.sp1inter.app;

public class Test1 {
  /**
     * ����� ������ �������
     * ����� ����� a � b ���������� �� 200,
     * ����� ������ 34�,
     * � ������ "�"
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
