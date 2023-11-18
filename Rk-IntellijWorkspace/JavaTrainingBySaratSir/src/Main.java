public class Main {
    public void method1(int... a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res += a[i];
        }
        System.out.println(res);
    }

    public void method2(int a) {
        System.out.println(a);
    }

    public void method2(int a, int b) {

    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        Main m1 = new Main();
        m1.method1(10);
        m1.method1(10, 20, 30, 40, 50, 60, 70, 80, 90);
        m1.method1(10, 20, 80);

    }

}