package EConcurrency.Sync.AsyncResult;

public interface MyFuture<V> {
    V get() throws Exception ;
}
