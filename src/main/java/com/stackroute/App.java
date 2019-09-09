package com.stackroute;

/**
 * Hello world!
 *
 */
public class App 
{
    public String checkPelindrome( String str )
    {
        if(str == "") return "";
        String reverse = "";
        for(int i = (str.length()-1);i>=0;i--){
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            return "pelindrome";
        }

        return "";


    }
}
