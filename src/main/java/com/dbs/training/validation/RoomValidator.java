package com.dbs.training.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.dbs.training.model.Room;

@Component
public class RoomValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Room.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Room room = (Room) target;
		
		ValidationUtils.rejectIfEmpty(errors, "name", "room.name.empty");
		ValidationUtils.rejectIfEmpty(errors, "code", "room.code.empty");
		ValidationUtils.rejectIfEmpty(errors, "floor", "room.floor.empty");
		ValidationUtils.rejectIfEmpty(errors, "numberOfSeats", "room.numberOfSeats.empty");

	}

}
