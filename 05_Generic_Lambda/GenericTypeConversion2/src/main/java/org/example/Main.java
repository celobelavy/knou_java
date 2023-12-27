package org.example;
class Data<T> {
    private T t;
    public void set(T t) {this.t = t;}
    public T get() {return t;}
}
public class Main {
    public static void main(String[] args) {
        //Data <Number> data1 = new Data<Integer>(); Compile Error
        Data<Number> data1 = new Data<Number> ();
        data1.set(10);
    }
}