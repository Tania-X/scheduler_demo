package com.max.scheduler_demo.enums;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum JobEnum {

  PREMIER_JOB(0, "premier job"),

  SECOND_JOB(1, "second job"),

  THIRD_JOB(2, "third job"),

  FOURTH_JOB(3, "fourth job"),

  ;

  private final int jobId;

  private final String jobName;

  public static String getJobNameByEnum(JobEnum jobEnum) {
    return Arrays.stream(JobEnum.values()).map(JobEnum::getJobName)
        .filter(jobName -> jobName.equals(jobEnum.jobName)).findFirst().orElse(null);
  }

}
