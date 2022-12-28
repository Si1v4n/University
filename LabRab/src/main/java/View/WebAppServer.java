package View;

import io.undertow.Undertow;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

public class WebAppServer {
    public static void main(String[] argv) {
        startWebServer();
    }

    //Запускаем web-сервер. По окончании работы требуется ручная остановка процесса.
    private static void startWebServer() {
        UndertowJaxrsServer server = new UndertowJaxrsServer().start();
        server.deploy(WebAppSingletons.class);
        System.out.println("Сервер запущен: http://localhost:8081/");
    }
}