package com.example.ferin.airtimeatm.domainEvent;


import com.example.ferin.airtimeatm.domain.appUser.AppUser;
import com.example.ferin.airtimeatm.domain.networkCode.NetworkCodes;
import com.example.ferin.airtimeatm.factories.networkCode.NetworkCodeFactory;

/*
 * actually make the call
 *  m = my number, y = your number etc
 */

public class HandleRequest {

    private static NetworkCodes networkCodes;
    private static String transaction;

    public static NetworkCodes getNetwork(AppUser appUser)
    {
        networkCodes = NetworkCodeFactory.returnNetworkCode(appUser.getCellphoneNetwork().getNetworkName());
        return networkCodes;
    }

    public static String prepareString(int request)
    {
        switch(request)
        {
            case 0 :  transaction = networkCodes.getBalanceEnquiry();
                break;
            case 1 : transaction = networkCodes.getMenu();
                break;
            case 2 : transaction = networkCodes.getPcm();
                break;
            case 3 : transaction = networkCodes.getRecharge();
                break;
            case 4 : transaction = networkCodes.getTransfer();
        }
        return transaction;
    }
}
