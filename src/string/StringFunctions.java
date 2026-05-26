package string;

public class StringFunctions {
    static void main(String[] args) {
        System.out.println("String Functions");
        System.out.println("________________");

        int number  = 1;
        String name = "Hitesh";
        String namewithSpace = "   Hitesh   ";

        System.out.println("String Uppercase : "+name.toUpperCase());
        System.out.println("String Lowercase : "+name.toLowerCase());

        System.out.println("Trimmed String : "+namewithSpace.trim());

        System.out.println("Start with H : "+name.startsWith("H"));
        System.out.println("Ends with h : "+name.endsWith("h"));

        System.out.println("Name and name with white space is same : "+name.equals(namewithSpace.trim()));
        System.out.println("Equals Ignore Case : "+name.equalsIgnoreCase(name.toUpperCase()));

        System.out.println("Zeroth char is : "+name.charAt(0));

    }
}
