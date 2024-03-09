package com.freightfox.meetingassistant.service;

import com.freightfox.meetingassistant.entity.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ConflictCheckService {

    List<UserDto> getConflictingParticipants(Long meetingId);

}
