package org.management.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table

public class ManagementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String name;
    private String password;
    private String Date_Of_Birth;
    private String Occupation;
    private String Age;
    private String Address;
    private String Roles;
    }
/*   private static ManagementEntity ID = null;

    private ManagementEntity() {

    }

    public static ManagementEntity getInstance() {
        if (ID == null) {
            ID = new ManagementEntity();
        }
        return ID;
    }
}*/

