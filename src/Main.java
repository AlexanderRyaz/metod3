public class Main {
    private static int countingDaysDelivery(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            return deliveryDay;
        } else {
            int count = (deliveryDistance - 20) / 40;
            deliveryDay += count;
            if ((deliveryDistance - 20) % 40 != 0) {
                deliveryDay++;
            }
        }
        return deliveryDay;
    }

    public static void main(String[] args) {
        int daysDelivery = countingDaysDelivery(101);
        System.out.println(daysDelivery);
    }
}