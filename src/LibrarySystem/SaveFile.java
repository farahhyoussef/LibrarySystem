/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 
 */
public class SaveFile {
    static void saveStudents(String sFileName)throws FileNotFoundException
    {
       File f=new File ("students.txt");
       PrintWriter pw = new PrintWriter(f);
       for(int i=0;i<MainScreen.numStudents;i++)
       {
           pw.println(MainScreen.students[i].getStudentName()+","+MainScreen.students[i].getStudentPass()+","+MainScreen.students[i].getStudentID()+","+MainScreen.students[i].getStudentEmail()+" ,"+MainScreen.students[i].getStudentAddress()+","+MainScreen.students[i].getStudentCity()+","+MainScreen.students[i].getStudentContactNo()+",");
       }
       pw.close();
    }
    
    static void saveBooks(String bFileName)throws FileNotFoundException
    {
        File f=new File("books.txt");
        PrintWriter pw = new PrintWriter(f);
        for(int i=0;i<MainScreen.numBooks;i++)
       {
           pw.println(MainScreen.books[i].getCallNo()+","+MainScreen.books[i].getName()+","+MainScreen.books[i].getAuthor()+","+MainScreen.books[i].getPublisher()+","+MainScreen.books[i].getQuantity()+",");
       }
       pw.close();
    }
    static void saveLibrarians(String lFileName) throws FileNotFoundException
    {
        File f=new File("librarians.txt");
        PrintWriter pw = new PrintWriter(f);
        for(int i=0;i<MainScreen.numLibrarians;i++)
       {
           pw.println(MainScreen.librarians[i].getName()+","+MainScreen.librarians[i].getPassword()+","+MainScreen.librarians[i].getEmail()+","+MainScreen.librarians[i].getAddress()+","+MainScreen.librarians[i].getCity()+","+MainScreen.librarians[i].getContactNo()+",");
       }
       pw.close();
    }
    
    static void saveIssued(String iFileName) throws FileNotFoundException
    {
        File f=new File("issuedBooks.txt");
        PrintWriter pw = new PrintWriter(f);
        
        for(int i=0;i<MainScreen.numIssued;i++)
       {
           pw.println(MainScreen.issuedBooks[i].getIssuedBook().getCallNo()+","+MainScreen.issuedBooks[i].getS().getStudentID()+","+MainScreen.issuedBooks[i].getS().getStudentName()+","+MainScreen.issuedBooks[i].getS().getStudentContactNo()+","+MainScreen.issuedBooks[i].getIssueDate()+","+MainScreen.issuedBooks[i].getDate()+",");
       }
       pw.close();
    }
    
}
