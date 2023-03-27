import rx.Observer;

public class SimpleObserver implements Observer<String>{

	@Override
	public void onCompleted() {
		System.out.println("Job is done");
	}

	@Override
	public void onError(Throwable arg0) {
		System.out.println("Oops, Error!");
	}

	@Override
	public void onNext(String text) {
		System.out.println("I observed: "+ text);
	}
}
