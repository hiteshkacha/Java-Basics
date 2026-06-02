package oops2;

public class Inheritancesuper extends  Inheritancesupersub{
    Inheritancesuper(){
        System.out.println("Super is created");
        super.fruit = "Apple";
        super.eatable();
    }
    public static void main(String[] args){
        Inheritancesuper temp = new Inheritancesuper();

    }
}
