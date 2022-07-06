package co.kr.mybatis.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.bind.ParseConversionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import co.kr.mybatis.dto.post;
import co.kr.mybatis.dto.postList;
import co.kr.mybatis.mapper.boardMapper;
import co.kr.mybatis.service.boardService;

@Controller
@EnableWebMvc
public class boardcontroller {
	@Inject
	private boardService service;

	@GetMapping("/index")
	public String mybatisTest(Model model, @RequestParam(name = "page", required = false) String page) {
		int pageNumber = 1;
		if (page != null) {
			pageNumber = Integer.parseInt(page);
		}
		postList list = service.getpostlist(pageNumber);

		model.addAttribute("postList", list);
		return "index";
	}

	@PostMapping("/detail")
	public String showPostDetail(Model model, @RequestParam(name = "idpost") int idpost) {
		post selectedPost = service.getSelecPost(idpost);
		model.addAttribute("selectedPost", selectedPost);
		return "loginForm";
	}

	@GetMapping("/loginForm")
	public String showLoginForm() {
		return "loginForm";
	}

	@PostMapping("login")
	public String dologin(HttpSession session, @RequestParam String loginid, @RequestParam String loginpw) {
		int result = service.login(loginid, loginpw);
		if (1 == result) {
			session.setAttribute("login", loginid);
		}
		return "redirect:/index";

	}
}
