package org.example;

class TV {
    private int nSize = 0;
    public TV(int nNewSize) {nSize = nNewSize;}
    // 생성자, 이름이 클래스와 같고 반환 자료형이 정의되지 않았으므로 생성자
}
public class Main {
    public static void main(String[] args) {
        TV tv = new TV(10); // 이때 생성자가 호출 되고 객체가 초기화 된다.
    }
}