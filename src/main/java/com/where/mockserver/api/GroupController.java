package com.where.mockserver.api;

import com.where.mockserver.repository.Group;
import com.where.mockserver.repository.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/group")
@RestController
@CrossOrigin
public class GroupController {

    @GetMapping("/{groupId}")
    public ResponseEntity<Group> queryGroup(@PathVariable("groupId") long id) {
        if (id == 1) {
            User user1 = new User("1", "김민규");
            User user2 = new User("2", "김용재");
            User user3 = new User("3", "김보겸");
            User user4 = new User("4", "이태강");
            Group group1 = new Group(user1);
            group1.addUser(user2);
            group1.addUser(user3);
            group1.addUser(user4);
            return ResponseEntity.ok(group1);
        } else if (id == 2) {
            User user1 = new User("1", "김민규");
            User user4 = new User("4", "이태강");
            Group group2 = new Group(user4);
            group2.addUser(user1);
            return ResponseEntity.ok(group2);
        } else if (id == 3) {
            User user2 = new User("2", "김용재");
            User user3 = new User("3", "김보겸");
            User user4 = new User("4", "이태강");
            Group group3 = new Group(user3);
            group3.addUser(user2);
            group3.addUser(user4);
            return ResponseEntity.ok(group3);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/inviteCode/{groupId}")
    public ResponseEntity<String> queryInviteCode(@PathVariable("groupId") long id) {
        if (id == 1) {
            User user = new User("1", "김민규");
            Group group = new Group(user);
            return ResponseEntity.ok(group.getInviteLink());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
