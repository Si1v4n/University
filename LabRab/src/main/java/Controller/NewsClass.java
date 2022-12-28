package Controller;

public class NewsClass {
    int id;
    String сategoryName; // Название категории
    String title; //Заголовок
    String text;
    String datePublication; // Дата публикации
    String author;

    NewsClass(int Id, String Name, String Title, String Text, String Date, String Author){
        id = Id;
        сategoryName = Name;
        title = Title;
        text = Text;
        datePublication = Date;
        author = Author;
    }
}
