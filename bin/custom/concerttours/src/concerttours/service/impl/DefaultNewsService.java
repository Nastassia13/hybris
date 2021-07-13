package concerttours.service.impl;

import concerttours.daos.NewsDao;
import concerttours.model.NewsModel;
import concerttours.service.NewsService;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultNewsService implements NewsService {
    private NewsDao newsDao;

    @Override
    public List<NewsModel> getNews() {
        return newsDao.findNews();
    }

    @Required
    public void setNewsDao(NewsDao newsDao) {
        this.newsDao = newsDao;
    }
}
