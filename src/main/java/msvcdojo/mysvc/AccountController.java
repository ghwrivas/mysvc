package msvcdojo.mysvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/accounts")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNew (@RequestParam String name) {

        Account n = new Account(name);
        accountRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Account> getAll() {
        return accountRepository.findAll();
    }
}