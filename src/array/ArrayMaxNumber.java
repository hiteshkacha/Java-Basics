package array;

public class ArrayMaxNumber {
    static void main(String[] args) {
        int maxNumber = 0;
        int Numbers[] = {25,30,48,54,55,10,3,6,7};
        for (int number : Numbers){
            if(number>maxNumber){
                maxNumber=number;
            }
        }
        System.out.println("Max Number: "+maxNumber);
    }
}
