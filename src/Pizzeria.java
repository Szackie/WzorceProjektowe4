public abstract class Pizzeria {
    public Pizza zamowPizze(String type){
        Pizza pizza;

        pizza = utworzPizze(type); // TO NIE JEST METODA STATYCZNA, TYLKO METODA Z TEJ SAMEJ KLASY (PATRZ NIZEJ)

        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();

        return pizza;
    }
    protected abstract Pizza utworzPizze(String item); //METODA TYPU FABRYKA
}
