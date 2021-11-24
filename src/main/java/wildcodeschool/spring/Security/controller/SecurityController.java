package wildcodeschool.spring.Security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SecurityController {
    @RequestMapping
    @ResponseBody
    public String getShield() {
        return "Welcome to SHIELD!";
    }

    @RequestMapping("avengers/assemble")
    @ResponseBody
    public String assemble() {
        return "Avengers..... Assemble";
    }

    @RequestMapping("secret-bases")
    @ResponseBody
    public String secretBases() {
        return "Secret Bases: Amsterdam, Barcelona, Berlin, Brüssel, Bukarest, Lissabon, London, Madrid, Paris";
    }
}
