package com.sample.core.domain.rdb.entity.date;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
public class BaseDateTime {
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "DATE")
    private LocalDateTime createDateTime;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false, columnDefinition = "DATE")
    private LocalDateTime updateDateTime;
}
