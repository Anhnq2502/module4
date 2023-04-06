package com.example.book_management.service.impl;

import com.example.book_management.common.InvalidCodeException;
import com.example.book_management.common.OutOfBookException;
import com.example.book_management.model.Book;
import com.example.book_management.model.Borrower;
import com.example.book_management.repository.IBookRepository;
import com.example.book_management.repository.IBorrowerRepository;
import com.example.book_management.service.IBookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    private final
    IBookRepository bookRepository;

    private final
    IBorrowerRepository borrowerRepository;

    public BookService(IBookRepository bookRepository, IBorrowerRepository borrowerRepository) {
        this.bookRepository = bookRepository;
        this.borrowerRepository = borrowerRepository;
    }

    @Override
    public List<Book> findAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public boolean borrowerBook(Borrower borrower) throws OutOfBookException {
        Book book = bookRepository.findById(borrower.getBook().getId()).orElse(null);
        if (book == null) {
            return false;
        }
        if (book.getQuantity() <= 0) {
            throw new OutOfBookException("Số lượng sách đã hết");
        }
        book.setQuantity(book.getQuantity() - 1);
        bookRepository.save(book);
        borrowerRepository.save(borrower);
        return true;
    }

    @Override
    public boolean returnBook(String code) throws InvalidCodeException {
        Borrower borrower = borrowerRepository.findByCode(code);
        if (borrower == null) {
            throw new InvalidCodeException("Mã mượn sách không hợp lệ");
        }

        Book book = bookRepository.findById(borrower.getBook().getId()).orElse(null);
        if (book == null) {
            return false;
        }

        book.setQuantity(book.getQuantity() + 1);
        bookRepository.save(book);
        borrowerRepository.deleteById(borrower.getId());
        return true;
    }
}