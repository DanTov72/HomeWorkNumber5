public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth();
        boss.setDamage();
        boss.setDefence("Physical defence");
        System.out.println("Boss health: " + boss.getHealth(500) + " " + " boss damage: " + boss.getDamage(100) +
                "boss defence: " + boss.getDefence());
    }
}
