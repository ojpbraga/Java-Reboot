package classes;
public class Person {
    // Private: esses dados só podem ser trocados dentro da classe
    private String name;
    private int age;
    private double height;

    // Get
    public String getName() {
        return name;
    };
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        // this refere-se a classe = name refere-se ao parâmetro
        // é utilizado quando as variaveis tem o mesmo nome
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }

}