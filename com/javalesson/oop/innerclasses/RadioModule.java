package com.javalesson.oop.innerclasses;

import java.util.SplittableRandom;

public class RadioModule {

    public RadioModule() {
        System.out.println("Radio initialized");
    }

    public void call(String number) {
        int length = 10;

        class GSMModule {
            private String phoneNumber;
            private int validNumber;

            public GSMModule(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public boolean isValid() {
                if (phoneNumber.length() != length) {
                    return false;
                } else {
                    try {
                        validNumber = Integer.parseInt(phoneNumber);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                }
            }

            public void dialIn() {
                if (isValid()) {
                    System.out.println("Calling " + validNumber + "...");
                } else {
                    System.out.println("The number is not valid");
                }
            }
        }

        GSMModule module = new GSMModule(number);
        module.dialIn();
    }
}
