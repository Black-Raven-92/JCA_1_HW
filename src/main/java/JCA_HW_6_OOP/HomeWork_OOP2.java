package JCA_HW_6_OOP;

public class HomeWork_OOP2 {
    public static void main(String[] args) {
        Animal Cat1 = new Cat("Barsik","White","Cat");
        Animal Cat2 = new Cat("Murzik","Black","Cat");
        Animal Dog1= new Dog("Bobik","Grey","Dog");
        Animal Dog3=new Dog("Tuzik","White","Dog");
        Dog Dog2=new Dog("Naida","Red","Dog");
        Cat Cat3=new Cat("Muska","Red","Cat");
        Cat3.run(500);
        Dog2.swimming(500);
        Dog1.run(100);
        Cat.swimmingCat(500);
        Cat2.run(500);





        System.out.printf("Количество животных: %s\nКоличество котов: %s\nКоличество собак: %s \n",Animal.animalValue(),Cat.catValue(),Dog.dogValue());










    }
}
