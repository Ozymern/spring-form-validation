package com.ozymern.spring.form.validation.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ozymern.spring.form.validation.commands.UserCommand;
import com.ozymern.spring.form.validation.services.UserService;

@Controller
public class UserController {
	
	public static final String PAGE_FORM = "form";
	
	@Autowired
	private UserService userService;


	@GetMapping("/")
	public String showForm(Model model) {
		model.addAttribute("title","Spring Boot:Form Validation");
		model.addAttribute("userCommand", new UserCommand());
		return PAGE_FORM;
	}
	
	//BindingResultdebe estar inmediatamente después del objeto que he anotado @Valid.
	//RedirectAttributes se ocupa para pasar atributos cuando se ocupa redirect
	@PostMapping("/")
	public String submit(@Valid @ModelAttribute("userCommand")UserCommand userCommand,BindingResult result,Model model,RedirectAttributes flash) {
		
		if(result.hasErrors()) {
			model.addAttribute("title","Spring Boot:Form Validation");
			//addFlashAttribute()en realidad almacena los atributos en un mapa flash
			//(que se mantiene internamente en los usuarios sessiony se elimina una vez que se cumple la siguiente solicitud redirigida)
			flash.addFlashAttribute("error", "Error al ingresar los datos, intentelo nuevamente");
			return PAGE_FORM;
		}else {
			userService.saveUser(userCommand);
			model.addAttribute("title","Spring Boot:Form Validation");
			flash.addFlashAttribute("success", "usuario creado con exito");
			return "redirect:/";
		}
		

	}
	
	
}
