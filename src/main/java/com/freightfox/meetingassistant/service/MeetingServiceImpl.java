package com.freightfox.meetingassistant.service;

import com.freightfox.meetingassistant.entity.Meeting;
import com.freightfox.meetingassistant.entity.MeetingRequest;
import com.freightfox.meetingassistant.repository.MeetingRepository;
import com.freightfox.meetingassistant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingServiceImpl implements MeetingService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MeetingRepository meetingRepository;

    @Autowired
    private MeetingMapper meetingMapper;

    public Meeting bookMeeting(MeetingRequest meetingRequest) {
        Meeting meeting = meetingMapper.mapMeetingRequestToEntity(meetingRequest);
        return meetingRepository.save(meeting);
    }

}
