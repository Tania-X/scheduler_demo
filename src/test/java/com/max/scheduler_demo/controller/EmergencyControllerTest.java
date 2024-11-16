package com.max.scheduler_demo.controller;

import com.max.scheduler_demo.SchedulerDemoApplicationTests;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;

public class EmergencyControllerTest extends SchedulerDemoApplicationTests {

  @Resource
  private EmergencyController emergencyController;

  @Test
  public void testSecondJob() {
    emergencyController.emergentSecondJob();
  }

  @Test
  public void testThirdJob() {
    emergencyController.emergentThirdJob();
  }

}
