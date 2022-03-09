package array;

public class TwoDimensionArray {
    public static void main(String[] args) {

        //int[][] arr = new int[2][3];
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        // arr.length = 2 가 나타내는건 행의 길이
        System.out.println(arr.length);
        // arr[0].length = 3 가 나타내는건 열의 길의
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
