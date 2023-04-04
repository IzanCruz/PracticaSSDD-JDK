package es.urjc.sd.practicafinal;

import java.net.URI;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
@RestController
@RequestMapping("")
public class PostController {
@Autowired
private PostService posts;
@GetMapping("por determinar")
public Collection<Post> getPosts1() {
return posts.findAll();
}

//Devuelve javascript en vez de la página 
/*@GetMapping("/entradas.html")
public Collection<Post> getPosts2() {
return posts.findAll();
}*/

@PostMapping("/entradas.html")
public String createPost(Model model,@RequestBody Post post){
   posts.save(post);
   URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.getId()).toUri();
   ResponseEntity.created(location).body(post);
   return "entradas";
    
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
