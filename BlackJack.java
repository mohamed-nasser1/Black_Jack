package blackjack;
import java.util.Scanner;

public class BlackJack {
    static  Game g=new Game();
    public static void main(String[] args) {
        GUI gui=new GUI();
        g.makecard();
        g.info();
        gui.runGUI( g.card, g.p[0].getCard(), g.p[1].getCard(), g.p[2].getCard(), g.p[3].getCard());
        Scanner myObj = new Scanner(System.in);
        for(int i=0;i<3;i++){
            int j=0;
            while(true){
                if(g.p[i].score>=21){
                    System.out.println(g.p[i].name+"Busted -- your score = "+g.p[i].score);
                    break;
                }
                System.out.println(g.p[i].name+" your score = "+g.p[i].score+" Hit or Stand");
                String HorS = myObj.nextLine();
                if(HorS.equals("Stand")){
                    break;
                }

                Card c = g.takeone(i, j);
                gui.updatePlayerHand(c,i);
                j++;

            }
        }




        g.heighscore();

        while(true){
            int j=0;

            if(g.p[3].score>=21 || g.p[3].score>g.Hscore )
            {break;  }

            Card c = g.takeone(3, j);
            gui.updateDealerHand(c, g.card);
            j++;
        }

        g.heighscore();

        for (int i=0;i<4;i++){
            System.out.println(g.p[i].name+"  "+g.p[i].score);
        }



        System.out.println(g.winner());
    }

}
