package com.max.scheduler_demo.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ScheduleConfig {

  @Value("schedule.operate")
  private String scheduleOperate;

}
