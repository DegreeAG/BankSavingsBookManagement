package Constant;

public enum CustomerType {

    CN("Cá Nhân"),
    TT("Tập Thể"),
    DN("Doanh Ngiệp");

    public String value;

    public String getValue() {
        return value;
    }

    CustomerType(String value) {
        this.value = value;
    }
}
