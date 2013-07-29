package com.dbs.training.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dbs.training.exception.RoomNotFound;
import com.dbs.training.model.Room;
import com.dbs.training.repository.RoomRepository;
import com.dbs.training.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	@Resource
	private RoomRepository	roomRepository;

	@Override
	@Transactional
	public Room create(Room room) {
		Room createdRoom = room;
		return roomRepository.save(createdRoom);
	}

	@Override
	@Transactional
	public Room findById(int id) {
		return roomRepository.findOne(id);
	}

	@Override
	@Transactional(rollbackFor = RoomNotFound.class)
	public Room delete(int id) throws RoomNotFound {
		Room deletedRoom = roomRepository.findOne(id);

		if (deletedRoom == null)
			throw new RoomNotFound();

		roomRepository.delete(deletedRoom);
		return deletedRoom;
	}

	@Override
	@Transactional
	public List<Room> findAll() {
		return roomRepository.findAll();
	}

	@Override
	@Transactional(rollbackFor = RoomNotFound.class)
	public Room update(Room room) throws RoomNotFound {
		Room updatedRoom = roomRepository.save(room);
		return updatedRoom;
	}

}
