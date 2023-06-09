package Join;

import java.util.Objects;

public class JoinVO {
    private String id;
    private String password;
    private String name;
    private String birthDate;
    private String phonenumber;
    private String email;
    private String address;
    private int loansnumber;

    public JoinVO() {
    }

    public JoinVO(String id, String name, String birthDate, String phonenumber, String email, String address, int loansnumber) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
        this.loansnumber = loansnumber;
    }

    public JoinVO(String id, String password, String name, String birthDate, String phonenumber, String email, String address, int loansnumber) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
        this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
        this.loansnumber = loansnumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLoansnumber() {
        return loansnumber;
    }

    public void setLoansnumber(int loansnumber) {
        this.loansnumber = loansnumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JoinVO)) {
            return false;
        }
        JoinVO other = (JoinVO) obj;
        return Objects.equals(this.id, other.id) &&
                Objects.equals(this.password, other.password) &&
                Objects.equals(this.name, other.name) &&
                Objects.equals(this.birthDate, other.birthDate) &&
                Objects.equals(this.phonenumber, other.phonenumber) &&
                Objects.equals(this.email, other.email) &&
                Objects.equals(this.address, other.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, name, birthDate, phonenumber, email, address);
    }

    @Override
    public String toString() {
        String str = String.format("아이디:%s 이름:%s 생일:%s 번호:%s 이메일:%s 주소:%s n",
                id, name, birthDate.substring(5,10), phonenumber, email, address);
        return str;

    }

}

