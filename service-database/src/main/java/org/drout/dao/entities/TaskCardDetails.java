package org.drout.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.drout.dao.entities.model.Cards;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;


@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class TaskCardDetails {
    @Id
    @GeneratedValue
    private Long cardId;
    @JdbcTypeCode(SqlTypes.JSON)
    private Cards actionCards;
}
