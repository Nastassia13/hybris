package concerttours.daos;

import concerttours.model.DateTokenModel;

import java.util.List;

public interface DateTokenDao {
    List<DateTokenModel> findTokens();

    void saveToken(DateTokenModel dateToken);
}
