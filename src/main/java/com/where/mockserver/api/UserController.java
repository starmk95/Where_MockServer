package com.where.mockserver.api;

import com.where.mockserver.repository.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/api")
/*
@GetMapping은 메소드에만 적용됨, 클래스 레벨에는 적용 불가
@GetMapping은 @RequestMapping(method = RequestMethod.GET)의 단축어라고 생각하면 된다.
@RequestMapping을 하면서 GET 요청을 받는 작업을 간단하게 표기하기위해 @GetMapping 어노테이션이 등장한 것이다.

 */
public class UserController {

    @GetMapping("/user/{id}")
    public ResponseEntity<User> queryId(@PathVariable("id") long id) {
        if (id == 1) {
            User user1 = new User("1", "김민규");
            return ResponseEntity.ok(user1);
        } else if (id == 2) {
            User user1 = new User("2", "김용재");
            return ResponseEntity.ok(user1);
        } else if (id == 3) {
            User user1 = new User("3", "이태강");
            return ResponseEntity.ok(user1);
        } else if (id == 4) {
            User user1 = new User("4", "김보겸");
            return ResponseEntity.ok(user1);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
