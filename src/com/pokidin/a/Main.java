package com.pokidin.a;

import com.pokidin.a.contracts.IpFilter;
import com.pokidin.a.controllers.ControllerImpl;

public class Main {

    public static void main(String[] args) {

        IpFilter.Controller controller = new ControllerImpl();
        String inputString = args[0];
        controller.checkIp(inputString);
    }
}
