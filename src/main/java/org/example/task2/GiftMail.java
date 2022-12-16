package org.example.task2;

import org.example.User;

public class GiftMail implements Mailcode{
    private static String TEMPLATE = "%NAME, you won a new dyson!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME",client.getName());
    }
}
