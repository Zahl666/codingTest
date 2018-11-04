package com.coding.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding.service.MemberService;
import com.coding.vo.MemberVO;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String registerGET(Model model, MemberVO member, HttpServletRequest req) throws Exception{
		logger.info("reg get.....!");
		model.addAttribute("member", new MemberVO());
		return "member/register";
	}

	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerPOST(@Valid @ModelAttribute("member") MemberVO member, BindingResult bindingResult, Model model) throws Exception{
		logger.info("reg post.....!");
		logger.info("member : {}", member);
		//유효성 검사
		if(bindingResult.hasErrors()) {
			for(ObjectError error : bindingResult.getAllErrors()) {
                System.out.println(error.getCode() + " : " + error.getDefaultMessage());
            }
			return "member/register";
		}
		service.regist(member);
		
		
		model.addAttribute("result", "success");
		
		logger.info("before return");
		return "member/success";
	}
	@RequestMapping(value="/success", method=RequestMethod.GET)
	public void success(Model model) throws Exception{
		Date date = new Date(); //오늘 날짜 생성
		String newstring = new SimpleDateFormat("yyyy/MM/dd").format(date);
		model.addAttribute("serverTime", newstring);
		logger.info("success get.....!");
		
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void memberList(Model model) throws Exception{
		logger.info("show all list....");
		model.addAttribute("list", service.listMember());
	}
	
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public void memberRead(@RequestParam("user_Id") String user_Id, Model model) throws Exception{
		logger.info("read user......");
		model.addAttribute(service.readMember(user_Id));
	}
}
