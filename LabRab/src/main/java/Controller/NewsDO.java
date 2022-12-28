package Controller;

public class NewsDO {
    NewsClass news;

    public NewsDO(int id, String сategoryName, String title, String text, String datePublication, String author){
        news = new NewsClass(id, сategoryName, title, text, datePublication, author);
    }

    public int getId(){ return news.id; }
    public String getCategoryName(){ return news.сategoryName; }
    public String getTitle(){ return news.title; }
    public String getText(){ return news.text; }
    public String getDatePublication(){ return news.datePublication; }
    public String getAuthor(){ return news.author; }
}
