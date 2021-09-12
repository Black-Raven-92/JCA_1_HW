package JCA_HW_6_OOP;

public abstract class Animal {
    protected String name;
    protected String color;
    protected String type;
    protected int distance;



    public Animal (String name, String color,String type, int distance){

        this.name=name;
        this.color=color;
        this.type=type;
        this.distance=distance;
    }
    public abstract void run();
    public abstract void swimming();

}
