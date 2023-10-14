import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

    Boss boss = new Boss ();
    boss.setTypesOfProtection("hit");
    boss.getHeal();
    boss.getDamage();
        System.out.println( "жизнь босса "+boss.getHeal()+ " урон босса  "+boss.getDamage()+ " тип атаки босса " + boss.getTypesOfProtection());

    }}