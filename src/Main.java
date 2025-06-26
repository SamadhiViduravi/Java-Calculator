import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first value ");
        int a = myObj.nextInt();
        System.out.println("Enter second value ");
        int b = myObj.nextInt();
        Process ob1 = new Process(a,b);
        ob1.add();
        ob1.sub();
        ob1.mul();
    }
}