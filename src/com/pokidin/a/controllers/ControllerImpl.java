package com.pokidin.a.controllers;

import com.pokidin.a.contracts.IpFilter;
import com.pokidin.a.models.FileModel;
import com.pokidin.a.views.ConsoleView;

import java.util.List;

public class ControllerImpl implements IpFilter.Controller {

    @Override
    public void checkIp(String arg) {
        IpFilter.Model model = new FileModel();
        String response = "Access allowed";
        List<String> blackIps = model.getBlackIps();
        for (String s : blackIps) {
            if (s.equals(arg)) {
                response = "Access disallowed";
                break;
            }
        }
        setAccess(response);
    }

    private void setAccess(String access) {
        IpFilter.View view = new ConsoleView();
        view.showAccess(access);
    }
}
