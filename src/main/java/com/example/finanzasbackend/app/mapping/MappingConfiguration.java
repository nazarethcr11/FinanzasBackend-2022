package com.example.finanzasbackend.app.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration("SocialAppApiMappingConfiguration")
public class MappingConfiguration implements Serializable {
    @Bean
    public RecordScheduleMapper recordScheduleMapper() { return new RecordScheduleMapper(); }
    @Bean
    public ScheduleMapper scheduleMapper() { return new ScheduleMapper(); }
    @Bean
    public UserMapper userMapper() { return new UserMapper(); }
}