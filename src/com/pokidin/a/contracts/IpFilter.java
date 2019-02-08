package com.pokidin.a.contracts;

import java.util.List;

public interface IpFilter {

    interface Model {
        List<String> getBlackIps();
    }

    interface View {
        void showAccess(String access);
    }

    interface Controller {
        void checkIp(String args);
    }
}
