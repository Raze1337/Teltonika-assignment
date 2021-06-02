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
        String data[] = input.split("(?<=\\G.{2})");
        
        int value[] = new int[data.length];
        
        for(int i = 0; i < data.length; i++)
        {
            value[i] = Integer.parseInt(data[i],16);
        }
        
        //timestamp
        //Calendar c=Calendar.getInstance();
        //c.setTimeInMillis(epoch);
        
        
    }
    
    public static void CommandHandler(String input)
    {
        
        switch(input){
            case ".exit":
                System.out.println("Exit command executed");
                break;
            case ".info":
                System.out.println("Info command executed");
                break;
        }
    }
}
