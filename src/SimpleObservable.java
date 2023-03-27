import java.util.Arrays;
import java.util.List;

import rx.Observable;

public class SimpleObservable {

	public static void main(String[] args) {
		List<String> topics = Arrays.asList("Haddop DFS", 
				"NoSQL Database", "Map Reduce", "Web services", 
				"Actors", "ReactiveX");
		Observable<String> topicTitle = Observable.from(topics);
		topicTitle.subscribe(new SimpleObserver());
	}
}
