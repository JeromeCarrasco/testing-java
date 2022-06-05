
import com.example.helloworld.HelloWorld;
import java.util.Scanner;

public class Calculator {

    public void add(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int numberOne = reader.nextInt();
        System.out.println("Enter Second number : ");
        int numberSecond = reader.nextInt();

        System.out.println(" Addition of " +numberOne+ " and "+numberSecond+ " is => "+(numberSecond + numberOne));
    }

    public static void main(String[] args) {
        HelloWorld myNewObj = new HelloWorld();
        myNewObj.myPublicMethod();
        Calculator calObj = new Calculator();
        calObj.add();
    }
}
