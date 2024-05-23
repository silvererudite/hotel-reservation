package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    String firstName;
    String lastName;
    String email;

    public Customer(String firstName, String lastName, String email) throws Exception {


            Pattern emailPattern = Pattern.compile("(.+)@(.+).(.+)$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = emailPattern.matcher(email);
            boolean matchFound = matcher.find();
            if(matchFound) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;
            }else{
                throw new Exception("IllegalArgumentException");
        }

    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
