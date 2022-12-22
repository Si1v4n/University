package controller;

import bo.BOCategory;

import java.util.List;

public interface ICategoryController {
    boolean addCategory(String name);
    boolean renameCategory(int id, String name);
    boolean deleteCategory(int id);
    BOCategory getCategoryByID(Integer id);
    BOCategory createBOCategory(Integer id);
    List<BOCategory> createBOListCategory(List<Integer> ids);
}
