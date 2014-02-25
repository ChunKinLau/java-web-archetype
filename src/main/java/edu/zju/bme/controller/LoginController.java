package edu.zju.bme.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLogIn(@RequestParam(value="error", required=false) boolean error) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("error", error);
		return new ModelAndView("login", model);
	}
	
	@RequestMapping("/")
	public String getIndex(){	
		return "index";
	}
}
