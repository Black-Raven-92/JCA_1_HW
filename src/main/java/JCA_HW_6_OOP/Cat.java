package JCA_HW_6_OOP;

public class Cat extends Animal {
    static final int MAX_DISTANCE = 200;
    private int Id;
    private static int index = 0;

    public Cat(String name, String color, String type, int distance) {
        super(name, color, "Cat", distance);
        index++;
        this.Id=index;

    }

    @Override
    public void run() {
        if (this.distance <= MAX_DISTANCE) {
            System.out.printf("%s %s по имени %s пробежал %d метров\n", color, type, name, distance);
        } else
            System.out.printf("%s %s по имени %s может пробежать только %d метров\n", color, type, name, MAX_DISTANCE);
    }

    @Override
    public void swimming() {
        System.out.printf("%s %s по имени %s не умеет плавать!!!\n", color, type, name);
    }

    public void NumberCat() {
        System.out.println(this.Id);


    }


}
