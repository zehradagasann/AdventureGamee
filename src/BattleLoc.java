public abstract class BattleLoc extends Location {
    protected Obstacle obs;
    protected String award;

    BattleLoc(Player player, String name, Obstacle obs,String award) {
        super(player);
        this.name = name;
        this.obs = obs;
        this.award = award;
    }

    public boolean getLocation() {
        int obsCount = obs.count();
        System.out.println("Şuan buradasınız:" + this.getName());
        System.out.println("Dikkatli ol! Burada" + obsCount + "tane" + obs.getName() + "yaşıyor");
        System.out.println("<S>avaş veya <K>aç");
        String selCase = input.nextLine();
        selCase = selCase.toUpperCase();
        if (selCase.equals("S")) {
            if (combat(obsCount)) {
                System.out.print(this.getName() + "bölgesindeki tüm düşmanları temizlediniz!");
                if(this.award.equals("food")&&player.getInv().food()==false){
                    System.out.println(this.award+"Kazandınız");
                    player.getInv().setfood(true);
                }else if(this.award.equals("water")&&player.getInv().water()==true){
                    System.out.println(this.award+"Kazandınız");
                    player.getInv().setwater(true);
                }else if(this.award.equals("firewood")&&player.getInv().firewood()==true){
                    System.out.println(this.award+"Kazandınız");
                    player.getInv().setfirewood(true);
                }
                return true;
            } else {
                System.out.println("Öldünüz!");
                return false;
            }
        }

        return true;
    }

    public boolean combat(int obsCount) {
        for (int i = 0; i < obsCount; i++) {
            int defobshealth=obs.getHealth();
            playerStats();
            enemyStats();
            while(player.getHealth()>0&& obs.getHealth()>0){
          System.out.println("<V>ur veya <K>aç");
          String selCase = input.nextLine();
          selCase = selCase.toUpperCase();
          if(selCase.equals("V")) {
              System.out.println("Siz vurdunuz!");
              obs.setHealth(obs.getHealth()-player.getTotalDamage());
              afterHit();
              if(obs.getHealth()>0){
                  System.out.println();
                  System.out.println("----------");
                  System.out.println("Canavar size vurdu!");
                  player.setHealth(player.getHealth()-(obs.getDamage()-player.getInv().getArmor()));
                  afterHit();
              }

          }else{
              break;
          }
            }
            if(obs.getHealth()<=0&&player.getHealth()>0){
          System .out.println("Siz vurdunuz!");
            player.setMoney(player.getMoney()+obs.getAward());
            System.out.println("Güncel Paranız: " + player.getMoney());
            obs.setHealth(defobshealth);
            }else{
                return false;
            }
        }
        return true;
    }

    public void playerStats() {
        System.out.println("Oyuncu Değerleri\n----------");
        System.out.println("Can:" + player.getHealth());
        System.out.println("Hasar:" + player.getTotalDamage());
        System.out.println("Para:" + player.getMoney());

        if (player.getInv().getdamage() > 0) {
            System.out.println("Silah:" + player.getInv().getwName());
        } // if bloğu kapatıldı

        if (player.getInv().getArmor() > 0) {
            System.out.println("Zırh:" + player.getInv().getaName());
        }
    } // playerStats METODU BURADA KAPANMALI

    public void enemyStats() {
        System.out.println(this.obs.getName() + " Değerleri:");
        System.out.println("Can:" + this.obs.getHealth());
        System.out.println("Hasar:" + this.obs.getTotalDamage());
        System.out.println("Para:" + this.obs.getMoney());
        System.out.println("Ödül:" + this.obs.getAward());
    }
    public void afterHit(){
        System.out.print("Oyuncu canı :"+player.getHealth()+"\n");
        System.out.print(obs.getName()+"Canı :"+obs.getHealth()+"\n");
    }

    }

