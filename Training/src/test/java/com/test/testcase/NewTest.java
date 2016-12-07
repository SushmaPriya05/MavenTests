package com.test.testcase;

import org.testng.annotations.Test;

import com.PageObject.Hello;

public class NewTest {
  @Test
  public void f() {
	  
	  Hello hello = new Hello();
	  hello.syso();
	  System.out.println("This is in Test");
	  
  }
}
