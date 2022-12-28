package Controller;

public class NewsController {
    NewsDO DO;
    String receivingListNews(){ return null; } // Получение списка новостей
    String receivingNews(){ return null; } // Получение конкретной новости
    void addNews(){ } // Добавление новости
    void updateNews(){ } // Обновление новости

    //Преобразование из DO в бизнес-объекты
    //Основные характеристики новости(название, категория, автор)
    String newsCharacteristic(){
        return DO.getCategoryName() + " " + DO.getTitle() + " " + DO.getAuthor();
    }

    //Получение всех новостей в порядке добавления
    String getNewsTime(){
        return DO.getTitle();
    }

    //Просто заголовки (id + tittle)
    String getTittle(){
        return DO.getId() + " " + DO.getTitle();
    }

    //Новости конкретного автора
    String getNewsAuthor(){
        return DO.getAuthor() + DO.getTitle();
    }

    //Удаление какой либо новости
    void deleteNews(){ }
}