package concerttours.facades.impl;

import concerttours.data.NewsData;
import concerttours.facades.NewsFacade;
import concerttours.model.NewsModel;
import concerttours.service.NewsService;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultNewsFacade implements NewsFacade {
    private NewsService newsService;

    @Override
    public List<NewsData> getNews() {
        List<NewsModel> newsModels = newsService.getNews();
        return newsModels.stream().map(newsModel -> {
            NewsData newsData = new NewsData();
            newsData.setDate(newsModel.getDate());
            newsData.setHeadline(newsModel.getHeadline());
            return newsData;
        }).collect(Collectors.toList());
    }

    @Required
    public void setNewsService(NewsService newsService) {
        this.newsService = newsService;
    }
}
