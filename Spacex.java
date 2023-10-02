public class Spacex 
{

        String booster="HeavyBooster";
        String starship="Starship";
       String lastlaunch= "Falcone 9"; 
       int nbooster;
       int nstarship;
   
    Spacex(int i, int j){
        nbooster=j;
        nstarship=i;
    }
    public String toString() {
        String output = "";
        output += "Booster: " + booster + "; ";
        output += "starship: " + starship + "\n";
        
        return output; 
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
