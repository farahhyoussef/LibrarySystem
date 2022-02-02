/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import javax.swing.JOptionPane;

/**
 *
 
 */
public class Validations {
    static boolean phoneValidation(String contact)
{
    int num,counter=0,i,j;
        String token = contact;
        if(!contact.equals(" ")){
    if(token.charAt(0)=='+'||isDigit(token.charAt(0)))
    {
        for(i=1; i<token.length(); i++)
        {
            if(isDigit(token.charAt(i)))
            counter++;

        }
        if(counter!=token.length()-1)
        {
           
            return false;
        }
    }
    else
    {
        
        return false;
    }}
    return true;
}

    


static boolean emailValidation(String email)

{
    int i,at=0,counter=0;
    boolean n;
    if(!email.equals(" ")){
    n=isLetter(email.charAt(0));
    if (!n)
    {
       
        return false;
    }
    for(i=0; i<email.length(); i++)
    {
        if(email.charAt(i)=='@')
        {
            at=i;
            counter++;
        }
    }
    if (counter!=1)
    {
        return false;
    }
    else
    {
        for(i=0; i<at; i++)
        {
            if(!(isLetter(email.charAt(i))||isDigit(email.charAt(i))||email.charAt(i)=='.'||email.charAt(i)=='_'||email.charAt(i)=='-'))
            {
               
                return false;
            }
        }
        int dot=0,c=0;
        for(i=at; i<email.length(); i++)
        {
            if(email.charAt(i)=='.')
            {
                dot=i;
                c++;
            }
        }
        if(dot==at+1)
        {
            return false;
        }
        else
        {
            for(i=at+1; i<dot; i++)
            {
                if(!isLetter(email.charAt(i)))
                {
                    return false;
                }
            }
            String com="com";

            for(i=0; i<3; i++)
            {

                if(email.charAt(dot+1+i)!=com.charAt(i))
                {
                    return false;
                }
            }

        }
    
        return true;
    }
    }
    return true;
}

static boolean studentIDValid(String id){
   int counter=0;
    for(int i=0;i<id.length();i++){
        
           
            if(isDigit(id.charAt(i)))
            counter++;
                   

        }
   
    
        if(counter!=id.length())
        {
           
            return false;
        }
        boolean found=false;
        for(int i=0;i<MainScreen.numStudents;i++){
            if(MainScreen.students[i].getStudentID().equals(id))
                found=true;
        }
        if(found) return false;
        return true;
    }
    
    
 static String checkIfEmpty(String entry)   
 {if(entry.isEmpty())
 entry=" ";
 return entry;
 }
 
static boolean quantityValidation(String quantity) 
{
 int counter=0;
    for(int i=0;i<quantity.length();i++){
        
           
            if(isDigit(quantity.charAt(i)))
            counter++;
                   

        }
  
        if(counter!=quantity.length())
        {
           
            return false;
        }
        return true;
        
}

static boolean callNoValidation(String callNo){
    boolean found=false;
        for(int i=0;i<MainScreen.numBooks;i++){
            if(MainScreen.books[i].getCallNo().equals(callNo))
                found=true;
        }
        if(found) return false;
        return true;
}
}