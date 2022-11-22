package Task_265;

public interface Character {
    public void attack(Character[] characters);
    public void destroy();

    public int maxArmor = 100;
    public int maxDamage = 100;
}
