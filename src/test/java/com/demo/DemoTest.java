package com.demo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DemoTest {
  @Test
  public void junitShouldBeSetUp() {
    Demo demo = new Demo();

    assertThat(demo.getDemo().getFoo(), equalTo("Foo bar"));
  }
}
