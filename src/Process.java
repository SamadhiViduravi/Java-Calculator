public class Process {
    int input_1;
    int input_2;

    public Process(int a, int b) {
        input_1 = a;
        input_2 = b;
    }
    public void add() {
        int sum = input_1 + input_2;
        System.out.println("sum = " + sum);
    }
    public void sub() {
        int sub = input_1 - input_2;
        System.out.println("sub = " + sub);
    }
    public void mul() {
        int mul = input_1 * input_2;
    }
}
