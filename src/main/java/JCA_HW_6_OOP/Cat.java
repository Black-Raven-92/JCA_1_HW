package JCA_HW_6_OOP;

public class Cat extends Animal {
    static final int MAX_DISTANCE = 200;
    private static int index = 0;

    public Cat(String name, String color, String type) {
        super(name, color, "Cat");
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



}
