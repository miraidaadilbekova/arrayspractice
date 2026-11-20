public class Main{
    public static void main(String[] args) {
        int[] nums = {10,4,-3,5,0,-3,7,0,17,0,9};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positive++;
            }
            else if (nums[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeros: " + zero);
    }
}



public class Main{
public static void main(String[] args) {
    int[] num = {12, 45, 67, 8, 4, 2, 3, 6, 10};
    int largest = num[0];
    int smallest = num[0];
    int largestIndex = num[0];
    int smallestIndex = num[0];
    for (int i = 0; i < num.length; i++) {
        if (num[i] > largest) {
            largest = num[i];
            largestIndex = i;
        }
        if (num[i] < smallest) {
            smallest = num[i];
            smallestIndex = i;
        }
    }
    System.out.print("Array: ");
    for (int i = 0; i < num.length; i++) {
        System.out.print(num[i] + " ");
    }
    System.out.println();
    System.out.println("Largest: " + largest + " at index " + largestIndex);
    System.out.println("Smallest: " + smallest + " at index " + smallestIndex);
}

}


public class Main{
public static void main(String[] args){
    int[] num = { 12, 13, 14, 5, 6, 2, 12};
    int sum =0;
    double average;
    int count = 0;
    for (int i = 0; i < num.length; i++) {
        sum += num[i];

    }
    average = (double) sum / num.length;
    for (int i = 0; i < num.length; i++) {
        if (num[i] > average) {
            count++;
        }
    }
    System.out.print("Array: ");
    for (int i = 0; i < num.length; i++){
        System.out.print(num[i] + " ");
    }
    System.out.println("Average: " + average);
    System.out.println("Numbers above average: " + count);

}



public class Main {
public static void main(String[] args) {
    int[] arr = {2,4,5,34,12,35,56};
    System.out.print("Original: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.print("Reversed: ");
    for (int i = arr.length - 1; i >= 0; i--){
        System.out.print(arr[i] + " ");
    }
}



import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] scores = new int[5];
    int passed = 0;
    int failed = 0;
    int sum = 0;
    for (int i = 0; i < scores.length; i++){
        System.out.print("enter your score: " + (i + 1) + ": ");
        int score = scanner.nextInt();
        while (score < 0 || score > 100) {
            System.out.println("invalid! Enter another number from 0 to 100.");
            System.out.print("enter score again: ");
            score = scanner.nextInt();
        }
        scores[i] = score;
        sum += score;
        if (score >= 60) {
            passed++;
        } else {
            failed++;
        }
    }
    double average = (double) sum / scores.length;
    System.out.print("Scores: ");
    for (int i = 0; i < scores.length; i++) {
        System.out.print(scores[i] + " ");
    }
    System.out.println("Passed: " + passed);
    System.out.println("Failed: " + failed);
    System.out.println("Average: " + average);

}
}


