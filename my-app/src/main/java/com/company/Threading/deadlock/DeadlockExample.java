package com.company.Threading.deadlock;

public class DeadlockExample {

    public static void main(String[] args) {
        Message msg = new Message();
        new Thread(new WriterThread(msg)).start();
        new Thread(new ReaderThread(msg)).start();
    }
}

class Message {
    private String message;
    private boolean emptyFlag = true;

    public synchronized void write(String message)  {
        while (!emptyFlag) {
            /*try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } */
        }
        this.message = message;
        emptyFlag = false;
        //notifyAll();
    }


    public synchronized String read() throws InterruptedException {
        while (emptyFlag) {
            wait();
        }
        emptyFlag = true;
        notifyAll();
        return message;
    }

}


class WriterThread implements Runnable {

    private Message message;
    public WriterThread(Message msg) {
        this.message = msg;
    }

    @Override
    public void run() {
        String messages[] = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };

        for(int i=0; i< messages.length ; i++) {
            try {
                message.write(messages[i]);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        message.write("Finished");
    }
}

class ReaderThread implements Runnable {

    private Message message;
    public ReaderThread(Message message) {
        this.message = message;
    }
    @Override
    public void run() {
        try {
            for(String latestMessage = message.read(); !latestMessage.equals("Finished");
                    latestMessage = message.read()) {
                System.out.println(latestMessage);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
