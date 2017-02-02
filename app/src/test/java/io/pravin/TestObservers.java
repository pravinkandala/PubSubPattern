package io.pravin;


import org.junit.Test;

import io.pravin.pubsubpattern.*;

public class TestObservers {


    @Test
    public void settingMoreObserversTriggersThemAll() throws Exception {

        Observable<Integer> observable = new SimpleObservable();
        Observer<Integer> simpleObserver = new SimpleObserver();
        Observer<Integer> cheeringObserver = new CheeringObserver();

        observable.addObserver(simpleObserver);
        observable.addObserver(cheeringObserver);
        observable.notifyObservers();

    }

}
