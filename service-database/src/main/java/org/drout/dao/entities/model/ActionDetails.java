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
public class ActionDetails implements Serializable {
    String time ;
    String actionDetails;
    List<String> actions;
}
