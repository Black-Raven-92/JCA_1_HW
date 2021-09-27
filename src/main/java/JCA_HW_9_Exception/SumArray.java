package JCA_HW_9_Exception;

public class SumArray {
    public static final int SIZE=4;

    public static int SumArray(String [][]Arr)
    {
        if(Arr.length>SIZE) throw new MyArraySizeException("Массив только 4Х4");
        int sum=0;
        for (int y = 0; y < Arr.length; y++) {
            if(Arr.length!=SIZE) throw new MyArraySizeException("Массив только 4Х4");
            for (int x = 0; x <Arr[y].length; x++) {
                try{
                    sum+=Integer.parseInt(Arr[y][x]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(String.format("Элемент: %d  %d не является числом\n ",x+1,y+1));
                }


            }


        }
        System.out.printf("Сумма равнa - %s\n",sum);
        return sum;
    }


}
