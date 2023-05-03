
public abstract class Art {
    
    private String title;
    private String author;
    private String description;

//Contructor
public Art (String title, String author, String description) {
    this.title = title;
    this.author = author;
    this.description = description;
}

public abstract void viewArt();

//Getters
public String getTitle(){
    return title;
}

public String getAuthor(){
    return author;
}

public String getDescription(){
    return description;
}

//Setters
public void setTitle(String title){
    this.title = title;
}

public void setAuthor(String author){
    this.author = author;
}

public void setDescription(String description){
    this.description = description;
}

}