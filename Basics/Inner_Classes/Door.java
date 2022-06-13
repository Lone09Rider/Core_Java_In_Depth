package Inner_Classes;

public class Door {

	private Lock lock;

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}

	public Door() {
		lock = new Lock(true);
	}

	public void shopStatus() {
		if (lock.isLock()) {
			System.out.println("CLOSED");
		} else {
			System.out.println("WELCOME");
		}
	}

	class Lock {
		private boolean lock;

		public Lock(boolean lock) {
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}

	}

}
