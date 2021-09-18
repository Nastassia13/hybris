package concerttours.facades;

import concerttours.data.ConcertData;

import java.util.List;

public interface ConcertFacade {
    List<ConcertData> getConcerts();

    ConcertData getConcert(String code);
}
