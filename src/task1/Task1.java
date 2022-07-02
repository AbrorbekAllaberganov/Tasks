package task1;

public class Task1 {

    public static int robot(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==1){
                    return Math.abs(i-3)+Math.abs(j-3);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] arr={
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,1,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0}
        };

        System.out.println(robot(arr));

    }
}