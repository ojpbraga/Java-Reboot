
public class VipParty {
    
    // <modificador> <tipo> <nome-atributo>
    private int amountCoffee = 30;
    private int amoutSnacks = 50;

    // Precisa ser público para acessar os métodos privados
    // Por default o padrão é package-private
    public void enjoyParty() {
        drinkCoffee();
        eateSnack();
        drinkCoffee();
    };

    // Temos o modificador chamado protect, será usado mais a frente
    
    // <modificador> <retorno> <nomeMetodo>
    private void drinkCoffee() {
        amountCoffee--;
        System.out.println("Drank 1 cup of coffee");
    }

    private void eateSnack() {
        amoutSnacks--;
        System.out.println("Ate 1 snack");
    }

}
