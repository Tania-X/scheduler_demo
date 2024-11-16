package com.max.scheduler_demo.service.impl;

import com.max.scheduler_demo.service.AbstractOperateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OperateServiceImpl extends AbstractOperateService {

  @Override
  protected boolean operateFourthJob() {
    log.info("my fourth job...");
    return super.operateFourthJob();
  }

  @Override
  protected boolean operateThirdJob() {
    log.info("my third job...");
    return super.operateThirdJob();
  }

  @Override
  protected boolean operateSecondJob() {
    log.info("my second job...");
    return super.operateSecondJob();
  }

  @Override
  protected boolean operatePremierJob() {
    log.info("my premier job...");
    return super.operatePremierJob();
  }
}
