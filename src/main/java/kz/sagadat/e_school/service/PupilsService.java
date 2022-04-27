package kz.sagadat.e_school.service;

import kz.sagadat.e_school.model.Pupils;

import java.util.List;

public interface PupilsService {
    void savePupils(Pupils pupils);
    void update(Pupils pupils);
    void delete(int id);
    List<Pupils> allPupils();
}
