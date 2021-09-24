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
    protected abstract void run(int distance);
    protected abstract void eat(Bowl bowl);
    protected static int animalValue(){
        return index;
    }
    protected abstract void checkFullness();


}
