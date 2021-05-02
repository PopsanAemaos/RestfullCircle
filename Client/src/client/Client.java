/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Result;
import util.NewJerseyClient;


/**
 *
 * @author Popsan
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJerseyClient client = new NewJerseyClient();
        String xml = client.getXml("7");
        Result res = JAXB.unmarshal(new StringReader(xml), Result.class);
        System.out.println("Area : " + res.getArea());
        System.out.println("Circum : " + res.getCircum());
    }
    
}
