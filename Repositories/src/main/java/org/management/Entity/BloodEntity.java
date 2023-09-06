package org.management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class BloodEntity
{
    @Id
    private Integer BloodID;
    private String BloodGroup;
    private Long Quantity;
    private Boolean DonationStatus;
}
