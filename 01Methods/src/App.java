public class App {
    public static void main(String[] args) throws Exception {
        Character hero = new Character();
        hero.name = "Apey";
        hero.level = 3;
        hero.strength = 10;

        hero.showStatus();
        hero.attack("Hydra", "Golpe Duplo");
        System.out.println(hero.calculateDamage());

    }
}
