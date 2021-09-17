package JCA_HW_8_OOP3;

public class HomeWork_OOP8
{
    public static void main(String[] args) {
        Mooving man=new Man("Человек","Вася");
        Wall wall1 = new Wall(200,"Стена");
        Wall wall2 = new Wall(100,"Стена2");
        Track track1=new Track(50,"Track");
        Track track2=new Track(10,"Track");
        Barrier [] barriers = {wall1,wall2,track1,track2};

        for(int i=0;i<3;i++)
        {
            man.move(barriers);
        }


    }
}
