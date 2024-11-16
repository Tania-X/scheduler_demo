package com.max.scheduler_demo.service;

import com.max.scheduler_demo.enums.JobEnum;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbstractOperateService implements IOperateService {

  @Override
  public boolean operate(JobEnum job) {
    boolean result = false;
    /*
    此处运用了Switch穿梭的原理，将多个任务串行执行的同时，可以在执行失败的任务的位置，应急接续
     */
    switch (job) {
      case PREMIER_JOB:
        result = operatePremierJob();
        if (!result) {
          return false;
        }
      case SECOND_JOB:
        result = operateSecondJob();
        if (!result) {
          return false;
        }
      case THIRD_JOB:
        result = operateThirdJob();
        if (!result) {
          return false;
        }
      case FOURTH_JOB:
        result = operateFourthJob();
        if (!result) {
          return false;
        }
        break;
      default:
        log.error("job param {} error.", job);
        break;
    }
    return result;
  }

  protected boolean operateFourthJob() {
    return true;
  }

  protected boolean operateThirdJob() {
    return true;
  }

  protected boolean operateSecondJob() {
    return true;
  }

  protected boolean operatePremierJob() {
    return true;
  }
}
