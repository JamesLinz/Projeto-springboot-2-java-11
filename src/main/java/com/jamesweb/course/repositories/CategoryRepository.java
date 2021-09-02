package com.jamesweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamesweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
