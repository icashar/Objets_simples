public class Main
{
  public static void main(String[] args) {
    // créer des instances de l'objet
    Spacex S1=new Spacex(24,7);//Initialisation d'un objet-comme un scanner, mais au lieux de lire la console ça lis un fichier
    Spacex S2=new Spacex(25,9);
    
    // utiliser les comportements de l'objet
    S1.nextlaunch(13,4);
    S1.showInfo();
    

    //constructeur
    System.out.println("Quelle est la fusée qui à été lance en mars 2023");//S24/B7
    System.out.println(S1);

    System.out.println("Quelle est la la fusée lance en mars 2024 ");//S25/B9
    System.out.println(S2);
    System.out.println("est ce que la fusée de 2024 et la meme que 23");
    System.out.println(S1.equals(S2));



  }  
}