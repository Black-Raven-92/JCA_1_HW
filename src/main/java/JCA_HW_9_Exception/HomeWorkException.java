package JCA_HW_9_Exception;

public class HomeWorkException {
    public static void main(String[] args) {
        String [][] array1=new String[][]{
                {"2", "3", "11", "81"},
                {"91", "22", "33", "32"},
                {"12", "71", "44", "tr"},
                {"111", "111", "-2", "-122"}};
        String [][] array2=new String[][]{
                {"2", "3", "11", "81"},
                {"91", "22", "33", "32"},
                {"12", "71", "44", "tr"},
                {"111", "111", "-2", "-122"},
                {"111", "111", "-2", "-122"}};
        String [][] array3=new String[][]{
                {"2", "3", "11", "81"},
                {"91", "22", "33", "32"},
                {"12", "71", "44", "tr"},
                {"111", "111", "-2", "-122"},
                {"111", "111", "-2", "-122","12323"}};
        try{
            SumArray.SumArray(array1);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        try{
            SumArray.SumArray(array2);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        try{
            SumArray.SumArray(array3);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }





    }
}
