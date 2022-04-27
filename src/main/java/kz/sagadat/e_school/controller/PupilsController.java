package kz.sagadat.e_school.controller;

import kz.sagadat.e_school.mapper.PupilsMapper;
import kz.sagadat.e_school.model.Pupils;
import kz.sagadat.e_school.service.PupilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PupilsController {
    @Autowired
    private PupilsMapper pupilsMapper;

    @Autowired
    private PupilsService pupilsService;

    @GetMapping("/all")
    public List<Pupils> getAll(){
        return pupilsMapper.findAll();
    }

    @PostMapping("/save")
    private List<Pupils> save(@RequestBody Pupils pupils){
        System.out.println("sadsad");
        System.out.println(pupils);
        pupilsService.savePupils(pupils);
        return pupilsMapper.findAll();
    }

    @PutMapping("update")
    private List<Pupils> update(@RequestBody Pupils pupils){
        pupilsService.update(pupils);
        return pupilsMapper.findAll();
    }

    @DeleteMapping("/delete/{id}")
    private List<Pupils> delete(@PathVariable int id){
        System.out.println("sadsadasdsafasf");
        System.out.println(id);
        pupilsService.delete(id);
        return pupilsMapper.findAll();
    }

}
