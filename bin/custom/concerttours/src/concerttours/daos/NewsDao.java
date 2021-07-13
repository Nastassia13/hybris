package concerttours.daos;

import concerttours.model.NewsModel;

import java.util.List;

public interface NewsDao {
    List<NewsModel> findNews();
}
