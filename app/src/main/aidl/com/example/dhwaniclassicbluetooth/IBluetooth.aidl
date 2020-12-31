// IBluetooth.aidl
package com.example.dhwaniclassicbluetooth;

// Declare any non-default types here with import statements

interface IBluetooth {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
        String getRemoteAlias(in String address);
        boolean setRemoteAlias(in String address, in String name);
}