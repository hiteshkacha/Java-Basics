package oops1;

public class ClassesAndObjects {
    static void main(String[] args) {

        Choclate c1 = new Choclate();
        c1.choclateName = "Milkybar";
        c1.taste();

    }
}
class Choclate{
    int price;
    String choclateName;

    void taste(){
        System.out.println(choclateName+" is a very tasty choclate.");
    }
}
