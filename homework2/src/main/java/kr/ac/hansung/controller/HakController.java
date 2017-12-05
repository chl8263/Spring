package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.model.Hak;
import kr.ac.hansung.model.One;
import kr.ac.hansung.model.Sum;
import kr.ac.hansung.model.Two;
import kr.ac.hansung.service.Hakservice;

@Controller
public class HakController {
	@Autowired
	private Hakservice hakService;

	@RequestMapping("/one")
	public String showhaks(Model model) {
		List<One> one = hakService.getOne();
		model.addAttribute("one", one);
		return "one";
	}

	@RequestMapping("/one_link")
	public String showOne_link(Model model,@RequestParam("year") int year,@RequestParam("semester") int semester) {
		List<Hak> hak = hakService.getOne_link(year,semester);
		model.addAttribute("one_link", hak);
		return "one_link";
	}

	@RequestMapping("/two")
	public String showTwo(Model model) {
		List<Two> two = hakService.getTwo();
		Sum total = hakService.sum();
		model.addAttribute("two",two);
		model.addAttribute("sum",total);
		return "two";
	}
	
	@RequestMapping("/three")
	public String showThree(Model model) {
		model.addAttribute("three",new Hak());
		return "three";
	}
	@RequestMapping("/docreate")
	private String doCreate(Model model, @Valid Hak hak , BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("===Form data does not validated");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error : errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "createoffer";
		}
		hakService.insert(hak);
		System.out.println("asdsd");
		return "hak_create";
	}

	@RequestMapping("/four")
	public String showFour(Model model) {
		List<Hak> hak = hakService.getFour();
		model.addAttribute("four", hak);
		return "four";
	}
	@RequestMapping("/gohome")
	public String showGohome(Model model) {
		
		return "home";
	}
	/*
	 * @RequestMapping("/") public String showhaks(Model model) { List<Hak> haks =
	 * hakService.getCurrent(); model.addAttribute("haks",haks); return "haks"; }
	 */
}
