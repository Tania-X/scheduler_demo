package com.max.scheduler_demo.service;

import com.max.scheduler_demo.enums.JobEnum;

public interface IOperateService {

  boolean operate(JobEnum job);

}
