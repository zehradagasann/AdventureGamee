public class SafeHouse extends NormalLoc {
    SafeHouse(Player player){
        super(player,"Güvenli Ev");

    }
    public boolean getLocation() {
        player.setHealth(player.getHealth());
        System.out.println("Sağlığınız iyileşti");
        System.out.println("Şuan güvenli evdesiniz");
        return true;
    }
}