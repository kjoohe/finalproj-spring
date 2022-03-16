package com.example.springcomm.repository;

import java.util.List;

import com.example.springcomm.model.Userinfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserinfoRepository extends JpaRepository<Userinfo, Long> {
  public Userinfo findByUseridAndUserpw(String userid, String userpw);

  public List<Userinfo> findByUseridContaining(String userid);
}
