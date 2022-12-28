package Controller;
import java.util.List;

public class CategoryDO {
    CategoryClass category;

    public CategoryDO(int id, String name){
        category = new CategoryClass(id, name);
    }

    public int getId(){ return category.id; }
    public String getName(){return category.name; }
}

/*
import java.util.List;

//Список категорий
public class ListCategoriesDO {
    public List<CategoryDO> list;

    public ListCategoriesDO(List<CategoryDO> list) {
        this.list = list;
    }

}
 */