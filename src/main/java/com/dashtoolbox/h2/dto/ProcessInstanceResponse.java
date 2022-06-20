package com.dashtoolbox.h2.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProcessInstanceResponse {
  String processId;
  boolean isEnded;
}
