package md.monkeyBank.dto.account;

import java.util.List;

public class AccountAnswerDto {
    private  String status;
    private String message;
    private List<AccountDto> rows;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<AccountDto> getRows() {
        return rows;
    }

    public void setRows(List<AccountDto> rows) {
        this.rows = rows;
    }
}
