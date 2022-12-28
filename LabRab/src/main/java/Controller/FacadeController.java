package Controller;

public class FacadeController {
    private NewsController newsCont;
    private CategoryController catCont;

    void receivingListNews(){ newsCont.receivingListNews(); }
    void receivingNews(){ newsCont.receivingNews(); }
    void addNews(){ newsCont.addNews(); }
    void updateNews(){ newsCont.updateNews(); }

    void receivingListCategory(){ catCont.receivingListCategory(); }
    void deleteCategory(){ catCont.deleteCategory(); }

    //Преобразование данных: из бизнес объекта в IO
    //Основные характеристики новости(название, категория, автор)
    FacadeController characteristic(){
        newsCont.newsCharacteristic();
        return null;
    }

    //Получение всех новостей в порядке добавления
    FacadeController newsTime(){
        newsCont.getNewsTime();
        return null;
    }

    //Просто заголовки (id + tittle)
    FacadeController tittle(){
        newsCont.getTittle();
        return null;
    }

    //Новости конкретного автора
    FacadeController NewsAuthor(){
        newsCont.getNewsAuthor();
        return null;
    }

    //Удаление какой либо новости
    FacadeController deleteNews(){
        newsCont.deleteNews();
        return null;
    }

    //Вывод категорий в алфавитном порядке
    FacadeController alphabetOrder(){
        catCont.getAlphabetOrder();
        return  null;
    }

    //Информация о добавленной категории
    FacadeController addCategory(){
        catCont.getAddCategory();
        return  null;
    }

    //Изменения в категории
    FacadeController updateCategory(){
        catCont.getUpdateCategory();
        return  null;
    }
}
