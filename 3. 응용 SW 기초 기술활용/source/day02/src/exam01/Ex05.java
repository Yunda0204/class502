package exam01;

public class Ex05 {
    public static void main(String[] args) {
        int total = 0, num = 0; // 초기값

        while (num <= 100) { //조건식 - 반복을 멈추는 조건
            total += num;
            num++; // 증감식
        }
        System.out.println("합계 : " + total);
        System.out.println("합계 : " + num);
    }
}
