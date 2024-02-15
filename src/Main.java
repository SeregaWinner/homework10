public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] pay = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < pay.length; i++) {
            sum += pay[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();


        System.out.println("Задание 2");
        int maxPay = pay[0];
        int minPay = pay[0];
        for (int i = 0; i < pay.length; i++) {
            if (maxPay < pay[i]) {
                maxPay = pay[i];
            }
            if (minPay > pay[i]) {
                minPay = pay[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " рублей. Максимальная сумма трат за день составила " + maxPay + " рублей");
        System.out.println();


        System.out.println("Задание 3");
        double average = 0;
        for (int i = 0; i < pay.length; i++) {
            average += pay[i] / pay.length;
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n", average);
        System.out.println();

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        //for (int i = 0; i < reverseFullName.length / 2; i++) {
        //    char midle = reverseFullName[i];
        //    reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
        //    reverseFullName[reverseFullName.length - i - 1] = midle;
        //}
        //System.out.println(reverseFullName);
    }
}