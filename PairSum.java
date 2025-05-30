// ques 13/50..
// 30 may 2025
public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1,7,4,7,3,9,2};
        int sum = 10;
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("No pairs found");
        }
    }
}

