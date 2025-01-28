package com.framework.testdata;

import io.github.sskorol.data.Column;

public class TestData {

    @Column(name="TestCaseName")
    public String testName;
    @Column(name="UserName")
    public String userName;
    @Column(name="Password")
    public String password;

}
