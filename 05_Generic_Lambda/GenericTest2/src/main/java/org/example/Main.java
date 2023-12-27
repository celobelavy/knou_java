package org.example;
class Data<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
}
public class Main {
    public static void main(String[] args) {
        Data <String> data = new Data <String> ();
        //Integer i = new Integer(20);
        Integer i = 20;
        //data.set(i);
        data.set(String.valueOf(i));
        String s = (String) data.get();
    }
}