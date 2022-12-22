package controller;

import bo.BONews;
import entity.News;

import java.util.List;

public class Facade {
    private INewsController newsController = new NewsController();
    private ICategoryController ICategoryController;

    public BONews getNew(Integer id) {
        return newsController.getNewsById(id);
    }

    public List<News> getNews() {
        return newsController.getNews();
    }

    public boolean createNew(BONews boNews) {
        return newsController.createNews(boNews);
    }

    public void updateNew(BONews news) {
        newsController.updateNews(news);
    }

    public void deleteNew(BONews news) {
        newsController.deleteNews(news);
    }

    public void addCat(String name){
        ICategoryController.addCategory(name);
    }

    public void deleteCat(int id){
        ICategoryController.deleteCategory(id);
    }

    public void renameCat(int id, String name){
        ICategoryController.renameCategory(id, name);
    }
}
