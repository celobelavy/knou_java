public class Main {
    public static void main(String[] args) {
        Grade g1, g2;       // 두 명의 실제 성적을 표현하는 객체
        g1 = new Grade();
        g2 = new Grade();
        g1.e = 90; g1.m = 85;
        g2.e = 80; g2.m = 80;

        g1.output_grade();
        g2.output_grade();
    }
}

