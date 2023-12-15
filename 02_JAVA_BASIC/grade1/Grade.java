class Grade {
    int e;      // 영어 성적을 위한 변수
    int m;      // 수학 성적을 위한 변수

    void input_grade(int a, int b) {
        // 성적을 입력받는 메소드
        e = a;
        m = b;
    }

    void output_grade() {
        System.out.println(e + m);
    }
}
