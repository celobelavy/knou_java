package org.example;
class Data<T> {
    private T t;
    public void set(T t) {this.t = t;}
    public T get() {return t;}
}
public class Main {
    public static void main(String[] args) {
        Data <Number> data = new Data <Number>();
        data.set(10);
        data.set(10.1);
        //data.set(new Integer(10));
        //data.set(new Double(10.1));

    }
}