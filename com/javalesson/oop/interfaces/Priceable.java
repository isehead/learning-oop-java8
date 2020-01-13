package com.javalesson.oop.interfaces;

public interface Priceable extends Deliverable, Orderable {

    default int calcPrice() {
        return calcOrderPrice() + calcDeliveryPrice();
    }

}
