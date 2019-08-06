package com.demo;

import com.demo.proto.Demo.DemoPb;

public class Demo {
  public DemoPb getDemo() {
    return DemoPb.newBuilder()
      .setFoo("Foo bar")
      .build();
  }
}
