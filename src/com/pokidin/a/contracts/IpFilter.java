package com.pokidin.a.contracts;

import java.util.List;

public interface IpFilter {

    interface Model{
        List<String> getBlackIp();
    }

    interface View{
        void printResult(String response);
    }

    interface Controller{
        void compareIp(String args);
    }
}
