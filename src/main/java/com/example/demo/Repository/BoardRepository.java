package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Board;
public interface BoardRepository extends CrudRepository<Board, Long>{
	
}