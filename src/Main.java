public class Main {

    public static void printIsYear(int year) {

        if (year > 1584 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void scheckLeapYear(int nowClientOS, int nowClientDeviceYear) {
        if (nowClientOS == 0 && nowClientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (nowClientOS == 0 && nowClientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else if (nowClientOS == 1 && nowClientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (nowClientOS == 1 && nowClientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        } else {
            System.out.println("Неизвестная операционная система.");
        }
    }

    public static int distanceTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            return 2;
        } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2024;
        printIsYear(year);
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2021;
        scheckLeapYear(clientOS, clientDeviceYear);
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int days = distanceTime(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days + " + срок доставки.");
        } else {
            System.out.println("Доставки нет.");
        }
    }
}