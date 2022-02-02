/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

/**
 *
 
 */
public class Librarian {
    private String name,password,email,address,city,contactNo;
   Librarian(String name,String password,String email,String address,String city,String contactNo){
       this.name=name;
       this.password=password;
       this.email=email;
       this.address=address;
       this.city=city;
        this.contactNo=contactNo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }
    
}
