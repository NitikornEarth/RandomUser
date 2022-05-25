package org.example.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.example.entity.Book;
import org.exemple.data.BookDto;

import java.util.List;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mappings({
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="price", source="price")
    })
    BookDto bookToBookDto(Book book);

    @Mappings({
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="price", source="price")
    })
    Book bookDtoToBook(BookDto bookDto);

    @Mappings({
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="price", source="price")
    })
    List<BookDto> bookListToBookDtoList(List<Book> bookList);

    List<Book> BookDtoListTobookList(List<BookDto> BookDtoList);
}
