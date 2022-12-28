package Controller;

public class CategoryController {
    CategoryDO DO;

    String receivingListCategory(){ return null; } // Получение списка категорий
    void addCategory(){ } // Добавление категории
    void updateCategory(){ } // Обновление категории
    void deleteCategory(){ } // Удаление категории

    //Вывод категорий в алфавитном порядке
    String getAlphabetOrder(){
        return DO.getName();
    }

    //Информация о добавленной категории
    String getAddCategory(){
        return DO.getName();
    }

    //Изменения в категории
    String getUpdateCategory(){
        return DO.getName();
    }
}