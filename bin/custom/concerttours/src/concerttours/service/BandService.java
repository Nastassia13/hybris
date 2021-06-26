package concerttours.service;

import concerttours.model.BandModel;

import java.util.List;

public interface BandService {
    List<BandModel> findBands();

    BandModel findBandForCode(String code);
}
