import java.util.Scanner;

public class Game {
    public void Menu(){
        System.out.println("Game Menu");
        System.out.println("appuyer sur une touche pour jouer");
        Scanner sc=new Scanner(System.in);
        String men=sc.next();
        if(men!=""){
            System.out.println("choisissez la race");
        }
        sc.close();
    }
    public static void main(String[] args) {
        System.out.println("lancement du jeu, choisissez le nome de votre personnage ainsi que sa race");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        Personnage p = new Elfe(name,"male");
        Personnage w= new Nain("aladina", "female");
        System.out.println(" les pv de "+p.getName()+" sont "+ p.getPv());

        p.attaque(w);
        System.out.println(" les pv de "+p.getName()+" sont "+ p.getPv());
        sc.close();
    }
    
}
