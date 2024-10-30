public class App {
    public static void main(String[] args) throws Exception{

        VipParty party = new VipParty();
        // party.amountCoffee = 100;
        // party.drinkCoffee();
        party.enjoyParty();
        // System.out.println(party.amountCoffee);

        // private
        // public
        // protected
        // default -> package private

        // Netflix Account
        accountNetflix account1 = new accountNetflix();
        account1.enjoy();
        account1.whatchMovie("Kind Of Kidness");
        // account1.preferLanguege = "Portuguese"; Erro, pois agora é público
    }
}
