package kz.sagadat.e_school.service.impl;

import kz.sagadat.e_school.mapper.PupilsMapper;
import kz.sagadat.e_school.model.Pupils;
import kz.sagadat.e_school.service.PupilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PupilsServiceimpl implements PupilsService {
    @Autowired
    PupilsMapper pupilsMapper;

    @Override
    public void savePupils(Pupils pupils) {
        pupilsMapper.insert(pupils);
    }

    @Override
    public void update(Pupils pupils) {
        pupilsMapper.update(pupils);
    }

    @Override
    public void delete(int id) {
        pupilsMapper.delete(id);
    }

    @Override
    public List<Pupils> allPupils() {
        List<Pupils> pupilsList= pupilsMapper.findAll();
        return pupilsList;
    }

}
