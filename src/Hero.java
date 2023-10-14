

public class Hero {
    private int Heal;
    private int damage;
    private String Superpower;

    public Hero(int heal, int damage, String superpower) {
        Heal = heal;
        this.damage = damage;
        Superpower = superpower;
    }

    public Hero(int heal, int damage) {
        Heal = heal;
        this.damage = damage;
    }

    public int getHeal() {
        return Heal;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return Superpower;
    }
}
