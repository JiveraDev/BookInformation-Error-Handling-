
package com.mycompany.book;

/**
 *
 * @author loren
 */

import java.util.Scanner;
import java.time.Year;

final class Bookinf{
    private String _title;
    private String _author;
    private int _publicationYear;
    
    public Bookinf(String Title, String Author, int PublicationYear){
        SetTitle(Title);
        SetAuthor(Author);
        SetPublicationYear(PublicationYear);
    }
    public void SetTitle(String Title){
        if (Title == null || "".equals(Title)){
            throw new IllegalArgumentException("No Title Entered");
        }else{
            _title = Title;
        }
    }
    public String GetTitle(){
        return _title;
    }
    public void SetAuthor(String Author){
        if (Author == null || "".equals(Author)){
            throw new IllegalArgumentException("No Author Inputed");
            
        }else
        {
            _author = Author;
        }
    }
    public String GetAuthor(){
        return _author;
    }
    public void SetPublicationYear(int PublicationYear){
        
        if (PublicationYear < 1945 || PublicationYear > Year.now().getValue()){
            
            throw new IllegalArgumentException("Invalid Year");
        }else{
             _publicationYear = PublicationYear ;
        }

    }
    public int GetPublicationYear(){
        return _publicationYear;
    }

}


public class BOOK {

    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in); 
        String title = "";
        String auth = "";
        int year =0;
        BOOK book = new BOOK();
        book.Instructions();
        System.out.print("Title: ");
        while (true){
                  try {
                // Prompt the user to enter the book title
                title = input.nextLine();
            
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }        // Input for author with validation
        System.out.print("Author: ");
        while (true) {
            try {
                // Prompt the user to enter the book author
                auth = input.nextLine();
                
                // Check if author is valid and break the loop if it is
                break;
            } catch (IllegalArgumentException e) {
                
                System.out.println(e.getMessage());
                
            }

        }
                System.out.print("Year: ");
            while (true) {
            try {
                // Prompt the user to enter the book author
                year = Integer.parseInt(input.nextLine());
                
                // Check if author is valid and break the loop if it is
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invaid Year Format "+e.getMessage());
                
            } catch (IllegalArgumentException e) {
                // Display error message for invalid publication year
                System.out.println(e.getMessage());
            }

        }

        Bookinf bookInfo = new Bookinf( title,  auth, year);
        
        System.out.println("\nTHANK YOU!\n\n");
        System.out.println("Book Title: "+ bookInfo.GetTitle());
        System.out.println("Book Author: "+ bookInfo.GetAuthor());
        System.out.println("Book Year of Publication: "+ bookInfo.GetPublicationYear());
        input.close();
        
    }

    
        public void Instructions(){
        System.out.println("BOOK INFORMATION! \nPlease Enter the Title, Author, and Publicatio Year");
    }
    
    
}
