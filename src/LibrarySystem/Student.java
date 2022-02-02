/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

/**
 *
 * 
 */
public class Student {
   private String studentName,studentPass,studentID,studentEmail,studentAddress,studentCity,studentContactNo,issueDate;
   private int numBorrowed;
   Student(String name,String password,String ID,String email,String address,String city,String contact ){
   studentName=name;
   studentPass=password;
   studentID=ID;
   studentEmail=email;
   studentAddress=address;
   studentCity=city;
   studentContactNo=contact;
   
         }
   
   

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @return the studentPass
     */
    public String getStudentPass() {
        return studentPass;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @return the studentEmail
     */
    public String getStudentEmail() {
        return studentEmail;
    }

    /**
     * @return the studentAddress
     */
    public String getStudentAddress() {
        return studentAddress;
    }

    /**
     * @return the studentCity
     */
    public String getStudentCity() {
        return studentCity;
    }

    /**
     * @return the studentContactNo
     */
    public String getStudentContactNo() {
        return studentContactNo;
    }

    /**
     * @return the issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * @return the numBorrowed
     */
    public int getNumBorrowed() {
        return numBorrowed;
    }

    /**
     * @return the state
     */
   
    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @param state the state to set
     */
  
    /**
     * @param numBorrowed the numBorrowed to set
     */
    public void setNumBorrowedAfterIssue(int numBorrowed) {
        this.numBorrowed = numBorrowed+1;
    }
        public void setNumBorrowedAfterReturn(int numBorrowed) {
        this.numBorrowed = numBorrowed-1;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @param studentPass the studentPass to set
     */
    public void setStudentPass(String studentPass) {
        this.studentPass = studentPass;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * @param studentEmail the studentEmail to set
     */
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    /**
     * @param studentAddress the studentAddress to set
     */
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    /**
     * @param studentCity the studentCity to set
     */
    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    /**
     * @param studentContactNo the studentContactNo to set
     */
    public void setStudentContactNo(String studentContactNo) {
        this.studentContactNo = studentContactNo;
    }
    
    
    
}
