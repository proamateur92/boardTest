package kr.co.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.service.BoardService;

@Controller
public class BoardController {

	@Inject
	private BoardService boardService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("list", boardService.ListAll());
		
		return "board/list";
	}
	
}
