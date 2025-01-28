package com.framework.test;

import com.framework.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;

public class DatasupplierTest {


    @DataSupplier
    public StreamEx<TestData> getData()
    {
       return TestDataReader.use(XlsxReader.class).withTarget(TestData.class)
                .withSource("TestData.xlsx").read();
    }
}
