class Main2 {
    public static void main(String[] args) {

        System.out.println("С клавиатуры вводится двумерный массив, длина его строк – 4, столбцов – 3.");
        int[][] twoDimensionNumbers = new int[3][4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < twoDimensionNumbers.length; i++) {
            for (int j = 0; j < twoDimensionNumbers[i].length; j++) {
                twoDimensionNumbers[i][j] = scanner.nextInt();
            }
        }

        System.out.println("1.Напишите программу, которая выводит номера строк и суммы их элементов (пример: Line 2: 17).");
        for (int i = 0; i < twoDimensionNumbers.length; i++) {
            int sum = 0;
            for (int j = 0; j < twoDimensionNumbers[i].length; j++) {
                sum += twoDimensionNumbers[i][j];
            }
            System.out.println("Line " + i + ": " + sum);
        }

        System.out.println("2.Напишите программу, которая выводит номера столбцов и суммы их элементов (пример: Column 3: 21).");
        for (int i = 0; i < twoDimensionNumbers[0].length; i++) {
            int sum = 0;
            for (int[] twoDimensionNumber : twoDimensionNumbers) {
                sum += twoDimensionNumber[i];
            }
            System.out.printf("Column %d: %d\n", i, sum);
        }

        System.out.println("3.Напишите программу, которая заменяет все нечётные элементы массива на 1, а чётные на 0 и выводит его на экран.");
        for (int i = 0; i < twoDimensionNumbers.length; i++) {
            for (int j = 0; j < twoDimensionNumbers[i].length; j++) {
                if (twoDimensionNumbers[i][j] % 2 == 0) {
                    twoDimensionNumbers[i][j] = 0;
                } else {
                    twoDimensionNumbers[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(twoDimensionNumbers[i]));
        }

        System.out.println("4.Напишите программу, которая для в каждой строке находит целое среднее арифметическое и выводит его на экран.");
        for (int[] a : twoDimensionNumbers) {
            System.out.println(Arrays.stream(a).sum() / twoDimensionNumbers[0].length);
        }

        System.out.println("5.***Напишите программу, которая преобразует двумерный массив в перевёрнутый одномерный и выводит все элементы одномерного массива на экран.");
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] arr : twoDimensionNumbers) {
            for (int i : arr) {
                stringBuilder.append(i).append(" ");
            }
        }
        List<Integer> list = new ArrayList<>();
        for (String s : stringBuilder.toString().split(" ")) {
            list.add(Integer.parseInt(s));
        }
        Collections.reverse(list);
        int[] oneDimensionNumbers = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(oneDimensionNumbers));
    }
}
