import java.util.Scanner;

class Computer{

    Scanner readln = new Scanner(System.in);

    Computer(){
        System.out.println("Computer Started");
    }
    public int EnterYourPassword(){
        System.out.print("Enter your password : ");
        int password  =  readln.nextInt();
        if(password==2454){
            System.out.println("Access Granted");
            return 1;
        }else{
            System.out.println("Access Denied! \nWrong Password... \nPlease try again...");
            return 0;
        }
    }
    public String WelcomeMessage(){
        return "Welcome, Hitesh!";
    }
}

class ComputerCore{
    public int FunctionsMenu(int choice){
        System.out.println("Menu!");
        return 000;
    }
}

public class Ch7_ClassAndObjects {
    public static void main(String[] args) {
        Computer computer = new Computer();

        int access = computer.EnterYourPassword();
        if(access!=0){
            computer.WelcomeMessage();
            ComputerCore Core = new ComputerCore();
            Core.FunctionsMenu(0);

        }else{
            int accessTryAgain;
            do{
                accessTryAgain = computer.EnterYourPassword();
            }while(accessTryAgain<=0);
        }
    }
}