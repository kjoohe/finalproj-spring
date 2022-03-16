package com.example.springcomm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Userinfo {
  @Id
  @GeneratedValue

  String userid;
  String userpw;
  String nickname;
  String name;
  String usernum;
  String userbirth;

}
