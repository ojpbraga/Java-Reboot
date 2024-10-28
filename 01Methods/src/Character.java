import java.util.Random;

public class Character {
    String name;
    int level;
    int strength;

    // void -> significa que o retorno não retorna nada
    void showStatus() {
        System.out.format("Character %s created!\nStrength: %d\nLvl: %d\n", name, strength, level);
    };

    int calculateDamage() {
        Random random = new Random();
        int valueRandom = random.nextInt(19) + 1;
        int valueDamage = strength + valueRandom;
        return valueDamage;
    }

    void attack(String target, String skill) {
        // Chamei um método atacar e passei como argument (quando passa a informação é chamado de argumento) uma string
        int valueDamage = calculateDamage();
        if (skill.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano!\n", name, target, valueDamage);
        } else {
            System.out.format("%s atacou %s e causou %d de dano!\nHabilidade usada: %s", name, target, valueDamage, skill);
        }
    }

}
