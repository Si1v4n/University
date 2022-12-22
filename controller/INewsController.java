package controller;

import bo.BONews;
import entity.News;

import java.util.List;

public interface INewsController {
    BONews getNewsById(Integer id);
    boolean createNews(BONews BONews);
    void deleteNews(BONews news);
    void updateNews(BONews news);
    List<News> getNews();
}
