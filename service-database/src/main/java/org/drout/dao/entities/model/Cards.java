package org.drout.dao.entities.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Cards implements Serializable {
    String name;
    List<Tag> tags;
    Boolean status;
    ActionDetails taskDetails;
}
