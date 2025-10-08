import java.util.Scanner;

public class CalendarDisplay {

  
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

   
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static String getMonthName(int month) {
        return months[month - 1];
    }

  
    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }


    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0; 
    }

    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

    
        System.out.println("     " + monthName + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        
        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day);

            
            if (((day + firstDay) % 7 == 0) || day == days) {
                System.out.println();
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);

        sc.close();
    }
}
