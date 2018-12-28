package Properties;

import java.util.*;
public class Property {

    public static void main(String args[]) {
        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("Ethiopia", "Addis Ababa");
        capitals.put("Kenya", "Nairobi");
        capitals.put("Eritrea", "Asmera");
        capitals.put("Sudan", "Khartoum");
        capitals.put("Uganda", "Kampala");

        states = capitals.keySet();
        Iterator itr = states.iterator();

        while(itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("The capital of " + str + " is " +
                    capitals.getProperty(str) + ".");
        }
        System.out.println();

        str = capitals.getProperty("Somalia", "Not Found");
        System.out.println("The capital of Somalia is " + str + ".");
    }
}