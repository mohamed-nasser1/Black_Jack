package blackjack;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author nasse
 */
public class Game {

    Player p[]=new Player[4];
    Card card[]=new Card[52];
    int Hscore=0;
    int score;
    int count=0;





    public void makecard(){
        int c=0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 13; j++) {

                card[c]=new Card(j,i,(j>9)?10:j + 1);


                c++;
            }


        }

    }




    public Card Drow_card(){
        Card d=null;



        Random r=new Random();
        while(d==null){
            int i=r.nextInt(52);
            d=card[i];
            card[i]=null;

        }



        return d;

    }


public void taketwo(){
        for (int i = 0; i < 4; i++){
            p[i] = new Player("1");
            for (int j = 0; j < 2; j++){
                Card c = new Card(Drow_card());
                p[i].card[j] = c;
                p[i].score += c.getValue();

            }
        }
}




    public Card takeone(int i,int j){
        Card c = new Card(Drow_card());
        p[i].card[j+2]= c;
        p[i].score+=c.getValue();
        return c;
    }





    public void info(){

        taketwo();

        for (int i=0;i<3;i++){
            System.out.println("nameplayer"+(i+1)+"=>");

            Scanner myObj = new Scanner(System.in);
            String name = myObj.nextLine();
            p[i].name = name;
        }
        p[3].name = "d";
    }




    public void heighscore(){
        int x=3;


        while(x!=0){
            if(p[x-1].score>21)
                p[x-1].score=0;
            x--;
        }

        for(int i=0;i<4;i++){
            int j=3-i;

            if(p[i].score>=p[j].score && p[i].score>=p[Math.abs(j-1)].score && p[i].score>=p[Math.abs(j-2)].score){

                Hscore =p[i].score;
            }

        }



    }


    public String winner(){

        if(p[3].score>21){p[3].score=0;}
        for(int i=0;i<4;i++){

            int j=3-i;

            if(p[i].score>p[j].score && p[i].score>p[Math.abs(j-1)].score && p[i].score>p[Math.abs(j-2)].score){
                return  "the winner "+p[i].name ;
            }


        }

        return "PUCH";

    }


}




































    /*
 public void  set_value(Card D[]){
         for(int i=0;i<4;i++){
        for (int j=0;j<13;j++){

 D[count].setRank(j);
 D[count].setSuit(i);
 if(j>9)
  D[count].setValue(10);
 else{D[count].setValue(j+1);}

 count++;
         }
     }
 }

 */









/*




 Card[] thecard=new Card[52];

     thecard[i+j].setall(i, j, (j>9)?10:j);



*/