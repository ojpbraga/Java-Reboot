package classes;

public class Person {
    // Atributos da classe
    private String name;
    private int age;
    private float height;

    // Método Construtor
    // <visibilidade> <nome da classe>()
    public Person(String name, int age, float height) {
        // Primeiro método que ocorre quando o objeto é criado
        this.name = name;
        this.age = age;
        this.height = height;
        System.out.println("New person created!");
    }

    public void showData() {
        System.out.printf(
            "Name: %s\nAge: %d\nHeight: %.2f \n",
            name, age, height
        );
    }

    // Get e Set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    
}
