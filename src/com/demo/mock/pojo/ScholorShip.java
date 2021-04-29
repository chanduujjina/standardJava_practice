package com.demo.mock.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ScholorShip {
 private int enrollId;
 private int amoutt;
 private String sid;
 private String collegeDetails;
}
