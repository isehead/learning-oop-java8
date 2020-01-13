package com.javalesson.oop.interfaces;

import javafx.scene.control.Cell;

public class InterfaceRunner {

    public static void main(String[] args) {

        Priceable pizza = new Pizza("Neapolitana", 1, 20, Size.L);
        Priceable cellPhone = new CellPhone("Motorola", "XT1575", 1, 250);
        Priceable fridge = new Fridge("LG", "E9090", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(cellPhone);
        printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Deliverable del){
        System.out.println("Deliverable price "+del.calcDeliveryPrice());
        System.out.println("Order price "+del.calcOrderPrice());
    }

}
