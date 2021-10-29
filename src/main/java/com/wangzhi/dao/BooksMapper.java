package com.wangzhi.dao;

import com.wangzhi.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author 王志
 * @date 2021/10/29 15:42
 */
@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaCommentsMustBeJavadocFormat"})
public interface BooksMapper {

    //增加书籍
    void insertBook(Books books);

    //修改书籍信息
    void updateBook(Books books);

    //删除书籍信息
    void deleteBook(@Param("bookID") int bookID);

    //根据id查询书籍信息
    Books queryBookById(@Param("bookID") int bookID);

    //查询全部书籍信息
    List<Books> queryBooks();
}
