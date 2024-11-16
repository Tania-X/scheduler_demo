package com.max.scheduler_demo.controller;

import com.max.scheduler_demo.enums.JobEnum;
import com.max.scheduler_demo.service.IOperateService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller
public class EmergencyController {

  @Resource
  private IOperateService operateService;

  public void emergentPremierJob() {
    operateService.operate(JobEnum.PREMIER_JOB);
  }

  public void emergentSecondJob() {
    operateService.operate(JobEnum.SECOND_JOB);
  }

  public void emergentThirdJob() {
    operateService.operate(JobEnum.THIRD_JOB);
  }

  public void emergentFourthJob() {
    operateService.operate(JobEnum.FOURTH_JOB);
  }

}
