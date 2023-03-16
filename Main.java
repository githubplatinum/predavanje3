import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputArray = new ArrayList<Integer>();

        boolean notNeagtive = false;
        int number ;
        while (!notNeagtive)
        {

            try {
                System.out.println("Enter an integer: ");
                number = scanner.nextInt();
                if(number ==0)
                    continue;
                if (number < 0 )
                {notNeagtive=true;}
                else {
                    if(number %2 == 0)
                        inputArray.add(number);
                }

              /*  if (number > 7)
                    do {
                        number -=  7;
                    }
                    while (number > 7); */

            //Problem:  Unos 15, 22, 29..itd ne vraca broja dana u tjednu
            //Rijesenje: 'number > 7' a ne 'number > 8'

                switch (number%7) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
            }

            catch(InputMismatchException e) {
                System.out.println("Invalid input, please enter a integer.");
                scanner.next();
                // Program zaglavi u petlji i vraca neprestalno 'Invalid input, please enter a integer.'
                // Rijesenje: dodati  'scanner.next();'
            }
        }


        int suma = 0;
        for (int i = 0; i < inputArray.size(); i++)
        {
            suma += inputArray.get(i);
        }
        System.out.println("Sum of even numbers is: " + suma);


    }
}
