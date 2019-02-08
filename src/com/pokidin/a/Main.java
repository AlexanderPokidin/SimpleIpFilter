package com.pokidin.a;

import com.pokidin.a.contracts.IpFilter;
import com.pokidin.a.controllers.ControllerImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println(args);

        String arg = "24";
        IpFilter.Controller controller;
        controller = new ControllerImpl();
        String inputString = args[0];
        System.out.println("inputString: " + inputString);
        controller.compareIp(inputString);
    }
}
