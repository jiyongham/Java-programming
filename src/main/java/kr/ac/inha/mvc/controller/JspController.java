package kr.ac.inha.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class JspController {
	@RequestMapping("/")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}
	@RequestMapping("/hello.do")
	public String helloDo() {
		return "hello";
	}
	@RequestMapping("/gugudan")
	public ModelAndView gugudan(int n) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("gugudan");
		String result = "구구단 : ";
		for(int i = 1; i<= 9; i++)
			result = result + n + "*" + i + "=" + (n*i) + "";
		mv.addObject("gugu", result);
		return mv;
	}
}
