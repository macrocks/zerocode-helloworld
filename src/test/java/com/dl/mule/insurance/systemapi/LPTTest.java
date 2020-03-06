package com.dl.mule.insurance.systemapi;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("localhost.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class LPTTest {

    @Test
    @Scenario("systemapi/lpt/lpt_assertion_.json")
    public void testGet() throws Exception {

    }

}