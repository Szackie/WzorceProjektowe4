import java.util.ArrayList;

public abstract class Pizza {
    String nazwa;
    String ciasto;
    String sos;
    ArrayList<String> dodatki=new ArrayList<String>();

    void przygotowanie() {
        System.out.println("Przygotowanie pizzy: " +
                nazwa);
        System.out.println("Wyrabianie ciasta... ");
        System.out.println("Dodawanie sosu...");
        System.out.println("Dodatki: ");
        for (String dodatek : dodatki)
            System.out.println("    " +
                    dodatek);
    }
    void pieczenie(){
        System.out.println("Pieczenie: 25 minut w temperaturze 180 stopni Celsjusza");
    }
    void krojenie(){
        System.out.println("Krojenie pizzy na 8 trojkatnych kawałkow");
    }
    void pakowanie(){
        System.out.println("Pakowanie pizzy do firmowego pudełka sieci Pizzeria");
    }
    public String pobierzNazwa(){
        return nazwa;
    }



}
