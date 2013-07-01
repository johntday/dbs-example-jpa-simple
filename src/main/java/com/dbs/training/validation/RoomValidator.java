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
		
		// REQUIRED fields
		ValidationUtils.rejectIfEmpty(errors, "name", "room.name.empty");
		ValidationUtils.rejectIfEmpty(errors, "code", "room.code.empty");
		ValidationUtils.rejectIfEmpty(errors, "floor", "room.floor.empty");
		ValidationUtils.rejectIfEmpty(errors, "numberOfSeats", "room.numberOfSeats.empty");

		// INTEGER GREATER THAN 0
		if (room.getFloor() < 1)
			errors.rejectValue("floor", "room.floor.gt0");
		if (room.getNumberOfSeats() < 1)
			errors.rejectValue("floor", "room.numberOfSeats.gt0");
		
	}

}
