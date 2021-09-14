package JCA_HW_6_OOP;

public class Bowl {
    protected int foodAmount;
    public Bowl(int foodAmount){
        this.foodAmount=foodAmount;
    }
    public void decreaseFood(int amount)
    {
        this.foodAmount-=amount;
    }
    public int getFoodAmount(){
        return foodAmount;
    }
    public void addFood(int amount){
        this.foodAmount+=amount;
    }
}
