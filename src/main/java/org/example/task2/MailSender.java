package org.example.task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    private  String myEmail = "anastasiiapetrovych@ucu.edu.ua";
    private String name = "Anastasiia";
    public void sendMail(MailInfo mailInfo) throws MailjetException, MailjetSocketTimeoutException{
            MailjetClient client;
            MailjetRequest request;
            MailjetResponse response;
            client = new MailjetClient("06b3f0f8ebf3574faf2d507c093347ba", "64abbbb41eda37fd413b370198362f50", new ClientOptions("v3.1"));
            request = new MailjetRequest(Emailv31.resource)
                    .property(Emailv31.MESSAGES, new JSONArray()
                            .put(new JSONObject()
                                    .put(Emailv31.Message.FROM, new JSONObject()
                                            .put("Email", myEmail)
                                            .put("Name", name))
                                    .put(Emailv31.Message.TO, new JSONArray()
                                            .put(new JSONObject()
                                                    .put("Email", mailInfo.getClient().getEmail())
                                                    .put("Name", mailInfo.getClient().getName())))
                                    .put(Emailv31.Message.SUBJECT, "")
                                    .put(Emailv31.Message.TEXTPART, mailInfo.generate())
                                    .put(Emailv31.Message.HTMLPART, "")
                                    .put(Emailv31.Message.CUSTOMID, "")));
            response = client.post(request);
            System.out.println(response.getStatus());
            System.out.println(response.getData());
        }
    }
