package JCA_HW_2;

public class HW_Lesson2 {
    public static void main(String[] args) {

        int [] Array1 = {1,0,0,1,1,1,0,1,0};
        //ДЗ1
        for(int index=0; index<Array1.length;index++){
            if (Array1[index]==1) Array1[index]=0;
            else if (Array1[index]==0) Array1[index]=1;
            System.out.print(Array1[index]+" ");
        }
        System.out.println();
        //ДЗ 2
        int [] Array2 = new int [8];
        for (int index2=0,g=0; index2< Array2.length;index2++, g+=3){
            Array2[index2]=g;
            System.out.print(Array2[index2]+" ");
        }
        System.out.println();
        //ДЗ3
        int [] Array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int index3=0; index3< Array3.length; index3++){
            if(Array3[index3]<6) Array3[index3]*=2;
            System.out.print(Array3[index3]+ " ");
        }

    }
}
