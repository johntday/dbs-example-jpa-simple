package com.dbs.training.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dbs.training.exception.RoomNotFound;
import com.dbs.training.model.Room;
import com.dbs.training.service.RoomService;
import com.dbs.training.validation.RoomValidator;

@Controller
@RequestMapping(value="/room")
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private RoomValidator roomValidator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(roomValidator);
	}

	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView newRoomPage() {
		ModelAndView mav = new ModelAndView("room-new", "room", new Room());
		return mav;
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView createNewRoom(@ModelAttribute @Valid Room room,
			BindingResult result,
			final RedirectAttributes redirectAttributes) {
		
		if (result.hasErrors())
			return new ModelAndView("room-new");
		
		ModelAndView mav = new ModelAndView();
		String message = "New room successfully created <br/>"+room.toString();
		
		roomService.create(room);
		mav.setViewName("redirect:/index.html");
				
		redirectAttributes.addFlashAttribute("message", message);	
		return mav;		
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView roomListPage() {
		ModelAndView mav = new ModelAndView("room-list");
		List<Room> roomList = roomService.findAll();
		mav.addObject("roomList", roomList);
		return mav;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editRoomPage(@PathVariable Integer id) {
		ModelAndView mav = new ModelAndView("room-edit");
		Room room = roomService.findById(id);
		mav.addObject("room", room);
		return mav;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public ModelAndView editRoom(@ModelAttribute @Valid Room room,
			BindingResult result,
			@PathVariable Integer id,
			final RedirectAttributes redirectAttributes) throws RoomNotFound {
		
		if (result.hasErrors())
			return new ModelAndView("room-edit");
		
		ModelAndView mav = new ModelAndView("redirect:/index.html");
		String message = "Room successfully updated <br/>"+room.toString();

		roomService.update(room);
		
		redirectAttributes.addFlashAttribute("message", message);	
		return mav;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteRoom(@PathVariable Integer id,
			final RedirectAttributes redirectAttributes) throws RoomNotFound {
		
		ModelAndView mav = new ModelAndView("redirect:/index.html");		
		
		Room room = roomService.delete(id);
		String message = "The room successfully deleted <br/>"+room.toString();
		
		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
	
}
