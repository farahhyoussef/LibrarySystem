/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

/**
 *

 */
public class Book {
    private String callNo, name, author, publisher;
    private int quantity;
            Book(String callNo,String name,String author,String publisher,int quantity)
            {
                this.callNo=callNo;
                this.name=name;
                this.author=author;
                this.publisher=publisher;
                this.quantity=quantity;
            }

    /**
     * @return the callNo
     */
    public String getCallNo() {
        return callNo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantityAfterIssuing(int quantity) {
        this.quantity = quantity-1;
    }
     public void setQuantityAfterReturning(int quantity) {
        this.quantity = quantity+1;
    }
    
}
