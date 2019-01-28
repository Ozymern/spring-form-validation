package com.ozymern.spring.form.validation.converters;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.ozymern.spring.form.validation.commands.UserCommand;
import com.ozymern.spring.form.validation.domain.entities.UserEntity;

@Component
public class UserCommandToUserEntity implements Converter<UserCommand, UserEntity>{

	@Override
	public UserEntity convert(UserCommand userCommand ) {
		UserEntity userEntity = new UserEntity();
		userEntity.setId(userCommand.getId());
		userEntity.setAge(userCommand.getAge());
		userEntity.setEmail(userCommand.getEmail());
		userEntity.setDescription(userCommand.getDescription());
		userEntity.setName(userCommand.getName());
		userEntity.setLastNames(userCommand.getLastNames());
		userEntity.setGender(userCommand.getGender());
		
		return userEntity;
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
