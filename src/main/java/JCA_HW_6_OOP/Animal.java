package JCA_HW_6_OOP;

public abstract class Animal {
    protected String name;
    protected String color;
    protected String type;
    protected int appetite;
    protected boolean fullness;
    private static int index = 0;





    public Animal (String name, String color,String type, int appetite){

        this.name=name;
        this.color=color;
        this.type=type;
        this.appetite=appetite;
        index++;

    }
    public  abstract void run(int distance);
    public abstract void eat(Bowl bowl);
    public static int animalValue(){
        return index;
    }
    public abstract void checkFullness();


}
