package com.ozymern.spring.form.validation.services;

import com.ozymern.spring.form.validation.commands.UserCommand;

public interface UserService {

	public UserCommand saveUser(UserCommand userCommand);
	
}
