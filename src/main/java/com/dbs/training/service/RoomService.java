package com.dbs.training.service;

import java.util.List;

import com.dbs.training.exception.RoomNotFound;
import com.dbs.training.model.Room;

public interface RoomService {
	
	public Room create(Room room);
	public Room delete(int id) throws RoomNotFound;
	public List<Room> findAll();
	public Room update(Room room) throws RoomNotFound;
	public Room findById(int id);

}
