package controller;

import bo.BONews;
import entity.Like;
import entity.News;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsController implements INewsController {
    private List<News> newsList;
    private List <Like> likeList;

    NewsController() {
        newsList = new ArrayList<>();
        likeList = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < 5; i++) {
            News news = new News();
            news.setHeader("HEADER");
            news.setCategoryId(j);
            news.setId(i);
            news.setPublicationDate(new Date(System.currentTimeMillis()));
            news.setPicture(null);
            newsList.add(news);
            j += 1;

            Like like = new Like();
            like.setNewId(i);
            like.setLikeNum(i * 100);
            likeList.add(like);
        }
    }

    @Override
    public BONews getNewsById(Integer id) {
        BONews boNews = new BONews();
        for (News news : newsList) {
            if (news.getId().equals(id)) {
                boNews.setHeader(news.getHeader());
                boNews.setId(news.getId());
                for (Like like : likeList) {
                    if (like.getNewId().equals(news.getId())) {
                        boNews.setLikeNum(like.getLikeNum());
                    }
                }
            }
        }
        return boNews;
    }

    @Override
    public boolean createNews(BONews BONews) {
        News news1 = new News();
        news1.setPicture(BONews.getPicture());
        news1.setId(BONews.getId());
        news1.setPublicationDate(BONews.getPublicationDate());
        news1.setHeader(BONews.getHeader());
        news1.setText(BONews.getText());
        news1.setCategoryId(1);
        newsList.add(news1);

        return true;
    }

    @Override
    public void deleteNews(BONews news) {

    }

    @Override
    public void updateNews(BONews news) {

    }

    @Override
    public List<News> getNews() {
        return null;
    }
}
