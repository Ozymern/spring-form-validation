package com.ozymern.spring.form.validation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozymern.spring.form.validation.commands.UserCommand;
import com.ozymern.spring.form.validation.converters.UserCommandToUserEntity;
import com.ozymern.spring.form.validation.converters.UserEntityToUserCommand;
import com.ozymern.spring.form.validation.domain.entities.UserEntity;
import com.ozymern.spring.form.validation.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserCommandToUserEntity userCommandToUserEntity;
	
	@Autowired
	UserEntityToUserCommand userEntityToUserCommand;
	
	@Autowired
	UserRepository userRepository ;
	

	@Override
	public UserCommand saveUser(UserCommand userCommand) {
	
		UserEntity userEntity=userRepository.save(userCommandToUserEntity.convert(userCommand));
		
		return userEntityToUserCommand.convert(userEntity);
	}

	
	
}
