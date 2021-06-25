package md.monkeyBank.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ACCOUNT")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "ACC")
    private String acc;
    @ManyToOne
    @JoinColumn(name = "BANK_ID")
    private BankEntity bankEntity;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserEntity userEntity;
    @ManyToOne
    @JoinColumn(name = "VALUTE_ID")
    private ValuteEntity valuteEntity;
    @ManyToOne
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    private AccountTypeEntity accountTypeEntity;
    @Column(name = "BALANCE")
    private BigDecimal balance;

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

    public BankEntity getBankEntity() {
        return bankEntity;
    }

    public void setBankEntity(BankEntity bankEntity) {
        this.bankEntity = bankEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public ValuteEntity getValuteEntity() {
        return valuteEntity;
    }

    public void setValuteEntity(ValuteEntity valuteEntity) {
        this.valuteEntity = valuteEntity;
    }

    public AccountTypeEntity getAccountTypeEntity() {
        return accountTypeEntity;
    }

    public void setAccountTypeEntity(AccountTypeEntity accountTypeEntity) {
        this.accountTypeEntity = accountTypeEntity;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
