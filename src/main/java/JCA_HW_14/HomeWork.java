package JCA_HW_14;

import java.sql.Array;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int sizeArray = 7;
        int[] array = {4, 2, 3, 3, 5, 2, 5, 1, 8, 9};
        //System.out.println(Arrays.toString(copyArray(array)));
        //System.out.println(chekArray(array));
    }

    public static int[] copyArray(int[] array) {
        int index = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                int[] newArr = new int[(array.length - i) - 1];
                int d = 0;
                for (int j = i + 1; j < array.length; j++) {
                    newArr[d] = array[j];
                    d++;
                }
                return newArr;
            }
        }
        throw new RuntimeException();
    }

    public static boolean chekArray(int[] array) {
        boolean chek=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 4) {
                chek = true;
                break;

            } else continue;
        }
        return chek;
    }
}
