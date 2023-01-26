package data;

import io.qameta.allure.Step;

public class PairCertificat {
    private String cerNumber;
//@Step("step getNUMBER")
    public String getCerNumber() {
        return cerNumber;
    }

    public boolean isAnswer() {
        return answer;
    }

    private boolean answer;

    public PairCertificat(String cerNumber, boolean answer) {
        this.cerNumber = cerNumber;
        this.answer = answer;
    }

}
