package oops1;

public class MethodOverloading {
    static void main(String[] args) {
        GreetingsClass Grt = new GreetingsClass();
        System.out.print("Normal Greet Message : ");
        Grt.Greetings();
        System.out.print("Greet Message with Name: ");
        Grt.Greetings("Hitesh");
        System.out.print("Greet Message with Roll No: ");
        Grt.Greetings(21);
    }
}
class GreetingsClass{
    void Greetings(){
        System.out.println("Good Morning");
    }

    void Greetings(String name){
        System.out.println("Good Morning "+name);
    }

    void Greetings(int rollNo){
        System.out.println("Good Morning, Roll No "+rollNo);
    }
}
