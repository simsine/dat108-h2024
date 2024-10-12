package no.hvl.dat108;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoklisteController {

	@GetMapping("/alleboker")
	public String alleBoker(Model model) {
		model.addAttribute("bokListe", Boker.alleBoker);
		return "boklisteView";
	}

	@GetMapping("/noenboker")
	public String noenBoker(Model model, @RequestParam(required = false) String forfatter) {
		List<Bok> noenBoker = Boker.alleBoker.stream().filter(t -> t.getForfatter().contains(forfatter)).toList();
		model.addAttribute("bokListe", noenBoker);
		return "boklisteView";
	}
}
