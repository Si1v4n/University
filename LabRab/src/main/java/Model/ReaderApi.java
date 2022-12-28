package Model;

import Controller.CategoryDO;
import Controller.NewsDO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/reader/")
@Produces({ MediaType.APPLICATION_JSON })
public class ReaderApi {
    CategoryDO oneCategory = new CategoryDO(1, "cat1");
    //CategoryDO twoCategory = new CategoryDO(2, "cat2");
    NewsDO oneNews = new NewsDO(1, "cat1", "economy", "text", "20.11.2022", "smirnov");
    //NewsDO twoNews = new NewsDO(2, "cat2", "sport",   "text", "23.11.2022", "smirnov");

    //Получить список категорий
    @GET
    @Path("/category/title")
    void getTitleСategory(){
        String str = oneCategory.getName();
        //str = twoCategory.getName();
    }

    //Получить заголовки новостей
    @GET
    @Path("/news/title")
    void getTitleNews(){
        String str = oneNews.getTitle();
        //str = twoNews.getTitle();
    }

    //Получить все новости
    @GET
    @Path("/news/title")
    void getNews(){
        String str = oneNews.getCategoryName() + " " + oneNews.getTitle() + " " + oneNews.getText() + " " +
                     oneNews.getDatePublication() + " " + oneNews.getAuthor();
    }

    //Получить новость из категории
    @GET
    @Path("/category/news")
    void getNewsFromTheCategory(String Category){
        String str;
        if (oneCategory.getName() == oneNews.getCategoryName())
            str = oneNews.getCategoryName() + " " + oneNews.getTitle() + " " + oneNews.getText() + " " +
                    oneNews.getDatePublication() + " " + oneNews.getAuthor();
    }
}
