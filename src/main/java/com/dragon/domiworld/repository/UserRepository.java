package com.dragon.domiworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dragon.domiworld.vo.UserVO;

@Repository
public interface UserRepository extends JpaRepository<UserVO, Long> {
}
