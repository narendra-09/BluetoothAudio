package com.example.dhwaniclassicbluetooth;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.os.IBinder;
import android.os.RemoteException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BluetoothA2dpConnection {
    private IBluetoothA2dp service = null;

    BluetoothA2dpConnection() {
        try {
            @SuppressLint("PrivateApi") Class<?> classServiceManager = Class.forName("android.os.ServiceManager");
            Method methodGetService = classServiceManager.getMethod("getService", String.class);
            IBinder binder = (IBinder) methodGetService.invoke(null, "bluetooth_a2dp");
            service = IBluetoothA2dp.Stub.asInterface(binder);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void connect(BluetoothDevice device) {
        if (service == null || device == null) {
            return;
        }
        try {
            service.connectSink(device);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void disconnect(BluetoothDevice device) {
        if (service == null || device == null) {
            return;
        }
        try {
            service.disconnectSink(device);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
