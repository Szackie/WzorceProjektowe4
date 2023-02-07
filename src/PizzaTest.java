public class PizzaTest {
    public static void main(String [] args){
        Pizzeria wloskaPizzeria = new WloskaPizzeria();
        Pizzeria amerykanskaPizzeria = new AmerykanskaPizzeria();

        Pizza pizza = wloskaPizzeria.zamowPizze("serowa");
        System.out.println("Klient 1 zamowiel: " +
                pizza.pobierzNazwa() + "\n");

        pizza= amerykanskaPizzeria.zamowPizze("serowa");
        System.out.println("Klient 2 zamowiel: " +
                pizza.pobierzNazwa() + "\n");


    }
}
