class Q{
	int count;
	boolean isSet = false;

	public synchronized void getCount() {
		while(!isSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get : "+count);
		isSet = false;
		notify();
	}

	public synchronized void setCount(int count) {
		while(isSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Put : "+count);
		this.count = count;
		isSet = true;
		notify();
	}
}


class Producer extends Thread{
	Q q;
	int i = 0;

	public Producer(Q q) {
		super();
		this.q = q;
	}
	
	public void run() {
		while(true) {
			q.setCount(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Consumer extends Thread{
	Q q;

	public Consumer(Q q) {
		super();
		this.q = q;
	}
	
	public void run() {
		while(true) {
			q.getCount();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}


public class ProducerConsumerThread {
	
	public static void main(String args[]) {
		Q q = new Q();
		Producer producer = new Producer(q);
		Consumer consumer = new Consumer(q);
		producer.start();
		consumer.start();
	}
}
