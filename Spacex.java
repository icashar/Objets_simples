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
    @Override
    public String toString() {
        String output = "";
        output += "Booster: " + nbooster + "; ";
        output += "starship: " + nstarship + "\n";
        
        return output; 
    }
    @Override
    public boolean equals(Object other)
    {
        //même mémoire
        if (this==other){
            return true;
        }
        //pas Spacex(object de la classe)
        else if (!(other instanceof Spacex)){
            return false;
        }
        Spacex o= (Spacex)other;
        return (o.nbooster==this.nbooster&& o.nstarship==this.nstarship);

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
