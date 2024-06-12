package Exercise4;

import java.util.ArrayList;

public class NewsController {
    public ArrayList<News> newsList = new ArrayList<>();

    private int index = 0;

    public void insertNews(News news) {
        news.setId(index);

        newsList.add(news);
        index++;
    }

    public void viewListNews() {
        newsList.forEach(News::display);
    }

    public void averageRate() {
        newsList.forEach(news -> {
            news.calculate();
            news.display();
        });
    }
}
