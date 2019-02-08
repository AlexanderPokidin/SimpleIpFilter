package com.pokidin.a;

import com.pokidin.a.contracts.IpFilter;
import com.pokidin.a.controllers.ControllerImpl;
import com.pokidin.a.models.ModelImpl;

public class Main {

    public static void main(String[] args) {

        String arg = "24.187.42.188";
        IpFilter.Controller controller;
        controller = new ControllerImpl();
        controller.compareIp(arg);
        // write your code here
    }
}
