package com.dbs.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.training.model.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {

}
