import java.time.LocalDate;

public class Main {
    private static int choosingVersion() {
        int phoneOS = 1;
        int currentYear = LocalDate.now().getYear();
        if (phoneOS == 0 && currentYear >= 2015) {
            System.out.println("По ссылке вы можете установить версию для iOS");
        } else {
            if (phoneOS == 0 && currentYear <= 2015) {
                System.out.println("Установите Lite версию для iOS по ссылке");
            }
        }
        if (phoneOS == 1 && currentYear >= 2015) {
            System.out.println("По ссылке вы можете установить версию для Android");
        } else {
            if (phoneOS == 1 && currentYear <= 2015) {
                System.out.println("Установите Lite версию для Android по ссылке");
            }
        }
        return phoneOS;
    }
    public static void main(String[] args) {
        choosingVersion();
    }
}