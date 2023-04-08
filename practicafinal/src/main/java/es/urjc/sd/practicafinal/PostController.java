package es.urjc.sd.practicafinal;

import java.net.URI;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller

public class PostController {
   @Autowired
   private PostService posts;

    @GetMapping("/entradas/mostrar")
    public String getPosts(Model model) {
         model.addAttribute("posts", posts.findAll());
         return "entradas";
    }


   /*
    * @PostMapping("/entradas.html?")
    * public void createPost(Model model, @RequestBody Post post){
    * 
    * /*model.addAttribute("posts", posts.findAll());
    * URI location =
    * ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand
    * (post.getId()).toUri();
    * ResponseEntity.created(location).body(post);
    * return "entradas.html";
    * this.posts.save(post);
    * 
    * }
    */
   @PostMapping("/entradas.html?")
   public String newPost(Post post) {
      posts.save(post);
      return "redirect:/entradas.html";
   }
   /*
    * @GetMapping("/{id}")
    * public ResponseEntity<Post> getPost(@PathVariable long id) {
    * Post post = posts.findById(id);
    * if (post != null) {
    * return ResponseEntity.ok(post);
    * } else {
    * return ResponseEntity.notFound().build();
    * 
    * }
    * }
    */

   /*
    * Otro intento de post
    * 
    * @RequestMapping(value = "/entradas.html",method = {RequestMethod.GET,
    * RequestMethod.POST})
    * public String addPost(Post post,ModelMap model){
    * model.addAttribute("name",post.getName());
    * model.addAttribute("email",post.getEmail());
    * model.addAttribute("tlf",post.getTlf());
    * model.addAttribute("numTickets",post.getNumTickets());
    * return "entradas.html";
    */

}
