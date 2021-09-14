package JCA_HW_6_OOP;

public class Cat extends Animal {
    static final int MAX_DISTANCE = 200;
    private static int index = 0;
    private boolean fullness;

    public Cat(String name, String color, String type, int appetite) {
        super(name, color, "Cat",appetite);
        this.fullness=false;
        index++;
    }

    public void run(int distance) {
        if (distance<= MAX_DISTANCE) {
            System.out.printf("%s %s по имени %s пробежал %d метров\n", color, type, name, distance);
        } else
            System.out.printf("%s %s по имени %s может пробежать только %d метров\n", color, type, name, MAX_DISTANCE);
    }


    public static void swimmingCat(int distance) {
        System.out.printf("Коты не умеют плавать и не проплывут %s метров\n",distance);
    }

    public static int catValue(){
        return index;
    }
    public void eat(Bowl bowl){
        if(bowl.foodAmount>=this.appetite){
            bowl.decreaseFood(this.appetite);
            this.fullness=true;
            System.out.printf("%s по имени %s съел - %s корма, в миске осталось %s\n",this.type, this.name,this.appetite, bowl.getFoodAmount());
        }
        else System.out.printf("%s по имени %s не хватило еды\n",this.type, this.name);
    }
    public void checkFullness(){
        if (this.fullness==true) System.out.printf("%s %s по имени %s покушал и доволен\n",this.color, this.type,this.name);
        else System.out.printf("%s %s по имени %s не хвтило еды\n",this.color, this.type,this.name);
    }




}
