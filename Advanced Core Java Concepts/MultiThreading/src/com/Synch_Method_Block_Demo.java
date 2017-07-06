package com;

class DesktopMonitor {

	public synchronized void doWork() {

	}

}

class IPAD {

	DesktopMonitor monitor = new DesktopMonitor();

	public void doWorkWithIPAD() {

		synchronized (monitor) {
			// Monitor Obj locked for Main Thread, till this block
		}
	}

}

public class Synch_Method_Block_Demo {

	public static void main(String[] args) {

		DesktopMonitor monitor = new DesktopMonitor();
		// Monitor Object Locked for Main Thread till 'doWork()' behav
		monitor.doWork();

		IPAD ipad = new IPAD();
		ipad.doWorkWithIPAD();

	}

}
