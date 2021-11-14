package com.example.demo.controller;
import com.example.demo.model.Packages;
import com.example.demo.service.PackagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PackagesController {

    @Autowired
    private PackagesService packagesService;

    @GetMapping("/read-packages")
    public String showReadPackagesPage(Model model) {
        model.addAttribute("packages", packagesService.findAll());
        return "readpackages";
    }

    @GetMapping("/create-packages")
    public String showCreatePackagesPage(Model model) {
        model.addAttribute("command", new Packages());
        return "createpackages";

    }

    @PostMapping("/create-packages")
    public String createPackages(@ModelAttribute("packages") Packages packages) {
        packagesService.savePackages(packages);
        return "redirect:/read-packages";
    }

    @GetMapping("/update-packages/{id}")
    public String showUpdatePackagesPage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", packagesService.findById(id).orElse(null));
        return "updatepackages";
    }

    @PostMapping("/update-packages/{id}")
    public String updatePackages(@PathVariable int id, @ModelAttribute("packages") Packages packages) {
        packagesService.updatePackages(id, packages);
        return "redirect:/read-packages";
    }

    @GetMapping("/delete-packages/{id}")
    public String deletePackages(@PathVariable int id) {
        packagesService.deleteById(id);
        return "redirect:/read-packages";
    }

}
