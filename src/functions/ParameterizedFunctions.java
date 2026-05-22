package functions;

public class ParameterizedFunctions {
    static void main(String[] args) {
        average(5,10);
    }

    static void average(int a, int b) {
        double avgNumber = (a+b)/2;
        System.out.println("The Avg Number : "+avgNumber);
    }
}
