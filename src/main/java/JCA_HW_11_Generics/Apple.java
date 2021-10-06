package JCA_HW_11_Generics;

public class Apple extends Fruit {
    private int weight;
    public Apple(int weight){
        super(weight);
        this.weight=weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
