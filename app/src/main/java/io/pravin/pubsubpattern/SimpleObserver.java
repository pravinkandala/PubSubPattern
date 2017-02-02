package io.pravin.pubsubpattern;


import android.util.Log;

public class SimpleObserver implements Observer<Integer>{

    @Override
    public void onDataAvailable(Integer data) {

        Log.d("SimpleObserver", "onDataAvailable: Data: " + data);
        System.out.print("SimpleObserver -> onDataAvailable: Data: " + data);

    }

}
