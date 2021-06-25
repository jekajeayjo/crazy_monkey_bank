package md.monkeyBank.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AccountDto {
    private Integer id;
    private  String acc;
    private BigDecimal balance;
    private String valute;
    private  String account_type;
    private LocalDateTime oper_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getValute() {
        return valute;
    }

    public void setValute(String valute) {
        this.valute = valute;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public LocalDateTime getOper_time() {
        return oper_time;
    }

    public void setOper_time(LocalDateTime oper_time) {
        this.oper_time = oper_time;
    }
}
