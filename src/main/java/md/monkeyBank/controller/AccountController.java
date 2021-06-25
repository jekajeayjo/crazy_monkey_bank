package md.monkeyBank.controller;

import md.monkeyBank.service.AccountsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedCaseInsensitiveMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(AccountController.URL_PREFIX)
public class AccountController {
    public static final String URL_PREFIX="/account";
    public static final String LIST_BY_ID="/list/{id}";

    AccountsServiceImpl accountsService;
@Autowired
    public void setAccountsService(AccountsServiceImpl accountsService) {
        this.accountsService = accountsService;
    }

    @RequestMapping(method = RequestMethod.GET,value = LIST_BY_ID)
    List<LinkedCaseInsensitiveMap> getAccountById(@PathVariable Integer id)
    {
       return  accountsService. getAccountList(id);
    }
}
