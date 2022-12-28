package Controller;

public class CategoryIO {
    FacadeController IO = new FacadeController();

    //Вывод категорий в алфавитном порядке
    public void alphabet(){
        IO.alphabetOrder();
    }

    //Информация о добавленной категории
    public void newCategory(){
        IO.addCategory();
    }

    //Изменения в категории
    public void changeCategory(){
        IO.updateCategory();
    }
}
