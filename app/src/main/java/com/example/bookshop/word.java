package com.example.bookshop;

public class word {

    private String title;

    private String author;

    private String publisher;

    private String price;




    public word(String NewTitle, String NewAuthor, String NewPublisher, String NewPrice){

        title = NewTitle;
        author =  NewAuthor;
        publisher = NewPublisher;
        price = NewPrice;

    }

    //get title
    public String getTitle(){
        return title;
    }



    //Get author
    public String getAuthor(){
        return author;
    }
    //Get publisher
    public String getPublisher(){
        return publisher;
    }
    //Get price
    public String getPrice(){
        return price;
    }




}