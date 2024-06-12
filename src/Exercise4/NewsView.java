package Exercise4;

import java.io.Console;
import java.util.Scanner;

public class NewsView {

    private final Scanner scanner = new Scanner(System.in);
    private NewsController newsController;

    public NewsView() {
        newsController = new NewsController();
    }

    public void view() {
        System.out.println("-------- Menu ----------");
        System.out.println("1. Insert news");
        System.out.println("2. View list news");
        System.out.println("3. Average rate");
        System.out.println("4. Exit");
        System.out.println("-------------------------");

        System.out.println("Chọn chức năng tương ứng với số: ");
        int value = scanner.nextInt();

        action(value);
    }

    public void action(int value) {
        switch (value) {
            case 1 -> {
                News news = new News();
                news.input();
                news.inputRateList();
                newsController.insertNews(news);
            }
            case 2 -> {
                newsController.viewListNews();
            }
            case 3 -> {
                newsController.averageRate();
            }
            case 4 -> {
                return;
            }
        }
        view();
    }
}
