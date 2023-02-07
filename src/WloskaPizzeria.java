public class WloskaPizzeria extends Pizzeria{
    @Override
    protected Pizza utworzPizze(String item) {
        if(item.equals("serowa"))
            return new WloskaSerowaPizza();
        else
        return null;
    }
}
