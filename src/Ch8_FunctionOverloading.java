class Calculator{
    public int add(int num1, int num2){
        return num1+num2;
    }
    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}

public class Ch8_FunctionOverloading {
    public static void main(String[] Args){
        Calculator calculator = new Calculator();
        int menthodOne = calculator.add(10,20);
        System.out.println("First method result : "+menthodOne);
        int methodTwo = calculator.add(10,20,30);
        System.out.println("Second method result : "+methodTwo);
    }
}
