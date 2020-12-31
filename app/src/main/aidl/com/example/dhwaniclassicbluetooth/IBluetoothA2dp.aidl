// IBluetoothA2dp.aidl
package com.example.dhwaniclassicbluetooth;

// Declare any non-default types here with import statements

interface IBluetoothA2dp {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
     boolean connectSink(in BluetoothDevice device);
        boolean disconnectSink(in BluetoothDevice device);
        boolean suspendSink(in BluetoothDevice device);
        boolean resumeSink(in BluetoothDevice device);
        BluetoothDevice[] getConnectedSinks();
        BluetoothDevice[] getNonDisconnectedSinks();
        int getSinkState(in BluetoothDevice device);
        boolean setSinkPriority(in BluetoothDevice device, int priority);
        int getSinkPriority(in BluetoothDevice device);

        boolean connectSinkInternal(in BluetoothDevice device);
        boolean disconnectSinkInternal(in BluetoothDevice device);
}