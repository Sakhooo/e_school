package kz.sagadat.e_school.controller;


import kz.sagadat.e_school.model.Pupils;
import kz.sagadat.e_school.service.PupilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class ViewController {

    @Autowired
    PupilsService pupilsService;

    @GetMapping("/home")
    public String pupils(Model model){
        List<Pupils> pupilsList = pupilsService.allPupils();
        model.addAttribute("pupilsList",pupilsList);
        return "pupils";
    }

}
