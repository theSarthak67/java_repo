
import java.util.Scanner;

public class simpCalc 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {

            boolean running = true;
            while (running) {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int x = sc.nextInt();

            switch(x)
            {
                case 1 -> {
                    System.out.println("enter first number");
                    int a = sc.nextInt();
                    System.out.println("enter second number");
                    int b = sc.nextInt();
                    int add=a+b;
                    System.out.println("Addition is "+add);
                    break;
                }

                case 2 -> {
                    System.out.println("enter first number");
                    int a = sc.nextInt();
                    System.out.println("enter second number");
                    int b = sc.nextInt();
                    int sub=a-b;
                    System.out.println("Subtration is "+sub);
                    break;
                }

                case 3 -> {
                    System.out.println("enter first number");
                    int a = sc.nextInt();
                    System.out.println("enter second number");
                    int b = sc.nextInt();
                    int mul=a*b;
                    System.out.println("Multiplication is "+mul);
                    break;
                }

                case 4 -> {
                    System.out.println("enter first number");
                    int a = sc.nextInt();
                    System.out.println("enter second number");
                    int b = sc.nextInt();
                    if(a==0)
                    {
                        System.out.println("Answer is INFINITY");
                    }
                    else{
                    double divi=a/b;
                    System.out.println("Divition is "+divi);
                    break;
                    }
                }
                case 5 ->
                {
                    System.out.println("Exiting......");
                    running = false;
                    break;
                }

                default -> {
                    System.out.println("Incorrect input");
                }
                }
            }    
        }

    }
}