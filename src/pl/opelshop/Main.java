package pl.opelshop;

import pl.opelshop.service.MenuService;

public class Main {
    public static void main(String[] args) {

        MenuService menu = new MenuService();

        menu.showMenu();


    }
}
