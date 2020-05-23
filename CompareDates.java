import java.time.LocalDate;
import java.util.Scanner;

public class CompareDates {
    
        // do something to check if it's leap year
        

    public void calc() {

        int month, day, year;

        Scanner myObj = new 
        Scanner(System.in);

            System.out.print("Month then: ");
            month = myObj.nextInt();
            System.out.print("Day then: ");
            day = myObj.nextInt();
            System.out.print("Year then: ");
            year = myObj.nextInt();

        myObj.close();

        LocalDate dateThen = LocalDate.of(year, month, day);
        LocalDate date = LocalDate.now();

        int differenceOfDays = dateThen.getDayOfMonth() - date.getDayOfMonth();
        int compareDate = dateThen.compareTo(date);
        int compareMonth = date.getMonthValue() - month;
        int compareDay = date.getDayOfMonth() - day;
        int difOfYears = date.getYear() - dateThen.getYear();

        if (differenceOfDays < 0)
            differenceOfDays = date.lengthOfMonth() + differenceOfDays;

        if (compareDate == dateThen.getMonthValue())
            compareDate = 0;

        if (date.isBefore(dateThen)) {
            System.out.print(compareDate + " month(s) and "+ differenceOfDays + " day(s) until then.");

        } else if (date.isAfter(dateThen)){
            System.out.print("It has been " + compareMonth + " month(s), "+ compareDay +" day(s), and "+ difOfYears +" year(s) since then.");
        }

    }

    public void calc2() {

            int month, day, year, month2, day2, year2;

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

            myObj.close();

            LocalDate date = LocalDate.of(year, month, day);

            int differenceOfDays = date.getDayOfMonth() - dateThen.getDayOfMonth();
            int monthOfDateThen = dateThen.getMonthValue();
            int compareDate = date.compareTo(dateThen);
            int difOfYears = year - year2;

            if (differenceOfDays < 0)
                differenceOfDays = date.lengthOfMonth() + differenceOfDays;

            if (compareDate == monthOfDateThen)
                compareDate=0;

            System.out.print(compareDate + " month(s), "+ differenceOfDays + " day(s), and "+ difOfYears +" year(s).");


    }

}

