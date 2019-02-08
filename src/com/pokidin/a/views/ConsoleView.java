package com.pokidin.a.views;

import com.pokidin.a.contracts.IpFilter;

public class ConsoleView implements IpFilter.View {
    @Override
    public void showAccess(String access) {
        System.out.println(access);
    }
}
