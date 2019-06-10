package com.apidonut.APIDonut;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DonutController {

	RestTemplate rt = new RestTemplate();

	@RequestMapping("/")
	public ModelAndView displayDonuts() {
//		String apiTest = rt.getForObject("https://grandcircusco.github.io/demo-apis/donuts.json", String.class);
//		System.out.println(apiTest);
		List<Donuts> donas = rt.getForObject("https://grandcircusco.github.io/demo-apis/donuts.json", Listdonuts.class)
				.getResults();

		return new ModelAndView("index", "list", donas);
	}
	@RequestMapping("/details")
	public ModelAndView displayDetails(@RequestParam("id") String id) {
		
		Details detaildonut= rt.getForObject("https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json",
				Details.class);

		return new ModelAndView("details-donuts","list", detaildonut);
	}
	@RequestMapping("/backhome")
	public ModelAndView goIndex() {
		return new ModelAndView("redirect:/");
		
	}

}
