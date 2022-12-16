package org.example;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import org.example.task2.*;
import org.example.task2.Gender;

class Main{
    public static void main(String[] args) throws MailjetSocketTimeoutException, MailjetException {
        MailBox gmail = new MailBox();
        Client client1 = new Client("Vitaliy", Gender.MALE, 20);
        GiftMail giftMail = new GiftMail();
        MailInfo information = new MailInfo();
        information.setMailcode(giftMail);
        information.setClient(client1);
        information.generate();
        gmail.addMailInfo(information);
        gmail.sendAll();
    }

}