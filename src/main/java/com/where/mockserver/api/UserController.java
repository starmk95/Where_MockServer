package com.where.mockserver.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController// Spring Controller에 @ResponseBody(View를 거치지 않고 http의 body에 직접 반환)가 추가된 것
/*
@ResponseBody : View를 거치지 않고(ViewResolver를 거치지 않음) 바로 HTTP의 body에 데이터를 넣어서 내려줌
만약 객체를 반환하면 해당 객체를 JSON 으로 변환해서 내려준다.
 */
@CrossOrigin // CORS 설정을 위한 어노테이션, 메소드에도 붙일 수 있다. (이 경우는 클래스 전체에 적용됨)
/*
CORS : Cross-Origin resource Sharing
원래는 Same-Origin Policy라고 동일한 도메인으로만 HTTP 요청을 받을 수 있다.
이와 달리 웹 페이지의 제한된 리소스를 외부 도메인에서도 접근할 수 있게 허용해주는 메커니즘이 바로 CORS이다.
 */
@RequiredArgsConstructor // Lombok에서 제공되는 어노테이션이다. (final이나 @NonNull인 필드 값만 파라미터로 받는 생성자를 만들어준다.
/*
아래 3개는 Lombok에서 제공하는 생성자를 만들어주는 어노테이션이다.
@NoArgsConstructor : 파라미터가 없는기본 생성자를 생성해준다.
@AllArgsConstructor : 모든 필드 값을 파라미터로 받는 생성자를 생성해준다.
@RequiredArgsConstructor : final 또는 @NonNull 처리된 필드 값만을 파라미터로 받는 생성자를 생성해준다.
 */

public class UserController {

    @GetMapping("/user/{id}")
    public ResponseEntity<String> queryId(@PathVariable("id") long id) {
        if (id == 1) {
            return ResponseEntity.ok("{'id : 1, 'name' : '김민규'}");
        } else if (id == 2) {
            return ResponseEntity.ok("{'id : 2, 'name' : '김용재'}");
        } else if (id == 3) {
            return ResponseEntity.ok("{'id : 3, 'name' : '이태강'}");
        } else if (id == 4) {
            return ResponseEntity.ok("{'id : 4, 'name' : '김보겸'}");
        }
        return ResponseEntity.notFound().build();
    }


}
