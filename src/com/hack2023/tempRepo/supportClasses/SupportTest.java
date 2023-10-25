package com.hack2023.tempRepo.supportClasses;

public class SupportTest {
    private String varA;
    private String varB;

    public SupportTest (String a, String b) {
        this.varA = a;
        this.varB = b;
    }

    public String getSomething() {
        AnotherSupportClass anotherSupportClass = new AnotherSupportClass("abc", "def");
        return "this is something" + anotherSupportClass.getSomethingElse();
    }
}
