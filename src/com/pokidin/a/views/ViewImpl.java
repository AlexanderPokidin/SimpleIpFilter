package com.pokidin.a.views;

import com.pokidin.a.contracts.IpFilter;

public class ViewImpl implements IpFilter.View {
    @Override
    public void printResult(String response) {
        System.out.println(response);
    }
}
