package com.jacobroe.TheCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class HomeController {

	@RequestMapping("/")
    public String index() {
        return "jsp/codeTest.jsp";
    }

    @RequestMapping(value = "/code", method = RequestMethod.POST)
    public String tryCode(@RequestParam(value = "code") String code, RedirectAttributes redirectAttributes) {
        if (code.equals("bushido")) {
            return "jsp/theCode.jsp";
    }
    	else {
    		redirectAttributes.addFlashAttribute("flashError", "You must train harder.");
    		return "redirect:/";
    	}
    }
}