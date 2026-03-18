package com.mysite.sbb3;


import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  @GetMapping("/hello")
  @ResponseBody
  public String hello() {
    return "Hello World";
  }

  @Getter
  public static class HelloLombok {

    private final String hello;
    private final int lombok;

    public HelloLombok(String hello, int lombok){
      this.hello = hello;
      this.lombok = lombok;
    }

    public static void main(String[] args) {
      HelloLombok helloLombok = new HelloLombok("헬로",5);
      System.out.println(helloLombok.getHello());
      System.out.println(helloLombok.getLombok());
    }
  }
}