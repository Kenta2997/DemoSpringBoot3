package jp.tokyo.ota.kenhagi.springDemo.Domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class UserSelector {
    private String uid;
    private String cid;
    private String name;
    private List<String> cidList;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isDeleted;
}
