package com.pokidin.a.models;

import com.pokidin.a.contracts.IpFilter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModelImpl implements IpFilter.Model {

    @Override
    public List<String> getBlackIp() {
        List<String> blackLists = new ArrayList<>();
        try {
            FileReader reader = new FileReader("BlackIpList");
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String singleIp = scanner.nextLine();
                blackLists.add(singleIp);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return blackLists;
    }

}
