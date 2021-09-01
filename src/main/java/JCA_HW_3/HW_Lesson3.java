package JCA_HW_3;

public class HW_Lesson3 {
    public static void main(String[] args) {
        int[][] doubleArr=new int [4][4];
        int n=doubleArr.length;


        for(int i=0;i<doubleArr.length;i++) {
            doubleArr[i][i]=1;
            doubleArr[i][n-i-1]=1;

        }

        for (int y1 = 0; y1 < doubleArr.length; y1++) {
            for (int x1 = 0; x1 < doubleArr[y1].length; x1++) {
                System.out.print(doubleArr[y1][x1] + "  ");
            }
            System.out.println();
        }
    }
}

