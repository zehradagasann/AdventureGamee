import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    private String name;
    Scanner input=new Scanner(System.in);

    public void login(){
        Scanner input=new Scanner(System.in);
        System.out.println("Macera oyununa hoşgeldiniz!");
        System.out.print("Oyuna başlamadan önce isminizi giriniz:");
        String playerName=input.nextLine();
         player=new Player(playerName);
        player.selectCha();
        start();
    }
public void start(){
       while(true){
           System.out.println();
           System.out.println("============");
           System.out.println();
           System.out.println("Eylem gerçekleştirmek için yer giriniz:");
           System.out.println("1.Güvenli Ev-->Size ait güvenli bir mekan,düşman yok.");
           System.out.println("2.Mağara-->Burada karşınıza zombi çıkabilir");
           System.out.println("3.Orman-->Burada karşınıza vampir çıkabilir.");
           System.out.println("4.Nehir-->Burada karşınıza ayı çıkabilir.");
           System.out.println("5.Mağaza-->Silah veya zırh alabilirsiniz.");
           int selLoc=input.nextInt();
           while(selLoc<0||selLoc>5){
               System.out.println("Geçerli bir yer giriniz:");
               selLoc=input.nextInt();
           }
           switch(selLoc){
               case 1:
                   location=new SafeHouse(player);
                   break;
                   case 2:
                       location=new Cave(player);
                       break;
                       case 3:
                           location=new Forest(player);
                           break;
               case 4:
                   location=new River(player);
                   break;
               case 5:
                   location=new ToolStore(player);
                   break;
           }
           if(location.getClass().getName().equals("SafeHouse")){
               if(player.getInv().food()&&player.getInv().firewood()&&player.getInv().water()){
                   System.out.println("Tebrikler !Oyunu kazandınız");
               }
           }
          if(location.getLocation()){
              System.out.println("Oyun bitti.");
              break;
          }
       }
}
}
