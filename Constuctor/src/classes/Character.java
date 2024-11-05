package classes;

import javax.swing.JOptionPane;

public class Character {
    private String name;
    private int level;
    private int strenght;
    private int life;
    private String role;

    public Character(String name, String role) {
        this.name = name;
        this.role = role;
        this.level = 10;
        this.strenght = (level * 2);
        this.life = (level + 5);
    }

    public void showStatus() {
        String status = String.format(
            "%s named %s, your status is:\n Level: %d\n Strenght: %s \n Life: %d",
            role, name, level, strenght, life
        );
        JOptionPane.showMessageDialog(null, status, "Character Status", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getStrenght() {
        return strenght;
    }
    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }

    
}
