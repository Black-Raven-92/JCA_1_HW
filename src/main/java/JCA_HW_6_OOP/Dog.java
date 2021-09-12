package JCA_HW_6_OOP;

public class Dog extends Animal {
    static final int  MAX_DISTANCE_RUN=500;
    private int Id;
    private static int index = 0;
    public Dog(String name, String color, String type, int distance)
    {
        super(name,color,"Dog",distance);
    }

    @Override
    public void run() {
        if (this.distance<=MAX_DISTANCE_RUN){
            System.out.printf("%s %s по имени %s пробежал %d метров!!!\n",color,type,name,distance);
        }else System.out.printf("%s %s по имени %s может пробежать только %d метров!!!\n",color,type,name,MAX_DISTANCE_RUN);
    }

    @Override
    public void swimming() {
        System.out.printf("%s %s по имени %s проплыл %s\n",color,type,name,distance);
    }
    public int getId() {
        return Id;

    }

}
