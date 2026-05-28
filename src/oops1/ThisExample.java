package oops1;

public class ThisExample {
    static void main(String[] args) {
        Complex cmplx = new Complex();
        cmplx.theSum();
    }
}

class Complex{
    int a;
    int b;

    Complex(){
        this.a = 10;
        this.b = 10;
    }

    void theSum(){
        System.out.println(this.a+this.b);
    }
}
