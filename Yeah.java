import java.time.LocalDate;
import java.util.Scanner;

public class Yeah {
    
        // do something to check if it's leap year

    public void calc() {

        int month;
        int day;
        int year;

        Scanner myObj = new
        Scanner(System.in);
        
            System.out.print("Month then: ");
            month = myObj.nextInt();
            System.out.print("Day then: ");
            day = myObj.nextInt();
            System.out.print("Year then: ");
            year = myObj.nextInt();

        LocalDate dateThen = LocalDate.of(year, month, day);
        LocalDate date = LocalDate.now();

        int monthOfDateThen = dateThen.getMonthValue();
        int dayOfDateThen = dateThen.getDayOfMonth();

        int monthOfDate = date.getMonthValue();
        int dayOfDate = date.getDayOfMonth();

        int differenceOfDays = dayOfDateThen - dayOfDate;
        int h = dateThen.compareTo(date);
        int x = monthOfDate - month;
        int y = dayOfDate - day;
        int difOfYears = date.getYear() - dateThen.getYear();

        if (differenceOfDays < 0)
            differenceOfDays = date.lengthOfMonth() + differenceOfDays;

        if (h==monthOfDateThen)
            h = 0;


        if (date.isBefore(dateThen)) {
            System.out.print(h + " month(s) and "+ differenceOfDays + " day(s) until then.");

        } else if (date.isAfter(dateThen)){
            System.out.print("It has been " + x + " month(s), "+ y +" day(s), and "+difOfYears+" year(s) since then.");
        }

    }

    public void calc2() {

        int month;
        int day;
        int year;
        int month2;
        int day2;
        int year2;

        Scanner myObj = new
        Scanner(System.in);
        
            System.out.print("Month then: ");
            month2 = myObj.nextInt();
            System.out.print("Day then: ");
            day2 = myObj.nextInt();
            System.out.print("Year then: ");
            year2 = myObj.nextInt();

            LocalDate dateThen = LocalDate.of(year2, month2, day2);

            System.out.print("\nMonth: ");
            month = myObj.nextInt();
            System.out.print("Day: ");
            day = myObj.nextInt();
            System.out.print("Year: ");
            year = myObj.nextInt();

            LocalDate date = LocalDate.of(year, month, day);

            int dayOfDateThen = dateThen.getDayOfMonth();
            int dayOfDate = date.getDayOfMonth();
            int differenceOfDays = dayOfDate - dayOfDateThen;

            int monthOfDateThen = dateThen.getMonthValue();
            int h = date.compareTo(dateThen);
            int difOfYears = year - year2;

            if (differenceOfDays < 0)
                differenceOfDays = date.lengthOfMonth() + differenceOfDays;

            if (h==monthOfDateThen)
                h=0;

            System.out.print(h + " month(s), "+ differenceOfDays + " day(s), and "+ difOfYears+" year(s).");


    }

}

