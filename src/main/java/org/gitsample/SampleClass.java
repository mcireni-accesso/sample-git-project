package org.gitsample;

public class SampleClass {
  private String temp;

  public String getTemp() {
    return temp;
  }

  @Override
  public String toString() {
    return "SampleClass [temp=" + temp + "]";
  }

  public void setTemp(String temp) {
    this.temp = temp;
  }

  public static void main(String[] args) {

    System.out.println("Conflict - feature branch - sample class");

    //System.out.println("Conflict - main branch - sample class");

    //changes made from git hub
  }


}
