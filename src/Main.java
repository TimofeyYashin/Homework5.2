public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

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
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int max = 0;
        int min = 300000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) ;
            {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        float average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += (float) arr[i] / arr.length;
        }
        System.out.println(average);
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int a = reverseFullName.length;
        char name;
        for (int i = 0; i < a / 2; i++) {
            name = reverseFullName[a - i - 1];
            reverseFullName[a - i - 1] = reverseFullName[i];
            reverseFullName[i] = name;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}
