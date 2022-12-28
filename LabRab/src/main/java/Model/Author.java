package Model;

import Controller.CategoryDO;
import Controller.NewsDO;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/author/")
@Produces({ MediaType.APPLICATION_JSON })
public class Author {
    CategoryDO oneCategory = new CategoryDO(1, "cat1");
    NewsDO oneNews = new NewsDO(1, "cat1", "economy", "text", "20.11.2022", "smirnov");

    //Получить список категорий
    @GET
    @Path("/category/cat")
    void GetCategory(){
        String str = oneCategory.getName();
    }

    //Получить список новостей
    @GET
    @Path("/news/spisok")
    void getTitleNews(){
        String str = oneNews.getTitle();
        str = oneNews.getText();
    }

    //Создать новость
    @POST
    @Path("/news/initNews")
    void CreateNews(){
        NewsDO twoNews = new NewsDO(2, "cat1", "sport",   "text", "23.11.2022", "smirnov");
    }

    //Создать новую категорию
    @POST
    @Path("/news/initCategory")
    void CreateCategory(){
        CategoryDO twoCategory = new CategoryDO(2, "cat2");
    }
}
