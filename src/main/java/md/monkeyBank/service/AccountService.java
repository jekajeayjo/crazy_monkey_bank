package md.monkeyBank.service;

import javassist.NotFoundException;
import md.monkeyBank.dto.account.AccountAnswerDto;

public interface AccountService {
     AccountAnswerDto getAccountList(Integer id) throws NotFoundException;
}
