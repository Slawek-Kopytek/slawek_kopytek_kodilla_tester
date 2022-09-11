public class LeapYear {
    public static void main(String[] args) {
        // The year to check
        int year = 2020;

        //Checking leap year
        if (year%4 == 0) {
            System.out.println(year + " is a leap year!");
        } else if (year%100 == 0) {
            System.out.println(year + " is not a leap year!");
        } else if (year%400 == 0) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }
}
