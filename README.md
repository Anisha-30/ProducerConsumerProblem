---------PRODUCER CONSUMER SYSTEM------

Simulate a real-world producer-consumer system using a shared resource (a queue).

Use wait, yield sleep, notify notifyall

In the producer-consumer problem, producers generate data and add it to a shared resource (e.g., a queue), while consumers remove data and process it. To avoid conflicts:

Producers must wait if the queue is full.
Consumers must wait if the queue is empty.
