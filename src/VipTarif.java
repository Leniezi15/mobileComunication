/*
 * Вип тариф наследник класс
 */


public class VipTarif extends Tarif {
    private final static String name = "Вип";
    VipTarif( double price, int amountClient, double payCommunication, double priceMinute) {
        super(name,  price,  amountClient, payCommunication,  priceMinute);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}