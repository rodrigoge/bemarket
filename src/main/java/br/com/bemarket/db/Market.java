package br.com.bemarket.db;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.OffsetDateTime;

@Entity
@Table(name = "market")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Market {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank(message = "Name is required")
    private String name;

    @Column(name = "opening_time")
    @NotNull(message = "Opening time is required")
    private OffsetDateTime openingTime;

    @Column(name = "closing_time")
    @NotNull(message = "Closing time is required")
    private OffsetDateTime closingTime;

    @Column(name = "phone_number")
    @Size(min = 15, max = 15, message = "Length invalid for phone number")
    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    @Column(name = "mobile_number")
    @Size(min = 15, max = 15, message = "Length invalid for mobile number")
    @NotBlank(message = "Mobile number is required")
    private String mobileNumber;
}
