package io.pravin.pubsubpattern;

import android.util.Log;

public class CheeringObserver implements Observer<Integer>{

    @Override
    public void onDataAvailable(Integer data) {

        Log.d("CheeringObserver", "onDataAvailable: I got the data");
        System.out.print("CheeringObserver -> onDataAvailable: I got the data");

    }

}
