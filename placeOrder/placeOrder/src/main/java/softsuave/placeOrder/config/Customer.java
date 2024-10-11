package softsuave.placeOrder.config;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {


    private int customerId;

    private String customerName;

    private String email;


    private String address;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate=new Date();


    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDate;

    private boolean isActive;

    private String password;

    private String  role;





    public Customer(int id, String password, String customerName) {
        this.password = password;
        this.customerName = customerName;
    }

    public Customer(String customerName, String email, String address, boolean isActive, String password, String role) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
        this.isActive = isActive;
        this.password = password;
        this.role=role;
    }
    public Customer(int customerId,String customerName, String email, String address, boolean isActive, String password, String role) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
        this.isActive = isActive;
        this.password = password;
        this.role=role;
    }


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomerRequestDto {


        private int id;
        private String name;
        private String email;
        private String address;
        private Date creationDate;
        private Date lastUpdatedDate;
        private boolean isActive=true;
        private String role;
        private String password;

        public CustomerRequestDto(String name, String password) {
            this.name = name;
            this.password = password;
        }

        public CustomerRequestDto(int id, String name, String email, String address, boolean isActive, String password,String role) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.address = address;
            this.isActive = isActive;
            this.password = password;
            this.role = role;
        }

    }
}


