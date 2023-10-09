package lab0;

public class variant13 {
    //Дано трехзначное число. В нем зачеркнули первую слева цифру и приписали ее справа.
    // Вывести полученное число.
    public int integerTask(int number) {
        int num;
        return num = (number % 100 / 10 * 100) + (number % 10) * 10 + number / 100;
    }
//Даны три целых числа: A, B, C. Проверить истинность высказывания:
// "Хотя бы одно из чисел A, B, C положительное".
    public boolean booleanTask(int a, int b, int c) {
        if (a > 0 || b > 0 || c > 0) {
            return true;
        }
        return false;

    }
//Даны три числа. Найти среднее из них (то есть число, расположенное между наименьшим и наибольшим).
    public int ifTask(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }
    //Дано целое число N (> 0). Найти значение выражения
    //
    //1.1 – 1.2 + 1.3 – …
    //(N слагаемых, знаки чередуются). Условный оператор не использовать.
    public double forTask(int n){
        if(n < 0) return -1;
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            double term = (-1) * Math.pow(-1, i) * 0.1 * i;
            sum += term;
        }

        return sum;

    }
    //Дано число A (> 1). Вывести наименьшее из целых чисел K, для которых сумма 1 + 1/2 + … + 1/K
    // будет больше A, и саму эту сумму.
   public Result whileTask(int a){
       Result result = new Result();
       if(a < 1){
            result.k = -1;
            result.sum = -1;
            return result;
        }
       int k = 1;
       double sum = 1.0;

       while (sum <= a) {
           k++;
           sum += 1.0 / k;
       }


       result.k = k;
       result.sum = sum;

       return result;
   }

    public static class Result {
        public int k;
        public double sum;
    }

    // Дано целое число N и набор из N целых чисел. Найти номер первого максимального нечетного
    // числа из данного набора. Если нечетные числа в наборе отсутствуют, то вывести 0.
    public static int minmaxTask(int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int maxOddIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && numbers[i] > maxOdd) {
                maxOdd = numbers[i];
                maxOddIndex = i;
            }
        }

        if (maxOddIndex == -1) {
            return 0;
        }

        return maxOddIndex + 1;
    }

    //Дан массив A размера N (N — нечетное число). Вывести его элементы с нечетными номерами в порядке
    // убывания номеров: A[N], A[N–2], A[N–4], …, A[1]. Условный оператор не использовать.
    public double[] arrayTask(double[] array){
        int N = array.length;
        double[] result = new double[N / 2 + 1];

        for (int i = 0; i <= N / 2; i++) {
            result[i] = array[N - 2 * i];
        }

        return result;
    }

    //Дана квадратная матрица A порядка M. Начиная с элемента A[1,1], вывести ее элементы следующим образом
    // ("уголками"): все элементы первой строки; элементы последнего столбца, кроме первого (уже выведенного)
    // элемента; оставшиеся элементы второй строки; оставшиеся элементы предпоследнего столбца и т. д.;
    // последним выводится элемент A[M,1].
    public double[] matrixTask(double[][] matrix){
        int M = matrix.length;
        int N = matrix[0].length;
        double[] result = new double[M * N];

        int index = 0;

        for (int layer = 0; layer <= M / 2; layer++) {
            // Виводимо верхню строку слоя
            for (int j = layer; j < N - layer; j++) {
                result[index++] = matrix[layer][j];
            }

            // Виводимо правий стовбець слоя
            for (int i = layer + 1; i < M - layer; i++) {
                result[index++] = matrix[i][N - 1 - layer];
            }

            // Виводимо нижню строку слоя (если есть)
            if (layer < M - 1 - layer) {
                for (int j = N - 2 - layer; j >= layer; j--) {
                    result[index++] = matrix[M - 1 - layer][j];
                }
            }

            // Виводимо лівий стовбець слоя
            if (layer < N - 1 - layer) {
                for (int i = M - 2 - layer; i > layer; i--) {
                    result[index++] = matrix[i][layer];
                }
            }
        }

        return result;
    }
}



