package no.hvl.dat108;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoklisteController {

	@GetMapping("/noenboker")
	public String noenBoker(Model model, String forfatter, String sortering, String[] genres) {

		List<String> genresList = List.of(genres);
		
		Comparator<Bok> comparator;
		if (sortering.equals("aar")) {
			comparator = Comparator.comparing(Bok::getTittel);			
		}
		else {
			comparator = Comparator.comparing(Bok::getUtgivelsesaar);
		}
		
		List<Bok> noenBoker = Boker.alleBoker.stream()
				.filter(b -> b.getForfatter().contains(forfatter))
				.filter(t -> genresList.contains(t.getGenre())	)
				.sorted(comparator)
				.toList();
		
		model.addAttribute("boker", noenBoker);
		
		return"boklisteView";

	}

	@GetMapping("/alleboker")
	public String alleBoker(Model model) {
		model.addAttribute("boker", Boker.alleBoker);
		return "boklisteView";
	}

}
