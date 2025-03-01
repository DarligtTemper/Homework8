import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1.1");
        int[] nums = new int[]{1, 2, 3};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("Задача №1.2");
        double[] shot = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < shot.length; i++) {
            System.out.println(shot[i]);
        }
        System.out.println("Задача №1.3");
        int[] board = new int[4];
        board[0] = 55;
        board[1] = 15;
        board[2] = 54;
        board[3] = 5764;

        for (int i = 0; i < board.length; i++) {
            System.out.println(board[i]);
        }
        System.out.println("Задача №2");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ");
        for (int i = 0; i < shot.length; i++) {
            System.out.print(shot[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i]);
            if (i < board.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("Задача №3");
        for (int i = nums.length - 1 ; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i > 0) {
                System.out.print(", ");
            }
            }
            System.out.println(" ");
            for (int a = board.length - 1; a >= 0; a--) {
                System.out.print(board[a]);
                if (a > 0) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ");
            for (int a = shot.length - 1; a >= 0; a--) {
                System.out.print(shot[a]);
                if (a > 0) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ");
            System.out.println("Задача №4");
            int[] odd = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

            for (int b = 0; b < odd.length; b++) {
                if (odd[b] % 2 != 0) {
                    odd[b] += 1;
                }
            }
            System.out.println(Arrays.toString(odd));
        }
    }


