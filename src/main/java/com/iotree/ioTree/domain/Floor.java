package com.iotree.ioTree.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("floors")
public class Floor {
    @Id
    private String id;
    private Long number;
    @DBRef
    private Collection<Room> rooms;
    @DBRef
    private House house;
}
