package org.aptech.t2109e.springdemo.mapper;

import org.aptech.t2109e.springdemo.dto.ProductDto;
import org.aptech.t2109e.springdemo.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = "spring")
public interface productMapper {
    Product DtoToEntity(ProductDto productDto);

    ProductDto EntityToDto(Product product);
}
