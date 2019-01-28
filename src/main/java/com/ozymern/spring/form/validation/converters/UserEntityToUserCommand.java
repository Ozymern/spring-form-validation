package com.ozymern.spring.form.validation.converters;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.ozymern.spring.form.validation.commands.UserCommand;
import com.ozymern.spring.form.validation.domain.entities.UserEntity;

@Component
public class UserEntityToUserCommand implements Converter<UserEntity, UserCommand>{

	@Override
	public UserCommand convert(UserEntity userEntity) {
		UserCommand userCommand= new UserCommand();
		userCommand.setAge(userEntity.getAge());
		userCommand.setDescription(userEntity.getDescription());
		userCommand.setEmail(userEntity.getEmail());	
		userCommand.setId(userEntity.getId());
		userCommand.setLastNames(userEntity.getLastNames());
		userCommand.setName(userEntity.getName());
		userCommand.setGender(userEntity.getGender());
		return userCommand;
	}

	@Override
	public JavaType getInputType(TypeFactory typeFactory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JavaType getOutputType(TypeFactory typeFactory) {
		// TODO Auto-generated method stub
		return null;
	}

}
