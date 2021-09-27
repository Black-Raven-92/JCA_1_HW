package JCA_HW_6_OOP;

public class HomeWork_OOP2 {
    public static void main(String[] args) {
        Animal Cat1 = new Cat("Barsik","White","Cat",30);
        Animal Cat2 = new Cat("Murzik","Grey","Cat",30);
        Animal Dog1= new Dog("Sharik","Black","Dog",60);
        Animal [] animals={new Cat ("Pushok","White","Cat",50),
                new Dog ("Tuzik","Black","Dog",60),
                new Cat("Grisha","Grey","Cat",20),
                new Cat("Gosha","Red","Cat",50),
                new Dog("Naida","Grey","Dog",100),
                new Cat("Grisha","Grey","Cat",20),};

        Bowl bowl = new Bowl(50);
        Cat1.eat(bowl);
        Cat2.eat(bowl);
        Cat2.eat(bowl);
        bowl.getFoodAmount();
        Cat1.checkFullness();
        Cat2.checkFullness();
        bowl.addFood(100);
        Cat2.eat(bowl);
        Cat2.checkFullness();
       Bowl bowl2 = new Bowl(100);
        System.out.println();
        for(Animal a:animals){
            a.eat(bowl2);
        }
        System.out.println();
        for(Animal a:animals){
            a.checkFullness();
        }





    }
}
