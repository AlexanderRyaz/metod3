public class Main {
    private static void countingDaysDelivery() {
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }

        if (deliveryDistance > 60) {
            deliveryDay++;
        }
    }
    public static void main(String[] args) {
        countingDaysDelivery();
    }
}