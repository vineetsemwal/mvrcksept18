package com.example.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceImpl {

    @Autowired
    private EntityManager entityManager;
    @Autowired
    private ITraineeRepository repo;



    Trainee addTrainee(String name, String dept, LocalDate birthDate) throws Exception {
        Trainee trainee = new Trainee(name, dept, birthDate);
        repo.save(trainee);
        return trainee;
    }

    public List<Trainee> fetchTraineesByName(String name, LocalDate startDate, LocalDate endDate) {
        CriteriaBuilder criteriaBuilder =entityManager.getCriteriaBuilder();
        CriteriaQuery<Trainee> query = criteriaBuilder.createQuery(Trainee.class);
        Root<Trainee> root = query.from(Trainee.class);
        query.where(
                criteriaBuilder.equal(root.get("name").as(String.class), name),
                criteriaBuilder.between(root.get("birthDate").as(LocalDate.class),startDate,endDate)
        );

        TypedQuery<Trainee> typedQuery = entityManager.createQuery(query);
        List<Trainee> list = typedQuery.getResultList();
        return list;
    }
}
