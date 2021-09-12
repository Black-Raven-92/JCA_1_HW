package JCA_HW_6_OOP;

public abstract class Animal {
    protected String name;
    protected String color;
    protected String type;
    private static int index = 0;





    public Animal (String name, String color,String type){

        this.name=name;
        this.color=color;
        this.type=type;
        index++;

    }
    public  abstract void run(int distance);
    public static int animalValue(){
        return index;
    }

}
