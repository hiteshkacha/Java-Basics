public class Ch9_Array {
    public static void main(String[] args){
        int array[] = {10,20,30};
        String string[] = {"Arrya1", "Array2","Array3"};
        array[2] = 15;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        for(int i=0;i<string.length;i++){
            System.out.println(string[i]);
        }
    }
}
