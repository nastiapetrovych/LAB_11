package org.example.task2;

import lombok.Getter;
import lombok.Setter;

public class MailInfo {
    @Getter @Setter
    private Client client;
    @Getter @Setter
    private Mailcode mailcode;

    public String generate(){
       return mailcode.generate(client);
    }
}
