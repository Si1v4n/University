package Controller;

public class NewsIO {
    FacadeController IO = new FacadeController();

    //Основные характеристики новости(название, категория, автор)
    public void characteristics(){ IO.characteristic(); }

    //Получение всех новостей в порядке добавления
    public void newsTime(){ IO.newsTime(); }

    //Просто заголовки (id + tittle)
    public void tittle(){ IO.tittle(); }

    //Новости конкретного автора
    public void newsAuthor(){ IO.NewsAuthor();}

    //Удаление какой либо новости
    public void delete(){IO.deleteNews(); }

}
