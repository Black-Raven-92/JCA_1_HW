package JCA_HW_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {
    @BeforeEach
    void init(){
        HomeWork hw=new HomeWork();
       int []arr;
       int[]newArr;
    }
    @CsvSource(
            value = {"1,2,3,4,5,6:5,6",
                    "1,3,4,5,6,7:5,6,7",
                    "1,3,43,5,6,7:5,6,7"

            },delimiter = ':'
    )
    @ParameterizedTest
    void testCopyArray(String before, String after){
        int[] array=IntFromString(before);
        int[] resArray=IntFromString(after);
        Assertions.assertArrayEquals(HomeWork.copyArray(array),resArray);
    }
    @ParameterizedTest
    @CsvSource(value = {
            "1,2,4:"
    }, delimiter = ':')
    void arrayModify(String sBefore) {
        int[] before = IntFromString(sBefore);
        Assertions.assertThrows(RuntimeException.class, () -> HomeWork.copyArray(before));
    }
    @Test
    void copyArray() {
    }

    @Test
    void chekArray() {
    }
    int[] IntFromString(String s){
        String []sArray=s.split(",");
        int arr[]=new int[sArray.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(sArray[i]);
        }
        return arr;
    }
    @ParameterizedTest
    @CsvSource(value = {
            "1,1,4,4:true",
            "1,1:false",
            "4,4:false",
            ":false",
            "1,4,3:false"
    }, delimiter = ':')
    void arrayCheck(String sBefore, boolean res) {
        int[] before = IntFromString(sBefore);
        Assertions.assertEquals(HomeWork.chekArray(before), res);
    }
}