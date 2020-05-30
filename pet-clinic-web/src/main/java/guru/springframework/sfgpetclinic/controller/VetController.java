package guru.springframework.sfgpetclinic.controller;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index"})
    public String listVets(Model model){
        System.out.println(vetService.findAll().size());
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
