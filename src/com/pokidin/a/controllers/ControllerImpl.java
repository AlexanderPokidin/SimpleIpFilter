package com.pokidin.a.controllers;

import com.pokidin.a.contracts.IpFilter;
import com.pokidin.a.models.ModelImpl;
import com.pokidin.a.views.ViewImpl;

import java.util.List;

public class ControllerImpl implements IpFilter.Controller {

    private IpFilter.Model model;
    private List<String> blackIps;
    private IpFilter.View view;

    @Override
    public void compareIp(String arg) {
        model = new ModelImpl();
        String response = "Access allowed";
        blackIps = model.getBlackIp();
        for (String s : blackIps) {
            if (s.equals(arg)) {
                response = "Access disallowed";
                break;
            }
        }
        setAccess(response);
    }

    private void setAccess(String access) {
        view = new ViewImpl();
        view.printResult(access);
    }
}
