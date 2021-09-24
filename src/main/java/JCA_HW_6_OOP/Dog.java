package JCA_HW_6_OOP;

public class Dog extends Animal {
    static final int MAX_DISTANCE_RUN = 500;
    static final int MAX_DISTANCE_SWIM = 10;
    private int Id;
    private static int index = 0;
    private boolean fullness;

    public Dog(String name, String color, String type, int appetite) {
        super(name, color, "Dog", appetite);
        index++;
    }

    @Override
    protected void run(int distance) {
        if (distance <= MAX_DISTANCE_RUN) {
            System.out.printf("%s %s по имени %s пробежал %d метров!!!\n", color, type, name, distance);
        } else
            System.out.printf("%s %s по имени %s может пробежать только %d метров!!!\n", color, type, name, MAX_DISTANCE_RUN);
    }

    protected void swimming(int distance) {
        if (distance <= MAX_DISTANCE_SWIM)
            System.out.printf("%s %s по имени %s проплыл %s\n", color, type, name, distance);
        else
            System.out.printf("%s %s по имени %s может проплыть только %s метров\n", color, type, name, MAX_DISTANCE_SWIM);
    }

    protected static int dogValue() {
        return index;
    }

    protected void eat(Bowl bowl) {
        if (bowl.foodAmount >= this.appetite) {
            bowl.decreaseFood(this.appetite);
            this.fullness = true;
            System.out.printf("%s по имени %s съел - %s корма, в миске осталось %s\n",this.type, this.name,this.appetite, bowl.getFoodAmount());
        } else System.out.printf("%s по имени %s не хватило еды\n", this.type, this.name);

    }
    protected void checkFullness(){
        if (this.fullness==true) System.out.printf("%s %s по имени %s покушал и доволен\n",this.color, this.type,this.name);
        else System.out.printf("%s %s по имени %s не хвтило еды\n",this.color, this.type,this.name);
    }
}
