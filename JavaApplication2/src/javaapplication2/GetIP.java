/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.net.InetAddress;
/**
 *
 * @author Thanh Duc
 */
public class GetIP {
   public static void main(String[] args){
       try{
           InetAddress inet=InetAddress.getByName("www.google.com");
           System.out.println("dia chi ip cua trang web google.com"+inet.getHostAddress());
       }catch (Exception e){
           e.printStackTrace();
           
       }
   }
}
