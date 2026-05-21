package array;

public class ArrayMinNumber {
    static void main(String[] args) {
        int minNumber = Integer.MAX_VALUE;
        int Numbers[] = {25,30,48,54,55,10,3,6,7};
        for (int number : Numbers){
            if(number<minNumber){
                minNumber = number;
            }
        }
        System.out.println("Min Number : "+ minNumber);
    }
}
