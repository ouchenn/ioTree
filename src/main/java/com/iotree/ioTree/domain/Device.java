package com.iotree.ioTree.domain;

import com.iotree.ioTree.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("devices")
public class Device {
    @Id
    private String id;
    private Status status;
    private String name;
    @DBRef
    private Room room;
}