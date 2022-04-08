package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.dao.UserDao;
import web.model.User;
import web.service.UserSer;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserSer userService;


    @Autowired
    public UserController(UserSer userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getList());
        return "users/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        model.addAttribute("user",userService.getUser(id));
        return "users/show";
    }
    @GetMapping("/new")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "users/new";
    }
    @PostMapping()
    public String create(@ModelAttribute("user") User user){
        userService.add(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userService.getUser(id));
        return "users/edit";
    }
    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user,@PathVariable("id") int id){
        userService.update(user);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        userService.delete(id);
        return "redirect:/users";
    }
}
