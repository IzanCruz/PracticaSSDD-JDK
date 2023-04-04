package es.urjc.sd.practicafinal;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class PostController {
@Autowired
private PostService posts;
@GetMapping("?")
public Collection<Post> getPosts() {
return posts.findAll();
}
/*@GetMapping("/{id}")
public ResponseEntity<Post> getPost(@PathVariable long id) {
Post post = posts.findById(id);
if (post != null) {
return ResponseEntity.ok(post);
} else {
return ResponseEntity.notFound().build();
}
}*/
}
