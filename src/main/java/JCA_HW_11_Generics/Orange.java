package JCA_HW_11_Generics;

public class Orange extends Fruit {
    private int weight;
    public Orange(int weight){
        super(weight);
        this.weight=weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }
}
