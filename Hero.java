import java.sql.DatabaseMetaData;

public class Hero {
    private int health;
    private double damage;
    private String superpower;
    public int getHealth(){
        return health;
    }
    public double getDamage(){
        return damage;
    }
    public String getSuperpower(){
        return superpower;
    }
    private Hero (int health,double damage,String superpower){
        this.health = health;
        this.damage = damage;
        this.superpower=superpower;
    }
    private Hero (int health,double damage){
        this.health = health;
        this.damage=damage;
    }
}
