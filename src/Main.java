public class Main {
    public static void printIsYear(int year) {

        if (year > 1584 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void selectsTheAppVersion(int nowClientOS, int nowClientDeviceYear) {
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
    public static int  deliveryCard (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 + срок доставки");
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            System.out.println("Потребуется дней: 2 + срок доставки");
        } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
            System.out.println("Потребуется дней: 3 + срок доставки");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        return deliveryDistance;
    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2024;
        printIsYear(year);
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2021;
        selectsTheAppVersion(clientOS,clientDeviceYear);
        System.out.println("Задача 3");
        int deliveryDistance = 90 ;
        deliveryCard(deliveryDistance);
    }
}
