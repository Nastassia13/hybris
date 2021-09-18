package concerttours.service.impl;

import concerttours.daos.DateTokenDao;
import concerttours.model.DateTokenModel;
import concerttours.service.DateTokenService;
import org.springframework.beans.factory.annotation.Required;

import java.util.Date;
import java.util.List;

public class DefaultDateTokenService implements DateTokenService {
    private DateTokenDao dateTokenDao;

    @Override
    public void generateNewFiledValue() {
        List<DateTokenModel> tokens = dateTokenDao.findTokens();
        DateTokenModel tokenModel;
        if (tokens.isEmpty()) {
            tokenModel = new DateTokenModel();
        } else {
            tokenModel = tokens.get(0);
        }
        tokenModel.setToken(new Date());
        dateTokenDao.saveToken(tokenModel);
    }

    @Required
    public void setDateTokenDao(DateTokenDao dateTokenDao) {
        this.dateTokenDao = dateTokenDao;
    }
}
