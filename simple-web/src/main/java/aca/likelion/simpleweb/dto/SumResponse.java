package aca.likelion.simpleweb.dto;

public class SumResponse {
    private Long sum;

    // Spring에서 RestController를 사용할때 dto 넣을 수 있음
    // 모양 그대로 JSON으로 바꿔줌

    // Spring에서 채택하는 json 직렬화 라이브러리는 Jackson
    // 리플렉션 : 자바 클래스나 메서드 등의 코드들의 메타정보를 다루는 API
    // reflection 사용하고 기본 생성자를 호출해서 객체를 생성
    public SumResponse() {

    }

    public SumResponse(Long sum) {
        this.sum = sum;
    }

    public Long getSum() {
        return sum;
    }
}
