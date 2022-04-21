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
@Document("houses")
public class House {
    @Id
    private String id;
    private String name;
    private String address;
    @DBRef(lazy = true)
    private Collection<Floor> floors;
    @DBRef
    private AppUser user;
}
