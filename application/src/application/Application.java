package application;

// @author Matas

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application
{
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        InputHandler();
    }
    
    public static void InputHandler() throws IOException
    {
        System.out.println("Enter data:");
        
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        
        String input = reader.readLine();
        
        if(input.startsWith("."))
        {
            CommandHandler(input);
        }
        else if(input.length() < 1)
        {
            System.out.println("Unknown input");
        }
        else
        {
            DataHandler(input);
        }
    }
    
    public static void DataHandler(String input)
    {
        byte[] dataValues = hexStringToByteArray(input);
    }
    
    public static byte[] hexStringToByteArray(String s) 
    {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) 
        {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
    
    public static void CommandHandler(String input)
    {
        
        switch(input){
            default:
                System.out.println("Unknown command");
                break;
            case ".exit":
                System.out.println("Exit command executed");
                break;
            case ".info":
                System.out.println("Info command executed");
                break;
        }
    }
}