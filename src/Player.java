import java.util.Scanner;
public class Player {
    private int damage;
    private int health;
    private int money;
    private int rhealth;
    private String name;
    private String cName;
    private Inventory inv;
    Scanner input=new Scanner(System.in);
    public Player(String name){
        this.name=name;
        this.inv=new Inventory();
    }
    public void selectCha(){
        switch(chaMenu()){
            case 1:
                setcName("Samuray");
                setDamage(5);
                setHealth(21);
                setMoney(15);
                setRhealth(health);
                break;
            case 2:
                setcName("Okçu");
                setDamage(7);
                setHealth(18);
                setMoney(20);
                setRhealth(health);
                break;
            case 3:
                setcName("Şövalye");
                setDamage(8);
                setHealth(24);
                setMoney(5);
                setRhealth(health);
                break;
        }
        System.out.println("Karakter:"+getcName()+"\tHasar:"+getdamage()+"\tSağlık:"+getHealth() +"\tPara:"+getMoney());
    }
    public int chaMenu(){
        System.out.println("Lütfen bir karakter seçiniz:");
        System.out.println("Türü:Samuray,Hasar:5,Sağlık:21,Para:15");
        System.out.println("Türü:Okçu,Hasar:7,Sağlık:18,Para:30");
        System.out.println("Türü:Şövalye,Hasar:8,Sağlık:24,Para:45");
        int chaID=input.nextInt();
        while(chaID<1||chaID>3){
            System.out.println("Lütfen geçerli bir karakter giriniz:");

        }
      return chaID;

    }
    public int getTotalDamage(){
       return this.getdamage()+this.getInv().getdamage();
    }

    public int getdamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }
    public int getRhealth() {
        return rhealth;
    }
    public void setRhealth(int rhealth) {
        this.rhealth = rhealth;
    }
}
