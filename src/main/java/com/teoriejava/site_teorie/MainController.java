package com.teoriejava.site_teorie;

import com.teoriejava.site_teorie.model.Lectie;
import com.teoriejava.site_teorie.repository.LectieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//trateaza cererile primite din browser foloseste repository-ul pt BD si pregateste datele pt html
@Controller
public class MainController {

    private final LectieRepository lectieRepository;

    public MainController(LectieRepository lectieRepository) {
        this.lectieRepository = lectieRepository;
    }

    @GetMapping("/") //Ascultă cererile HTTP de tip GET pe adresa principală (http://localhost:8080/).
    public String home(@RequestParam(required = false) String cautare,
                       @RequestParam(required = false) String categorie,
                       Model model) {
        List<Lectie> lectii;

        if (cautare != null && !cautare.trim().isEmpty()) {
            lectii = lectieRepository.findByCategorieContainingIgnoreCaseOrTitluContainingIgnoreCase(cautare, cautare);
        } else if (categorie != null && !categorie.trim().isEmpty() && !categorie.equals("Toate")) {
            lectii = lectieRepository.findByCategorie(categorie);
        } else {
            lectii = lectieRepository.findAll();
        }
        List<String> categorii = lectieRepository.findAll()
                .stream()
                .map(Lectie::getCategorie)
                .filter(c -> c != null && !c.trim().isEmpty())
                .distinct()
                .sorted()
                .toList();

        model.addAttribute("titlu", "Platformă Teorie Java");
        model.addAttribute("lectii", lectii);
        model.addAttribute("cautare", cautare); // păstrăm textul în căsuță
        model.addAttribute("categorii", categorii);               // Trimitem lista pentru meniu
        model.addAttribute("categorieSelectata", categorie);      // Ținem minte selecția curentă
        return "index";
    }

    // Metodă nouă: primește datele din formular și le salvează
    @PostMapping("/salveaza")
    public String salveazaLectie(@RequestParam String titlu,
                                 @RequestParam String categorie,
                                 @RequestParam String continut,
                                 @RequestParam String cod,
                                 @RequestParam String explicatie) {

        // 1. Creăm un obiect nou Lectie
        Lectie lectieNoua = new Lectie(titlu, categorie, continut,  cod, explicatie);

        // 2. Îl salvăm în baza de date
        lectieRepository.save(lectieNoua);

        // 3. Redirecționăm utilizatorul înapoi pe pagina principală
        return "redirect:/";
    }

    @PostMapping("/sterge")
    public String stergeLectie(@RequestParam Long id) {
        lectieRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/editeaza")
    public String arataFormularEditare(@RequestParam Long id, Model model) {
        Lectie lectie = lectieRepository.findById(id).orElseThrow();
        model.addAttribute("lectie", lectie);
        return "edit";
    }

    @PostMapping("/update")
    public String updateLectie(@RequestParam Long id,
                               @RequestParam String titlu,
                               @RequestParam String categorie,
                               @RequestParam String continut,
                               @RequestParam String cod,
                               @RequestParam String explicatie) {

        // 1. Căutăm lecția existentă în baza de date după ID
        Lectie lectie = lectieRepository.findById(id).orElseThrow();

        // 2. Actualizăm câmpurile cu noile valori primite din formular
        lectie.setTitlu(titlu);
        lectie.setCategorie(categorie);
        lectie.setContinut(continut);
        lectie.setExplicatie(explicatie);
        lectie.setCod(cod);

        // 3. Salvăm modificările în H2 (Spring Data JPA face automat UPDATE pentru că ID-ul există deja)
        lectieRepository.save(lectie);

        // 4. Redirecționăm utilizatorul înapoi pe pagina principală
        return "redirect:/";
    }
// pt co
    @GetMapping("/lectie/{id}")
    public String detaliiLectie(@PathVariable Long id, Model model) {
        Lectie lectie = lectieRepository.findById(id).orElse(null);
        model.addAttribute("lectie", lectie);
        return "detalii";
    }

}