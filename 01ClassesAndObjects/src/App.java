public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Declara que o objeto é do tipo celular = Instanciando o objeto (criar um novo)
        Smartphone smartphoneA = new Smartphone();
        smartphoneA.name = "iPhone 15";
        smartphoneA.AmazenamentSpace = 128;
        smartphoneA.ScreenSize = 6.1f;
        smartphoneA.OperationSystem = "IOS";
        System.out.format("Smartphone: %s, Screen size: %.1f, Space: %dgb and SO: %s", smartphoneA.name, smartphoneA.ScreenSize, smartphoneA.AmazenamentSpace, smartphoneA.OperationSystem);

       Smartphone smartphoneB; // Declarando uma referência, precisa instanciar
       smartphoneB = new Smartphone(); // Instanciando

    }
}
