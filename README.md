# PubSubPattern
Simple `Publisher/Subscribe` Pattern Example

This is a sample project explaining `Observer/Observable` pattern which is used to help to avaoid continous polling of a data source. This is also known as the `publisher and subscriber` pattern (pub/sub).
We use the observer pattern to be notified when the data is ready instead of polling from it.

###Explains
1. What an observer and observable is.
2. Creating an observable which will `communicate with observers`.
3. implementing `multiple observers` which do different things.
4. wiring them together to have the obverable `notify all observers` when an action occurs.
