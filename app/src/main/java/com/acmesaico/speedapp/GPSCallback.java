package com.acmesaico.speedapp;

import android.location.Location;

public interface GPSCallback {

    public abstract void onGPSUpdate(Location location);

}
