package com.max.scheduler_demo.job;

import com.max.scheduler_demo.config.ScheduleConfig;
import com.max.scheduler_demo.enums.JobEnum;
import com.max.scheduler_demo.service.IOperateService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@Slf4j
public class OperateJob {

  @Resource
  private IOperateService operateService;

  @Scheduled(cron = "${schedule.operate}")
  public void operateJob() {

    log.info("start scheduled job.");
    operateService.operate(JobEnum.PREMIER_JOB);
    log.info("end scheduled job.");

  }

}
