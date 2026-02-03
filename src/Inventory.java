public class Inventory {
    private boolean water,food,firewood;
    private String wName,aName;
    private int damage,armor;

    public boolean isWater() {
        return water;
    }


    Inventory() {
        this.water=false;
        this.food=false;
        this.firewood=false;
        this.damage=0;
        this.armor=0;
        this.wName=null;
        this.aName=null;
    }
    public boolean water() {
        return water;
    }
    public void setwater(boolean water) {
        this.water = water;
    }
    public boolean food() {
        return food;
    }
    public void setfood(boolean food) {
        this.food = food;
    }
    public boolean firewood() {
        return firewood;
    }
    public void setfirewood(boolean firewood) {
        this.firewood = firewood;
    }
    public int getdamage() {
        return damage;
    }
    public void setdamage(int damage){
        this.damage=damage;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor=armor;
    }
    public String getwName() {
        return wName;
    }
    public void setwName(String wName) {
        this.wName = wName;
    }
    public String getaName() {
        return aName;
    }
    public void setaName(String aName) {
        this.aName = aName;
    }


}
