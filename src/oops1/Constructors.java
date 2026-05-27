package oops1;

public class Constructors {
    static void main(String[] args) {

        Construction cn = new Construction();
        Construction cn1 = new Construction(1);
        Construction cn2 = new Construction(1,10);
        cn.print();
        cn1.print();
        cn2.print();

    }
}

class Construction{
    int a;
    int b;

    public Construction(){

    }

    public Construction(int num1){
        a = num1;
    }

    public  Construction(int num1, int num2){
        a = num1;
        b = num2;
    }
    void print(){
        System.out.println(a + " " + b);
    }
}
