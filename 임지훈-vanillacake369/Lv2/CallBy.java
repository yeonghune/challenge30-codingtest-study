import java.util.Scanner;

public class CallBy {
    public static void main(String[] args) {
        /* input */
        Scanner scanner = new Scanner(System.in);
        String[] inputStr = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputStr[0]);
        int b = Integer.parseInt(inputStr[1]);
        /* calc */
        /* result */
        int[] result = computeTwoInt(a, b);
        System.out.println((result[0]) + " " + (result[1]));
    }

    private static int[] computeTwoInt(int a, int b) {
        int[] temp = new int[2];
        if (a > b) {
            temp[1] = b + 10;
        } else {
            temp[0] = a + 10;
            temp[1] = b * 2;
        }
        return temp;
    }
}
