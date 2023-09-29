public class Spacex 
{
    String booster;
    String starship;
    String lastlaunch;
    Spacex(){
        this(0);
    }
    Spacex(string ){
        booster="HeavyBooster";
        starship="Starship";
        lastlaunch= "Falcone 9"; 
    }

    public void showInfo(){
        System.out.println("The rocket is called "+starship);
        System.out.println("The first stage is called "+booster);
        System.out.println("The second stage is called "+starship);
    }
    public void nextbooster(int first){
        System.out.println("The next"+booster+"is"+first);
    }
    public void nextstarship(int second){
        System.out.println("The next"+starship+"is"+second);
    }
    public void nextlaunch(int first, int second){
        System.out.println("The next launch will be "+starship+ second+" with "+booster+ first);
    }
}
