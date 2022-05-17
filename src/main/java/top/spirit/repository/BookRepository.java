package top.spirit.repository;

import top.spirit.entity.Book;

import java.util.List;

public interface BookRepository {
    public List<Book> findAll();
}
