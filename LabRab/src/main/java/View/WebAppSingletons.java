package View;

import Model.ReaderApi;
import javafx.application.Application;
import java.util.HashSet;
import java.util.Set;

public class WebAppSingletons {
    private Set<Object> singletons = new HashSet<Object>();

    public WebAppSingletons() {
        singletons.add(new ReaderApi());
    }

    //@Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
