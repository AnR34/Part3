class Main {
    public static void main(String[] args) {

        int[] numbers = {3, 22, 1, 101, 4, 6, 16, 5};

        System.out.println("1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.");
        StringBuilder sb = new StringBuilder();
        for (int i : numbers) {
            if (i % 2 == 0) {
                sb.append(String.format("%d, ", i));
            }
        }
        sb.setLength(sb.length() - 2);
        System.out.println(sb);

        System.out.println("2.Напишите программу, которая выводит все двузначные числа массива.");
        for (int i : numbers) {
            if (i > 9 && i < 100) {
                System.out.println(i + "\n");
            }
        }

        System.out.println("3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.");
        int maxNumber = Integer.MIN_VALUE;
        for (int i : numbers) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        System.out.println(maxNumber);

        System.out.println("4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.");
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("5.***Напишите программу, которая переворачивает массив в обратном порядке.");
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedNumbers));
    }
}
