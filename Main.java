import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CompareDates howManyDays = new CompareDates();
        String input;

        Scanner myObj = new
        Scanner(System.in);

        System.out.print("Enter in 1 or 2, or stop to exit.\n\n1)Compare current date with another date\n2)Compare two dates\n\n");
        input = myObj.nextLine();

        if(input.equals("1")){
            howManyDays.calc();
        } else if(input.equals("2")){
            howManyDays.calc2();
        }
      myObj.close();
    }

}

