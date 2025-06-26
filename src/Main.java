import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        int a = myObj.nextLine();
        int b = myObj.nextInt();
        Process ob1 = new Process(a,b);
        ob1.add();
        ob1.sub();
        ob1.mul();
    }
}