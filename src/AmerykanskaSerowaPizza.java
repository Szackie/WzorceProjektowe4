public class AmerykanskaSerowaPizza extends Pizza{
    public AmerykanskaSerowaPizza(){
        nazwa="Amerykanska pizza serowa";
        ciasto="Grube";
        sos="Sos pomidorowy";

        dodatki.add("Grubo tarty ser mozzarella");

    }
    @Override
    void krojenie(){
        System.out.println("Krojenie pizzy na kwadratowe kawalki");
    }
}
