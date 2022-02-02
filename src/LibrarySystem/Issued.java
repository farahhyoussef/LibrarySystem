/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**

 */
public class Issued {
    private Book issuedBook;
    private Student s;
    private String date;
    private String issueDate;
    private String penalty;
    int i ,j;
   
    Issued(String date,String issueDate,int indexStudent,int indexBook){
        this.issueDate=issueDate;
        this.date=date;
        i=indexStudent;
        j=indexBook;
              issuedBook=MainScreen.books[j];
              s=MainScreen.students[i];
}

    /**
     * @param penalty the penalty to set
     */
    public void setPenalty() throws ParseException {
       DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
      Date returnDate = new Date();
      Calendar cal = Calendar.getInstance();
         Date d1 = dateFormat.parse(getDate());
         Date d2 = dateFormat.parse(dateFormat.format(returnDate));
        
         if((d1.compareTo(d2) > 0)||(d1.compareTo(d2) == 0))
          { penalty="No";}
          else{penalty="Yes";}
    }

    /**
     * @return the issuedBook
     */
    public Book getIssuedBook() {
        return issuedBook;
    }

    /**
     * @return the s
     */
    public Student getS() {
        return s;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * @return the penalty
     */
    public String getPenalty() {
        return penalty;
    }
    
}
    
    

