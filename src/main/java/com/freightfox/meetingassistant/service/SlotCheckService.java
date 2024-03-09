package com.freightfox.meetingassistant.service;

import com.freightfox.meetingassistant.entity.TimeSlot;

import java.util.List;


public interface SlotCheckService {
    List<TimeSlot> getFreeTimeSlots(Long userOneId, Long userTwoId, Integer duration);
}
