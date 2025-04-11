public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author){
        this.title = title.trim();
        this.author = author.trim();
        this.isAvailable = true;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void displayInfo(){
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Available:" + (isAvailable ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }
}
