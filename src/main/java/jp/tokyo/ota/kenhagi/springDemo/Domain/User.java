package jp.tokyo.ota.kenhagi.springDemo.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private String uid;
    private String cid;
    private String name;
    private String companyName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
