package string;

public class Strings {
    static void main(String[] args) {

        String name = "Hitesh";
        String sameName = "Hitesh";
        String newName = new String("Hitesh");
        String newNAME = new String("HITESH");

        if(name == sameName){
            System.out.println("Both names are same.");
        }

        if(name == newName){
            System.out.println("Both names are same.");
        }else{
            System.out.println("Both names are diffrent.");
        }

        // Equals Method
        if(name.equals(newName)){
            System.out.println("Both name have same values");
        }

        if(name.equalsIgnoreCase(newNAME)){
            System.out.println("Both name is same : Case Ignored!");
        }
    }

}