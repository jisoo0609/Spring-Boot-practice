package aca.likelion.simpleweb.dto;

public class SumRequest {
    private Long num1;
    private Long num2;

    // 잭슨 직렬화를 위해 기본 생성자 추가
    public SumRequest() {
    }

    public SumRequest(Long num1, Long num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Long getNum1() {
        return num1;
    }

    public Long getNum2() {
        return num2;
    }
}
