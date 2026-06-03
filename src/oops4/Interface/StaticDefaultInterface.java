package oops4.Interface;

public class StaticDefaultInterface {
    static void main(String[] args) {
        if(Game.isPlayable){
            TikTakToe tiktaktoe = new TikTakToe();
        }
    }
}

interface Game{
    boolean isPlayable = true;

    default void GameStart(){
        System.out.println("Game Started!");
    }
}

class TikTakToe implements Game{
    TikTakToe(){
        this.GameStart();
    }
}