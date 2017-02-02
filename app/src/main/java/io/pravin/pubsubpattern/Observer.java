package io.pravin.pubsubpattern;


public interface Observer<T> {

    void onDataAvailable(T data);

}
