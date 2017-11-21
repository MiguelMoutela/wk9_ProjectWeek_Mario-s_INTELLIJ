package Menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Sellable> menu = new ArrayList<>();

    public void removeFromMenu(Sellable item) {
        menu.remove(item);
    }
    public void addToMenu(Sellable item) {
        menu.add(item);
    }
}
