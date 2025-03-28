package ex_16_Arrays;

public class Lab159_2D {
    public static void main(String[] args) {
        // 1,2,3
        // 4,5,6
        // 7,8,9
        int[][] array_2d_old = { {1,2,3},{4,5,6},{7,8,9}};

        int[][] predefined = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] array;
        array = new int[][] { {10, 20}, {30, 40}, {50, 60} };
        // 10,20
        // 30,40
        // 50,60



        // R ->  3
        // C -> 3
        int[][] array_2d = new int[3][3];
        array_2d[0][0] = 1;
        array_2d[0][1] = 2;
        array_2d[0][2] = 3;
//        array_2d[0][3] = 92;

        array_2d[1][0] = 1;
        array_2d[1][1] = 3;
        array_2d[1][2] = 5;

        array_2d[2][0] = 2;
        array_2d[2][1] = 4;
        array_2d[2][2] = 6;


        // 1 0,0
        //2	0,1
        //3	0,2
        //
        //4	1,0
        //5	1,1
        //6	1,2
        //
        //7	2,0
        //8	2,1
        //9	2,2
    }
}
