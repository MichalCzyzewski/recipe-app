package pl.mczyzewski.recipeapp.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class UnitOfMeasure {
    public Long getiD() {
        return iD;
    }

    public void setiD(Long iD) {
        this.iD = iD;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iD;
    private String description;
}
