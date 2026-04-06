import java.util.Scanner;

public class Day19A {
    public static class Stats {
        int sum;
        int max;
        int min;

        double getAverage(int count) {
            return (double) sum / count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array; ");
        int n = sc.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("Array cannot be empty!");
        }
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Stats res = arrayStats(arr);
        System.out.println("The Sum: " + res.sum);
        System.out.println("The Average: " + res.getAverage(arr.length));
        System.out.println("The Maximum: " + res.max);
        System.out.println("The Minimum: " + res.min);

        sc.close();
    }

    static Stats arrayStats(int[] arr) {
        Stats stat = new Stats();
        stat.sum = arr[0];
        stat.max = arr[0];
        stat.min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            stat.sum += arr[i];

            if (arr[i] > stat.max) {
                stat.max = arr[i];
            }
            if (arr[i] < stat.min) {
                stat.min = arr[i];
            }

        }
        return stat;
    }
}
