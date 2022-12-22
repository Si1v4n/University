package controller;

import bo.BOCategory;

import java.util.ArrayList;
import java.util.List;

public class CategoryController implements ICategoryController {
    @Override
    public boolean renameCategory(int id, String name) {
        return true;
    }

    @Override
    public boolean addCategory(String name) {
        return true;
    }

    @Override
    public boolean deleteCategory(int id) {
        return true;
    }

    @Override
    public BOCategory getCategoryByID(Integer id) {
        return null;
    }

    @Override
    public BOCategory createBOCategory(Integer id) {
        return new BOCategory();
    }

    @Override
    public List<BOCategory> createBOListCategory(List<Integer> ids) {
        List<BOCategory> listOfCats = new ArrayList<>();
        for (Integer id : ids) {
            listOfCats.add(createBOCategory(id));
        }
        return listOfCats;
    }
}
