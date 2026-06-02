package oops4.abstraction;

public class AbstractionExample {
    static void main(String[] args) {

        System.out.println("About The Fruit");
        Fruit f1 = new Fruit("Apple");
        f1.fruitTaste("Sweet");
        f1.containSeeds(true);
        f1.isSeasonal(false);
        f1.isEatable();

    }
}
abstract class FruitCharacteristics{
    abstract void fruitTaste(String taste);
    abstract void containSeeds(boolean containSeeds);
    abstract void isSeasonal(boolean isSeasonal);
    void isEatable(){
        System.out.println("Yes! The fruit is eatable!");
    }
}

class Fruit extends FruitCharacteristics{

    private String fruitName;

    Fruit(String fName){
        this.fruitName = fName;
        System.out.println("The fruit name is "+fruitName + "!");
    }

    @Override
    void fruitTaste(String fTaste){
        System.out.println(fruitName + " is a " + fTaste + " Fruit!");
    }

    @Override
    void containSeeds(boolean fSeeds){
        if(fSeeds){
            System.out.println(fruitName + " contain seeds!");
        }else{
            System.out.println(fruitName + " does not contain seeds!");
        }
    }

    @Override
    void isSeasonal(boolean fSeasonal){
        if(fSeasonal){
            System.out.println(fruitName + " is a seasonal fruit!");
        }else{
            System.out.println(fruitName + " is not a seasonal fruit!");
        }
    }
}