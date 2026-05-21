package array;

public class ArrayAvgNumber {
    static void main(String[] args) {
        int sumNumber = 0;
        int Numbers[] = {25,30,48,54,55,10,3,6,7};
        for (int number : Numbers){
            sumNumber += number;
        }
        double avgNumber = (double)sumNumber / Numbers.length;
        System.out.println("Avg Number : "+avgNumber);
    }
}
