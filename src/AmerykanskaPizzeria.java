public class AmerykanskaPizzeria extends Pizzeria{
    @Override
    protected Pizza utworzPizze(String item) {
        if(item.equals("serowa"))
            return new AmerykanskaSerowaPizza();
        else
        return null;
    }
}
