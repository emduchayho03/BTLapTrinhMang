package javaapplication2;

import java.net.InetAddress;

public class JavaApplication2 {
    public static void main (String[] args){
        try {
           InetAddress inet=InetAddress.getByName("www.google.com");
           boolean isKN=inet.isReachable(5000);
           if(isKN){
               System.out.println("Co internet");
           }
           else{
               System.out.println("Khong ket no duoc voi internet");
           }
        } catch (Exception e){
            e.printStackTrace();
           
            
        }
    }
}