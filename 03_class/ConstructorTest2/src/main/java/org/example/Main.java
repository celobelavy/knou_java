// 컴파일 안 되는 이유
// CSub sub2 = new CSub(10); 에 대해서 처리할 CSub 생성자가 없음
// CSub sub1 = new CSub(); 에 대해서 처리할 CSuper 생성자가 없음

package org.example;
class CSuper {
    public CSuper(int a) {
        System.out.println("super argu");
    }

}

class CSub extends CSuper {
    public CSub() {
        System.out.println("sub non-argu");
        System.out.println("sub argu");
    }
}
public class Main {
    public static void main(String[] args) {
        CSub sub1 = new CSub();
        CSub sub2 = new CSub(10);
    }
}

