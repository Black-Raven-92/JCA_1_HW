package JCA_HW_11_Generics;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    ArrayList<T> fruitList;
    private int weightBox=0;

    public Box(){
        fruitList=new ArrayList<>();


    }
    public void Add(T fruit){
        if(fruitList.add(fruit)) this.weightBox+=fruit.getWeight();

    }
    public int getSize(){
        return fruitList.size();
    }
    public boolean compare(Box<?> anotherBox){
        return this.weightBox==anotherBox.weightBox;

    }


    @Override
    public String toString() {
        return "Box{" +
                "fruitList=" + fruitList +
                ", weightBox=" + weightBox +
                '}';
    }
    public void emptyTo(Box<T> anotherBox){
        anotherBox.fruitList.addAll(this.fruitList);
        anotherBox.weightBox+=this.weightBox;
        this.fruitList.clear();
        this.weightBox=0;
    }
}
