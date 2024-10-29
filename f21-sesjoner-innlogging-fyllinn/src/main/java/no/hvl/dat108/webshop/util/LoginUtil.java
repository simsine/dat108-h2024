package no.hvl.dat108.webshop.util;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import no.hvl.dat108.webshop.model.Cart;

public class LoginUtil {
	
	public static void loggUtBruker(HttpSession session) {
		if (session != null) {
			session.invalidate();
		}
	}

	public static void loggInnBruker(HttpServletRequest request, String username) {		
		HttpSession session = request.getSession();
		loggUtBruker(session);
		
		session.setAttribute("username", username);
		session.setAttribute("cart", new Cart());
		session.setMaxInactiveInterval(20);

	}
	
	public static boolean erBrukerInnlogget(HttpSession session) {
	
		return session != null && session.getAttribute("username") != null;
	}

}
