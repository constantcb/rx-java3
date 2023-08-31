package chapter.two;

import io.reactivex.rxjava3.core.Observable;

public class ObservableCreate {

    public static void main(String[] args) {
        Observable<String> source = Observable.create(emitter -> {
            emitter.onNext("Pony");
            emitter.onNext("Cavallo");
            emitter.onNext("Chicken");
            emitter.onComplete();
        });

        source.subscribe(System.out::println,System.out::println,System.out::println);
    }


}
