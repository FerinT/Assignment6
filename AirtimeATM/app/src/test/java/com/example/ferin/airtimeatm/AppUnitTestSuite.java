package com.example.ferin.airtimeatm;

import com.example.ferin.airtimeatm.factories.appUser.AppUserFactory;
import com.example.ferin.airtimeatm.factories.network.CellphoneNetworkFactory;
import com.example.ferin.airtimeatm.factories.networkCode.NetworkCodeFactory;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Ferin on 2016-04-16.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AppUserFactory.class,
        CellphoneNetworkFactory.class,
        NetworkCodeFactory.class
})

public class AppUnitTestSuite {
}
