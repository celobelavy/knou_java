package org.example;
class Data<T> {
    private T t;
    public Data(T t) {this.t = t;}
    public void set(T t) {this.t = t;}
    public T get() {return t;}
}
public class Main {
    public static void main(String[] args) {
        Data<String> data = new Data<>("hello");
        //Data data = new Data("hello");
        System.out.println(data.get());
    }
}

//Raw 타입 사용은 추천하지 않음