import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Arithmetic {

    private static final Logger logger = LogManager.getLogger(Arithmetic.class);
//    static Scanner sc;
    public Arithmetic() {

    }
    public static void arithmetic()
    {
//        Arithmetic calculator = new Arithmetic();
        double number1, number2;
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Arithmetic-DevOps, Choose to perform operation");
        System.out.print("Press 1 to find factorial\nPress 2 to find Square root\nPress 3 to find power\nPress 4 to find natural logarithm\n" +

                "Press 5 to find add\nPress 6 to find subtract\nPress 7 to find multiplication\nPress 8 to exit\nEnter your choice: ");
        int choice;
//        try
//        {
//            choice = scanner.nextInt();
//        }
//        catch (InputMismatchException error)
//        {
//            return;
//        }
//        switch (choice)
//        {
//            case 1:
//                // do factorial
//                System.out.print("Enter a number : ");
//                number1 = scanner.nextDouble();
////                System.out.println("Factorial of "+number1+" is : ");
//                calculator.factorial(number1);
//                System.out.println("\n");
//
//                break;
//            case 2:
//                // find square root
//                System.out.print("Enter a number : ");
//                number1 = scanner.nextDouble();
////                System.out.println("Square root of "+number1+" is : ");
//                calculator.sqroot(number1);
//                System.out.println("\n");
//
//
//                break;
//            case 3:
//                // find power
//                System.out.print("Enter the first number : ");
//                number1 = scanner.nextDouble();
//                System.out.print("Enter the second number : ");
//                number2 = scanner.nextDouble();
////                System.out.println(number1+ " raised to power "+number2+" is : ");
//                calculator.power(number1, number2);
//                System.out.println("\n");
//                break;
//            case 4:
//                // find natural log
//                System.out.print("Enter a number : ");
//                number1 = scanner.nextDouble();
////                System.out.println("Natural log of "+number1+" is : ");
//                calculator.naturalLog(number1);
//                System.out.println("\n");
//                break;
//            case 5:
//                // find addition
//                System.out.print("Enter the first number : ");
//                number1 = scanner.nextDouble();
//                System.out.print("Enter the second number : ");
//                number2 = scanner.nextDouble();
//                System.out.println("Addition of these numbers is ");
//                calculator.add(number1, number2);
//                System.out.println("\n");
//                break;
//            case 6:
//                // find subtraction
//                System.out.print("Enter the first number : ");
//                number1 = scanner.nextDouble();
//                System.out.print("Enter the second number : ");
//                number2 = scanner.nextDouble();
//                System.out.println("Subtraction of these numbers is ");
//                calculator.sub(number1, number2);
//                System.out.println("\n");
//                break;
//            case 7:
//                // find multiplication
//                System.out.print("Enter the first number : ");
//                number1 = scanner.nextDouble();
//                System.out.print("Enter the second number : ");
//                number2 = scanner.nextDouble();
//                System.out.println("Multiplication of these numbers is ");
//                calculator.mul(number1, number2);
//                System.out.println("\n");
//                break;
//            case 8:
//                // find division
//                System.out.print("Enter the first number : ");
//                number1 = scanner.nextDouble();
//                System.out.print("Enter the second number : ");
//                number2 = scanner.nextDouble();
//                System.out.println("Division of these numbers is ");
//                calculator.div(number1, number2);
//                System.out.println("\n");
//                break;
//            default:
//                System.out.println("Exiting....");
//                return;
//        }
    }

    public static void main(String[] args)
    {

//        Arithmetic calculator = new Arithmetic();
//        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        int calcType;
        do
        {
            System.out.println("Choose the type of calculation");
            System.out.println("1.Arithmetic");
            System.out.println("2.Matrix operations");
            System.out.println("3.Number System");
            System.out.println("4.Temperature Conversion");
            System.out.println("5.Exit");
            System.out.print("Enter your input : ");
//            calcType = scanner.nextInt();

//            if(calcType<1 && calcType>4)
//            {
//                System.out.println("Enter correct input. Else press 5 to exit");
//            }
//            else if(calcType==5)
//            {
//                break;
//            }
//
//            else if(calcType==1)
//            {
//                arithmetic();
//            }
//            else if(calcType==2)
//            {
//                matrix();
//            }
//            else if(calcType==3)
//            {
//                Scanner input = new Scanner(System.in);
//                System.out.println("Choose input type");
//                System.out.println("1.Decimal...2.Hexadecimal...3.Octal");
//                int n = input.nextInt();
//                System.out.println("Enter the number");
//                String number = input.next();
//                numberSystem(n, number);
//            }
//            else if(calcType==4)
//            {
//                Scanner scannerObject = new Scanner(System.in);
//                System.out.println("Enter Original Temperature:");
//                double temp = scannerObject. nextDouble();
//
//                Scanner UserInput = new Scanner(System.in);
//                System.out.println("Enter your current unit (F/C/K):");
//                String fromUnit = UserInput.next();
//                System.out.println("Enter unit to convert to (F/C/K):");
//                String toUnit = UserInput.next();
//                String result = convertTemperature(toUnit, fromUnit, temp);
//            }

        } while (true);
    }

    long simpleInterest(long p, long r, long t)
    {
        if(t!=0 && r!=0) {
            long SI = (p * t * r) / 100;
            return SI;
        }
        return 0;
    }

//    long compoundInterest(long p, long r, long t)
//    {
//        if(t!=0 && r!=0) {
//            long amount = p * (long) (Math.pow((1 + r / 100), t)) - p ;
////            System.out.println(CI);
//            return amount;
//        }
//        return 0;
//    }




    double add(double number1, double number2)
    {
        logger.info("[ADDITION OF - " + number1 + " AND] " + number2);
        double result = number1 + number2;
        logger.info("[RESULT - ADDITION] - " + result);
        return result;
    }

    double sub(double number1, double number2)
    {
        logger.info("[SUBTRACTION OF - " + number1 + " AND] " + number2);
        double result = number1 - number2;
        logger.info("[RESULT - SUBTRACTION] - " + result);
        return result;
    }

    double mul(double number1, double number2)
    {
        logger.info("[MULTIPLICATION OF - " + number1 + " AND] " + number2);
        double result = number1 * number2;
        logger.info("[RESULT - MULTIPLICATION] - " + result);
        return result;
    }

    public double div(double number1,double number2)
    {
        logger.info("[DIVISION OF - " + number1 + " AND] " + number2);
        double result = 0;
        try
        {
            if (number2 == 0 )
            {
                result = Double.NaN;
                throw new ArithmeticException("Case of Division by zero exception");
            }
            else
            {
                result = number1/number2;
            }
        }
        catch (ArithmeticException error)
        {
            System.out.println("[EXCEPTION - DIVISION] - Cannot divide when denominator is zero " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - DIVISION] - " + result);
        return result;
    }


    public static double factorial(double number1)
    {
        logger.info("[FACTORIAL] - " + number1);
        double result = fact(number1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double sqroot(double number1)
    {
        logger.info("[SQ ROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }

    public static double square(double num)
    {
        return (num*num);

    }

    public static double cuberoot(double num)
    {
        return Math.cbrt(num);
    }

    public static double cube(double num)
    {
        return (num*num*num);
    }

    public double power(double number1, double number2)
    {
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public static double fact(double num)
    {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        {
            facto *= i;
        }
        return  facto;
    }

    public double naturalLog(double number1)
    {
        logger.info("[NATURAL LOG] - " + number1);
        double result = 0;
        try
        {

            if (number1 <0 )
            {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else
            {
                result = Math.log(number1);
            }
        }
        catch (ArithmeticException error)
        {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

}