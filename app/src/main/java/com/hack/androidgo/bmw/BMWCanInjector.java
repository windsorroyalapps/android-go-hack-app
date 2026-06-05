package com.hack.androidgo.bmw;

// BMW CAN Injector stub - integrate with OBD adapters like ELM327 or custom
public class BMWCanInjector {
    public void injectCommand(String canId, String payload) {
        // TODO: Bluetooth/USB serial comms for CAN
        System.out.println("Injecting to BMW: " + canId + " " + payload);
    }
}