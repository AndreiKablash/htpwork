package com.htp.tasks.callCenter;

public class CallCenter {
    private static final int NUMBER_OF_CLIENTS = 7;
    private static final int NUMBER_OF_DISPATCHER = 2;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < NUMBER_OF_DISPATCHER; i++) {
            new Dispatcher(("Dispatcher №" + (i + 1))).start();
            Thread.sleep(500);
        }
        ClientGenerator clientGenerator = new ClientGenerator();
        clientGenerator.generateClients(NUMBER_OF_CLIENTS);

        /*ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        executor.execute(new Dispatcher(("Dispatcher №")));
        executor.shutdown();
        while (!executor.isTerminated()) {
        }*/

    }
}