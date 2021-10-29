package com.wangzhi.service;

import com.wangzhi.dao.BooksMapper;
import com.wangzhi.pojo.Books;

import java.util.List;

/**
 * 实现类
 * @author 王志
 * @date 2021/10/29 16:04
 */
public class BookServiceImpl implements BookService {
    //service调用dao层
    @SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
    private BooksMapper booksMapper;


    @Override
    public void insertBook(Books books) {
        booksMapper.insertBook(books);
    }

    @Override
    public void updateBook(Books books) {
        booksMapper.updateBook(books);
    }

    @Override
    public void deleteBook(int bookID) {
        booksMapper.deleteBook(bookID);
    }

    @Override
    public Books queryBookById(int bookID) {
        return booksMapper.queryBookById(bookID);
    }

    @Override
    public List<Books> queryBooks() {
        return booksMapper.queryBooks();
    }
}
