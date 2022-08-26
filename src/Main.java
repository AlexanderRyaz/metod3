public class Main {
    private static int searchYear() {
        int year = 2022;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + "  високосный");
            return year;
        }
        System.out.println(year + "  не високосный");
        return year;
    }


    public static void main(String[] args) {
        searchYear();
    }
}
