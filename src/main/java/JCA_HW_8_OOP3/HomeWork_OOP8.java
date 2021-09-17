package JCA_HW_8_OOP3;

public class HomeWork_OOP8
{
    public static void main(String[] args) {
        Mooving [] marathonRunners={new Man("Человек","Вася"), new Cat("Cat","Барсик"), new Robot("Robot","Вэрдэр")};
        Wall wall1 = new Wall(55,"Стена");
        Wall wall2 = new Wall(50,"Стена2");
        Track track1=new Track(5,"Track");
        Track track2=new Track(10,"Track");
        Barrier [] barriers = {wall1,wall2,track1,track2};




                for (Mooving p:marathonRunners){
                    p.move(barriers);
                    System.out.println();
                }




    }
}
