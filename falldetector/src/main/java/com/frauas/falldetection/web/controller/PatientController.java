package com.frauas.falldetection.web.controller;
import org.apache.log4j.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.frauas.falldetection.model.LoginInfo;
import com.frauas.falldetection.model.PatientInfo;
import com.frauas.falldetection.service.PatientService;

@Controller
public class PatientController {
	
	private final Logger logger = Logger.getLogger(getClass());

	@Autowired
	PatientService patientService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Fall Detection App");
		return "login";

	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("patientname") String patientName,
			@RequestParam("inputPassword") String patientID) {

		ModelAndView modelAndView = new ModelAndView();
		try {
		
		
		LoginInfo loginInfo = new LoginInfo();
		loginInfo.setPatientID(patientID);
		loginInfo.setPatientName(patientName);
		
		PatientInfo user = patientService.validateUser(loginInfo);

		if (null != user) {
			
			modelAndView = new ModelAndView("welcome");
			modelAndView.addObject("patientname", user.getPatientName());
		} else {
			
			modelAndView = new ModelAndView("login");
			modelAndView.addObject("message", "Username or Password is wrong!!");
		}
		} catch (Exception e) {
			
			logger.error(e);
			e.printStackTrace();
		}
		
		return modelAndView;
	}
	

}