package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends PagingAndSortingRepository<Blog, Integer> {
    @Query(value = "select * from blog as b join category as c on b.category_id = c.category_id where category_id like :categoryId", nativeQuery = true)
    List<Blog> findByCategory(@Param("categoryId") String category, PageRequest pageRequest);
    List<Blog> findAllByTitle(String title, PageRequest pageRequest);
}
