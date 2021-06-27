package md.monkeyBank.controller;

import javassist.NotFoundException;
import md.monkeyBank.dto.account.AccountAnswerDto;
import md.monkeyBank.service.AccountService;
import md.monkeyBank.service.CostumMessage;
import md.monkeyBank.service.impl.AccountsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.LinkedCaseInsensitiveMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(AccountController.URL_PREFIX)
public class AccountController {
    public static final String URL_PREFIX = "/account";
    public static final String LIST_BY_ID = "/list/{id}";

    private final  AccountService accountService;

    @Autowired
    public AccountController(@Qualifier("accountServiceMsSql")AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(method = RequestMethod.GET, value = LIST_BY_ID)
    public AccountAnswerDto getAccountById(@PathVariable Integer id) throws NotFoundException {
        AccountAnswerDto answerDto=null;
        try {
            answerDto=accountService.getAccountList(id);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            answerDto=new AccountAnswerDto();
            answerDto.setStatus("ERROR");
            answerDto.setMessage(CostumMessage.GLOBAL_ERROR.toString());
        }
        return answerDto;
    }
}
