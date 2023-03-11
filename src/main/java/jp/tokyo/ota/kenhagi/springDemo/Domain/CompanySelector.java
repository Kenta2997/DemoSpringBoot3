package jp.tokyo.ota.kenhagi.springDemo.Domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class CompanySelector {
    private String cid;
    private String name;
    private Date contractUntil;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
