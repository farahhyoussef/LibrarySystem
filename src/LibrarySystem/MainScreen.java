/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class MainScreen {

    /**
     * @param args the command line arguments
     */
    final static int SIZE =200;
    
    public static Librarian[] librarians= new Librarian[SIZE];
    public static int numLibrarians=0;
 
    public static Book[] books=new Book[SIZE]; 
    public static int numBooks=0;
    
    public static Student[] students=new Student[SIZE];
    public static int numStudents=0;
    
    public static Issued[] issuedBooks= new Issued[SIZE];
    public static int numIssued=0;
    
    public static int loginStudent;
    
    static void readStudents(String sFileName)throws FileNotFoundException {
        File f = new File(sFileName);
        Scanner s=new Scanner(f);
        while(s.hasNext()){
        String x= s.nextLine();
        String token[] = x.split(",");
     
                Student studentFile = new Student(token[0],token[1],token[2],token[3],token[4],token[5],token[6]);
        students[numStudents]=studentFile;
        numStudents++;
        }
    }
      static void readBooks(String bFileName)throws FileNotFoundException {
        File f = new File(bFileName);
        Scanner s=new Scanner(f);
        while(s.hasNext()){
        String x= s.nextLine();
        String token[] = x.split(",");
       int quant=Integer.parseInt(token[4]);  
               Book bookFile = new Book(token[0],token[1],token[2],token[3],quant);
        books[numBooks]=bookFile;
        numBooks++;
        }
    }
      static void readLibrarians(String lFileName)throws FileNotFoundException {
        File f = new File(lFileName);
        Scanner s=new Scanner(f);
        while(s.hasNext()){
        String x= s.nextLine();
        String token[] = x.split(",");
    
              Librarian librarianFile = new Librarian(token[0],token[1],token[2],token[3],token[4],token[5]);
        librarians[numLibrarians]=librarianFile;
        numLibrarians++;
        }
    }
      static void readIssued(String iFileName)throws FileNotFoundException {
        File f = new File(iFileName);
        Scanner s=new Scanner(f);
        while(s.hasNext()){
        String x= s.nextLine();
        String token[] = x.split(",");
         int indexBook=0;
        for(int i=0;i<numBooks;i++){
        if( token[0].equals(books[i].getCallNo())) {
             indexBook=i;
            } 
            }
        int indexStudent=0;
        
         for(int i=0;i<numStudents;i++){
        if( token[1].equals(students[i].getStudentID())) {
           indexStudent=i;
           students[i].setNumBorrowedAfterIssue(students[i].getNumBorrowed());
            } 
            }
    
              Issued issuedFile= new Issued(token[5],token[4],indexStudent,indexBook);
              
              issuedBooks[numIssued]= issuedFile;
        
        numIssued++;
        }
    }
      
     
      
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       try{ readStudents("students.txt");}
       catch(FileNotFoundException  e){System.out.println("Students File Not found"); }
        try{ readBooks("books.txt");}
       catch(FileNotFoundException  e){System.out.println("Books File Not found"); }
        try{ readLibrarians("librarians.txt");}
       catch(FileNotFoundException  e){System.out.println("Librarians File Not found"); }
         try{ readIssued("issuedBooks.txt");}
       catch(FileNotFoundException  e){System.out.println("Issued File Not found");}
        new LibraryManagement().setVisible(true);
    }
    
}

